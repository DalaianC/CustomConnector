package openconnector;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

import openconnector.AbstractConnector;
import openconnector.ConnectorException;
import openconnector.Filter;
import openconnector.ObjectNotFoundException;
import openconnector.Schema;
import openconnector.Schema.Type;

public class SPSElite extends AbstractConnector{

	private final static Logger log = Logger.getLogger(SPSElite.class);
	
	//Attributes of the SPSElite service
	public static final String ATTR_USERNAME = "userName";
	public static final String ATTR_FIRSTNAME = "firstName";
	public static final String ATTR_LASTNAME = "lastName";
	public static final String ATTR_EMAIL = "emailAddress";
	public static final String ATTR_ISACTIVE = "isActive";
	
	public static final String CONFIG_USERNAME = "spseliteuser";
	public static final String CONFIG_PASSWORD = "spselitepassword";
	public static final String CONFIG_HOST = "host";
	
	private String host;
	private String spseliteuser;
	private String spselitepassword;

	private Map<String, MetaMdUserWebserviceBc> usersList = null;
	private MetaWebServiceProxy spsEliteProxy = new MetaWebServiceProxy();
	
	private String getHost() {
		return host;
	}

	private void setHost(String host) {
		this.host = host;
	}

	private String getSpseliteuser() {
		return spseliteuser;
	}

	private void setSpseliteuser(String spseliteuser) {
		this.spseliteuser = spseliteuser;
	}

	private String getSpselitepassword() {
		return spselitepassword;
	}

	private void setSpselitepassword(String spselitepassword) {
		this.spselitepassword = spselitepassword;
	}

	private Map<String, MetaMdUserWebserviceBc> getUsersList() {
		return usersList;
	}

	private MetaWebServiceProxy getSpsEliteProxy() {
		return spsEliteProxy;
	}

	private void setSpsEliteProxy(MetaWebServiceProxy spsEliteProxy) {
		this.spsEliteProxy = spsEliteProxy;
	}
	
	public SPSElite() {
		super();
		setSpsEliteProxy(new MetaWebServiceProxy());
		setHost(config.getString("host"));
		setSpseliteuser(config.getString("spseliteuser"));
		setSpselitepassword(config.getString("spselitepassword"));
		log.debug("Initializing a new object \n username = " + getSpseliteuser() + "\nhost = " + getHost());
	}
	
	@Override
	public void testConnection(){
		
		try {
			getSpsEliteProxy().setEndpoint(getHost());
			if(spsEliteProxy.isValidUserCredentials(getSpseliteuser(), getSpselitepassword()))
				log.debug("Connection sucessful.");
			else
				throw new ConnectorException("Invalid credentials");
		} catch (Exception e) {
			throw new ConnectorException(e.getClass().getName());
		}
	}

	@Override
	public Schema discoverSchema() throws ConnectorException ,UnsupportedOperationException {
		Schema schema = new Schema();
		
		log.debug("Discovering the schema for the type = " + this.objectType);
		
		if(OBJECT_TYPE_ACCOUNT.equals(this.objectType)){
			schema.setObjectType("account");
			schema.setNativeObjectType("account");
			schema.setIdentityAttribute(ATTR_USERNAME);

			schema.addAttribute(ATTR_USERNAME, Type.STRING);
			schema.addAttribute(ATTR_FIRSTNAME, Type.STRING);
			schema.addAttribute(ATTR_LASTNAME, Type.STRING);
			schema.addAttribute(ATTR_EMAIL, Type.STRING);
			schema.addAttribute(ATTR_ISACTIVE, Type.BOOLEAN);
		}
		return schema;
	}

	@Override
	public Iterator<Map<String, Object>> iterate(Filter arg0) throws ConnectorException, UnsupportedOperationException {
		log.debug("Iterating thru the data ");
		
		Iterator<Map<String,Object>> iterator = null;
		
		try {
			Map<String, Map<String, Object>> accounts = new HashMap<String,Map<String, Object>>();
			
			if(loadUsers()){
				
				List<String> usersName = getUserNames();
				for(String username : usersName){
					accounts.put(username, read(username));
				}
				iterator = new ArrayList<Map<String,Object>>(accounts.values()).iterator();
				
			}
			else{
				iterator = new ArrayList<Map<String,Object>>().iterator();
			}
			
		} catch (Exception e) {
			log.error(e.getClass().getName() + ", " + e.getMessage());
		}
		return iterator;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map<String, Object> read(String username)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		log.debug("Creating the map for the username " + username);
		
		Map<String, Object> userMap = new HashMap<String, Object>();
		
		try {
			if(!getUsersList().isEmpty()){
				MetaMdUserWebserviceBc user = getUsersList().get(username);
				List<Field> userProperties = new ArrayList<Field>(Arrays.asList(user.getClass().getFields()));
		      	
		      	Class userClass = MetaMdUserWebserviceBc.class;
		      	String name = null;
		      	Object value = null;

				for(Field property : userProperties){
					name = property.getName();
					value = userClass.getField(name).get(user);
					
					userMap.put(name, value);
				}
				return userMap;
			}
			else
				throw new ConnectorException("The context is empty.");
		} catch (Exception e) {
			log.error(e.getClass().getName() + ", " + e.getMessage());
			throw new ConnectorException(e.getClass().getName());
		}
	}
	
	@Override
	public Result create(String username, List<Item> attributes)
			throws ConnectorException, ObjectAlreadyExistsException, UnsupportedOperationException {
		log.debug("Creating the user = " + username);
		printItems(attributes);
		
		if(userExist(username)){
			log.debug( "The user with the username: " + username + " already exists in the system" );
			return new Result(Result.Status.Failed);
		}
		
		MetaMdUserWebserviceBc user = createUser(username, attributes);
		if(user != null && createUpdate(user))
			return new Result(Result.Status.Committed);
		else
			return new Result(Result.Status.Failed);
	}
	
	@Override
	public Result update(String username, List<Item> attributes) throws ConnectorException, ObjectNotFoundException,
			IllegalArgumentException, UnsupportedOperationException {
		log.debug("Updating the user = " + username);
		printItems(attributes);
		
		if(!userExist(username)){
			log.debug(  "The user with the username: " + username + " does not exists in the system" );
			return new Result(Result.Status.Failed);
		}
		
		MetaMdUserWebserviceBc user = createUser(username, attributes);
		if(user != null && createUpdate(user))
			return new Result(Result.Status.Committed);
		else
			return new Result(Result.Status.Failed);
	}
	
	@Override
	public Result disable(String username, Map<String, Object> options)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		log.debug("Disabling the user = " + username);
		
		MetaMdUserWebserviceBc user = new  MetaMdUserWebserviceBc();
		user.setUserName(username);
		user.setIsActive("false");
		
		if(createUpdate(user))
			return new Result(Result.Status.Committed);
		else
			return new Result(Result.Status.Failed);
	}

	@Override
	public Result enable(String username, Map<String, Object> options)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		log.debug("Enabling the user = " + username);
		
		MetaMdUserWebserviceBc user = new  MetaMdUserWebserviceBc();
		user.setUserName(username);
		user.setIsActive("true");
		
		if(createUpdate(user))
			return new Result(Result.Status.Committed);
		else
			return new Result(Result.Status.Failed);
	}
	
	@SuppressWarnings("rawtypes")
	private MetaMdUserWebserviceBc createUser(String username, List<Item> attributes){
		try{
			log.debug("Creating the user object...");
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
			log.error(e.getClass().getName() + ", " + e.getMessage());
			return null;
		}
	}
	
	private boolean createUpdate(MetaMdUserWebserviceBc user){
		try{
			log.debug("Creating or updating an user...");
			MetaMdUserWebserviceBc[] transactionData = new MetaMdUserWebserviceBc[]{ user };
			
			MetaWsUpdateTransactionRequest transactionRequest = new MetaWsUpdateTransactionRequest();
			transactionRequest.setData(transactionData);
			
			MetaWsUpdateRequest updateRequest = new MetaWsUpdateRequest();
			updateRequest.setUserName(getSpseliteuser());
			updateRequest.setPassword(getSpselitepassword());
			updateRequest.setTransactions(0, transactionRequest);
			
			MetaWsUpdateResponse status = getSpsEliteProxy().update(updateRequest);
			return status.getStatus().getCode().equals("200");
		}
		catch(Exception e){
			log.error(e.getClass().getName() + ", " + e.getMessage());
			return false;
		}
	}
	
	private boolean userExist (String username){		
		try{
			log.debug("Checking if the username: " + username + " exists");
			MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc userSearched = 
					new MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc();
			userSearched.setUserName(username);
			
			MetaWsSearchRequest request = new MetaWsSearchRequest();
			request.setUserName(spseliteuser);
			request.setPassword(spselitepassword);
			
			request.setCriteria(new MetaWsSearchRequestCriteria());
			
			MetaWsSearchResponse response = getSpsEliteProxy().search(request);
			MetaMdUserWebserviceBc userFound = response.getResult()[0];
			
			return userFound != null && userFound.getUserName().equals(username);
		}
		catch(Exception e){
			return false;
		}
	}
	
	private List<String> getUserNames() {
		log.debug("Fetching usernames...");
		List<String> userNamesList = new ArrayList<String>();
		
		if(getUsersList() != null && !getUsersList().isEmpty()){

			for(Map.Entry<String, MetaMdUserWebserviceBc> user : usersList.entrySet()){
				userNamesList.add(user.getKey());
			}
			
		}
		
		return userNamesList;
	}
	
	private boolean loadUsers(){
		log.debug("Fetching users into the context...");
		
		MetaMdUserWebserviceBc[] users = null;
		
		try{
			
			MetaWsSearchRequest searchRequest = new MetaWsSearchRequest();
			
			searchRequest.setUserName(getSpseliteuser());
			searchRequest.setPassword(getSpselitepassword());
			
			searchRequest.setCriteria(new MetaWsSearchRequestCriteria());
			
			MetaWsSearchResponse searchResponse = getSpsEliteProxy().search(searchRequest);
			users = searchResponse.getResult();
			
			for(MetaMdUserWebserviceBc user : users){
				getUsersList().put(user.getUserName(), user);
			}
		}
		catch(Exception e){
			log.error(e.getClass().getName() + ", " + e.getMessage());
		}
		
		return users != null && users.length > 0;
	}
	
	private void printItems(List<Item> attributes){
		log.debug("Values: ");
		
		for(Item attribute : attributes){
			log.debug(attribute.name);
			log.debug(attribute.value.toString());
		}
	}

	@Override
	protected void finalize() throws Throwable{
		super.finalize();
	}

}
