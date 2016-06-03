package openconnector;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.tecsys.meta.wsclient.MetaMdUserWebserviceBc;
import com.tecsys.meta.wsclient.MetaWebServiceProxy;
import com.tecsys.meta.wsclient.MetaWsSearchRequest;
import com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria;
import com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc;
import com.tecsys.meta.wsclient.MetaWsSearchResponse;
import com.tecsys.meta.wsclient.MetaWsUpdateRequest;
import com.tecsys.meta.wsclient.MetaWsUpdateResponse;
import com.tecsys.meta.wsclient.MetaWsUpdateTransactionRequest;
import com.tecsys.meta.wsclient.MetaWsUpdateTransactionResponse;

import openconnector.AbstractConnector;
import openconnector.ConnectorException;
import openconnector.Filter;
import openconnector.ObjectNotFoundException;
import openconnector.Schema;
import openconnector.Schema.Type;

public class SPSElite extends AbstractConnector{

	private final static Logger spsEliteLog = Logger.getLogger("spselite_connector");

	/* ------------------------- -------------------------  SPSElite Attributes  ------------------------- ------------------------- */
	public static final String ATTR_USERNAME = "userName";
	public static final String ATTR_FIRSTNAME = "firstName";
	public static final String ATTR_LASTNAME = "lastName";
	public static final String ATTR_EMAIL = "emailAddress";
	public static final String ATTR_ISACTIVE = "isActive";

	/* ------------------------- -------------------------  Connection Attributes  ------------------------- ------------------------- */
	public static final String CONFIG_USERNAME = "spseliteuser";
	public static final String CONFIG_PASSWORD = "spselitepassword";
	public static final String CONFIG_HOST = "host";

	private String host;
	private String spseliteuser;
	private String spselitepassword;

	private Map<String, MetaMdUserWebserviceBc> usersList = null;
	private MetaWebServiceProxy spsEliteProxy = null;
	
	private String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	private String getSpseliteuser() {
		return spseliteuser;
	}

	public void setSpseliteuser(String spseliteuser) {
		this.spseliteuser = spseliteuser;
	}

	private String getSpselitepassword() {
		return spselitepassword;
	}

	public void setSpselitepassword(String spselitepassword) {
		this.spselitepassword = spselitepassword;
	}

	private Map<String, MetaMdUserWebserviceBc> getUsersList() {
		return usersList;
	}
	
	private void setUsersList(Map<String, MetaMdUserWebserviceBc> usersList){
		this.usersList = usersList;
	}

	private MetaWebServiceProxy getSpsEliteProxy() {
		return spsEliteProxy;
	}

	private void setSpsEliteProxy(MetaWebServiceProxy spsEliteProxy) {
		this.spsEliteProxy = spsEliteProxy;
	}

	/* ------------------------- -------------------------  IIQ Methods  ------------------------- ------------------------- */
    
	public SPSElite() {
		super();
		initialize();
		spsEliteLog.debug("Initializing a new object..."); 
	}
    
    private void initialize(){
		setSpsEliteProxy(new MetaWebServiceProxy());
		setUsersList(new HashMap<String, MetaMdUserWebserviceBc>());
		spsEliteLog.setLevel(Level.DEBUG);
    }
	
	@Override
	public void testConnection(){
		spsEliteLog.debug("Testing the connection...");
		try{
			spsEliteLog.debug("Found the user: " + search("", 1)[0].getUserName());
		}
		catch(Exception e){
			spsEliteLog.error(traceToString(e));
			throw new ConnectorException("Connection failed\n " + traceToString(e));
		}
	}
	
	@Override
	public Schema discoverSchema() throws ConnectorException ,UnsupportedOperationException {
		Schema schema = new Schema();
		
		spsEliteLog.debug("Discovering the schema for the type = " + this.objectType);
		
		if(OBJECT_TYPE_ACCOUNT.equals(this.objectType)){
			schema.setObjectType("account");
			schema.setNativeObjectType("account");
			schema.setIdentityAttribute(ATTR_USERNAME);

			schema.addAttribute(ATTR_USERNAME, Type.STRING);
			schema.addAttribute(ATTR_FIRSTNAME, Type.STRING);
			schema.addAttribute(ATTR_LASTNAME, Type.STRING);
			schema.addAttribute(ATTR_EMAIL, Type.STRING);
			schema.addAttribute(ATTR_ISACTIVE, Type.STRING);
		}
		return schema;
	}

	@Override
	public Iterator<Map<String, Object>> iterate(Filter arg0) throws ConnectorException, UnsupportedOperationException {
		spsEliteLog.debug("Iterating thru the data ");
		
		Iterator<Map<String,Object>> iterator = null;
		
		try {
			Map<String, Map<String, Object>> accounts = new HashMap<String,Map<String, Object>>();
			
			if(loadUsers()){
				spsEliteLog.debug("The users were loaded successfully!");
				List<String> usersName = getUserNames();
				for(String username : usersName){
					accounts.put(username, read(username));
				}
				iterator = new ArrayList<Map<String,Object>>(accounts.values()).iterator();	
			}
			else{
				spsEliteLog.debug("Errors were found when loading the users");
				iterator = new ArrayList<Map<String,Object>>().iterator();
			}
			
		} catch (Exception e) {
			spsEliteLog.error(traceToString(e));
		}
		return iterator;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map<String, Object> read(String username)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		//spsEliteLog.warn("Creating the map for the username " + username);
		
		Map<String, Object> userMap = new HashMap<String, Object>();
		
		try {
			MetaMdUserWebserviceBc user = getUsersList() != null && !getUsersList().isEmpty() ? getUsersList().get(username) : getUser(username);
			
			if(user != null){
				List<Field> userProperties = new ArrayList<Field>(Arrays.asList(user.getClass().getFields()));
		      	
		      	Class userClass = MetaMdUserWebserviceBc.class;
		      	String name = null;
		      	Object value = null;

				for(Field property : userProperties){
					name = property.getName();
					value = userClass.getField(name).get(user);

					spsEliteLog.debug(name + " = " + value);
					
					if(value != null)
						userMap.put(name, value.toString());
					else
						userMap.put(name, "");
				}
				return userMap;
			}
			else{
				spsEliteLog.debug("User not found!!, read failed!");
			}
		} catch (Exception e) {
			spsEliteLog.error(traceToString(e));
		}
		return null;
	}
	
	@Override
	public Result create(String username, List<Item> attributes)
			throws ConnectorException, ObjectAlreadyExistsException, UnsupportedOperationException {
		spsEliteLog.debug("Creating the user = " + username);
		printItems(attributes);
		
		if(userExist(username)){
			spsEliteLog.debug("The user with the username: " + username + " already exists in the system" );
			return new Result(Result.Status.Failed);
		}
		
		MetaMdUserWebserviceBc user = createUserObj(username, attributes);
		if(user != null){
			log.debug("Attemping to create user in spselite...");
			createUpdate(user);
		}
		else{
			log.error("The object to create the user was null...");
			return new Result(Result.Status.Failed);
		}
		return new Result(Result.Status.Committed);
	}
	
	@Override
	public Result update(String username, List<Item> attributes) throws ConnectorException, ObjectNotFoundException,
			IllegalArgumentException, UnsupportedOperationException {
		spsEliteLog.debug("Updating the user = " + username);
		printItems(attributes);
		
		if(!userExist(username)){
			spsEliteLog.debug( "The user with the username: " + username + " does not exists in the system" );
			return new Result(Result.Status.Failed);
		}
		
		MetaMdUserWebserviceBc user = createUserObj(username, attributes);
		if(user != null)
			createUpdate(user);
		return new Result(Result.Status.Committed);
	}
	
	@Override
	public Result disable(String username, Map<String, Object> options)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		spsEliteLog.debug("Disabling the user = " + username);
		
		MetaMdUserWebserviceBc user = new  MetaMdUserWebserviceBc();
		user.setUserName(username);
		user.setIsActive("0");
		
		createUpdate(user);
		return new Result(Result.Status.Committed);
	}

	@Override
	public Result enable(String username, Map<String, Object> options)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		spsEliteLog.debug("Enabling the user = " + username);
		
		MetaMdUserWebserviceBc user = new  MetaMdUserWebserviceBc();
		user.setUserName(username);
		user.setIsActive("1");
		
		createUpdate(user);
		return new Result(Result.Status.Committed);
	}
	
	/* ------------------------- -------------------------  Webservice calls  ------------------------- ------------------------- */
	
	private boolean createUpdate(MetaMdUserWebserviceBc user){
		try{
			spsEliteLog.debug("Creating or updating an user..." + user.getUserName());
			
			setConnectionParameters();
			
			MetaMdUserWebserviceBc[] transactionData = new MetaMdUserWebserviceBc[]{ user };
			
			MetaWsUpdateTransactionRequest transactionRequest = new MetaWsUpdateTransactionRequest();
			transactionRequest.setData(transactionData);
			
			MetaWsUpdateRequest updateRequest = new MetaWsUpdateRequest();
			updateRequest.setUserName(getSpseliteuser());
			updateRequest.setPassword(getSpselitepassword());
			
			updateRequest.setTransactions(new MetaWsUpdateTransactionRequest[] { transactionRequest });
			
			MetaWsUpdateResponse response = getSpsEliteProxy().update(updateRequest);

			MetaWsUpdateTransactionResponse[] transactionsMade = response.getTransactions();
			
			boolean success = false;
			for(MetaWsUpdateTransactionResponse t : transactionsMade){
				spsEliteLog.debug("Code = " + t.getStatus().getCode());
				success = t.getStatus().getCode().equals("0");
			}
			spsEliteLog.debug("The create/update failed? " + Boolean.toString(success));
			return success;
		}
		catch(Exception e){
			spsEliteLog.error(traceToString(e));
			return false;
		}
	}
	
	private MetaMdUserWebserviceBc[] search(String username, int maxRows){
		MetaMdUserWebserviceBc[] users = null;
		
		try{
			setConnectionParameters();
			
			MetaWsSearchRequest searchRequest = new MetaWsSearchRequest();
			searchRequest.setUserName(getSpseliteuser());
			searchRequest.setPassword(getSpselitepassword());

			MetaWsSearchRequestCriteria criteria = new MetaWsSearchRequestCriteria();
			MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc userToSearch = new MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc();
			
			if(username != null && !username.isEmpty()){
				userToSearch.setUserName(username);
				searchRequest.setMaxRows(1);
			}
			else if(maxRows > 0)
				searchRequest.setMaxRows(maxRows);
			
			criteria.setMetaMdUserWebserviceBc(userToSearch);
			searchRequest.setCriteria(criteria);
			MetaWsSearchResponse searchResponse = getSpsEliteProxy().search(searchRequest);
			users = searchResponse.getResult();
		}
		catch(Exception e){
			spsEliteLog.error(traceToString(e));
		}
		return users;
	}

	/* ------------------------- -------------------------  Tools  ------------------------- ------------------------- */
	
	@SuppressWarnings("rawtypes")
	private MetaMdUserWebserviceBc createUserObj(String username, List<Item> attributes){
		try{
			spsEliteLog.debug("Creating the user object...");
			MetaMdUserWebserviceBc user = new  MetaMdUserWebserviceBc();
			user.setUserName(username);
			
	      	Class userClass = MetaMdUserWebserviceBc.class;
	      	String attributeName = null;
	      	
			for(Item attribute : attributes){
				attributeName = attribute.getName();
				userClass.getField(attributeName).set(user, attribute.getValue());
			}
			return user;
		}
		catch(Exception e){
			spsEliteLog.error(traceToString(e));
			return null;
		}
	}
	
	private boolean userExist (String username){		
		spsEliteLog.debug("Checking if the username: " + username + " exists");
		MetaMdUserWebserviceBc user = getUser(username);
		
		return user != null && user.getIsActive() != null && !user.getIsActive().isEmpty();
	}
	
	private List<String> getUserNames() {
		spsEliteLog.debug("Fetching usernames...");
		List<String> userNamesList = new ArrayList<String>();
		
		if(getUsersList() != null && !getUsersList().isEmpty()){
			for(Map.Entry<String, MetaMdUserWebserviceBc> user : getUsersList().entrySet()){
				userNamesList.add(user.getKey());
			}
		}
		
		return userNamesList;
	}
	
	private boolean loadUsers(){
		spsEliteLog.debug("Fetching users into the context...");
		MetaMdUserWebserviceBc[] users = search("", 0);
			
		if(users != null && users.length > 0)
			for(MetaMdUserWebserviceBc user : users)
				getUsersList().put(user.getUserName(), user);
		
		return users != null && users.length > 0;
	}
	
	private MetaMdUserWebserviceBc getUser(String username){
		MetaMdUserWebserviceBc[] searchResult = search(username, 0);
		
		if(searchResult != null && searchResult.length > 0 && searchResult[0] != null)
			return searchResult[0];
		else
			return null;
	}
	
	private void setConnectionParameters(){
		try{
			setHost(config.getString("host"));
			setSpseliteuser(config.getString("spseliteuser"));
			setSpselitepassword(config.getString("spselitepassword"));
			
			getSpsEliteProxy().setEndpoint(getHost());
		}
		catch(Exception e){
			spsEliteLog.error("The form is not loaded...\n" + traceToString(e));
		}
	}
	
	private void printItems(List<Item> attributes){
		spsEliteLog.debug("Values: ");
		for(Item attribute : attributes)
			spsEliteLog.debug(attribute.name + " = " + attribute.value.toString());
	}

	private String traceToString(Exception e){
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}

	@Override
	protected void finalize() throws Throwable{
		super.finalize();
	}

}
