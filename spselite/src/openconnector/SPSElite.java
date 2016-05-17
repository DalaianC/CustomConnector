package openconnector;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
	}
	
	@Override
	public void testConnection(){
		
		try {
			getSpsEliteProxy().setEndpoint(getHost());
			if(spsEliteProxy.isValidUserCredentials(getSpseliteuser(), getSpselitepassword()))
				System.out.println("Connection sucessful.");
			else
				throw new ConnectorException("Invalid credentials");
		} catch (Exception e) {
			throw new ConnectorException(e.getClass().getName());
		}
	}

	@Override
	public Schema discoverSchema() throws ConnectorException ,UnsupportedOperationException {
		Schema schema = new Schema();
		
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
			e.printStackTrace();
		}
		return iterator;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Map<String, Object> read(String username)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
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
			e.printStackTrace();
			throw new ConnectorException(e.getClass().getName());
		}
	}
	
	@Override
	public Result create(String username, List<Item> attributes)
			throws ConnectorException, ObjectAlreadyExistsException, UnsupportedOperationException {
		System.out.println("11 - create");
		System.out.println("11 - create values: ");
		
		for(Item attribute : attributes){
			System.out.println(attribute.name);
			System.out.println(attribute.value.toString());
		}
		
		if(userExist(username)){
			System.out.println( "The user with the username: " + username + " already exists in the system" );
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
		System.out.println("12 - update");
		System.out.println("12 - update items: ");
		
		for(Item item : attributes){
			System.out.println(item.name);
			System.out.println(item.value.toString());
		}
		if(!userExist(username)){
			System.out.println(  "The user with the username: " + username + " does not exists in the system" );
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
		System.out.println("8 - disable");
		
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
		System.out.println("9 - enable");
		
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
			e.printStackTrace();
			return null;
		}
	}
	
	private boolean createUpdate(MetaMdUserWebserviceBc user){
		try{
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
			e.printStackTrace();
			return false;
		}
	}
	
	private boolean userExist (String username){		
		try{
			MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc userSearched = 
					new MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc();
			userSearched.setUserName(username);
			
			MetaWsSearchRequest request = new MetaWsSearchRequest();
			request.setUserName(spseliteuser);
			request.setPassword(spselitepassword);	
			request.setSessionId(0);
			
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
		List<String> userNamesList = new ArrayList<String>();
		
		if(getUsersList() != null && !getUsersList().isEmpty()){

			for(Map.Entry<String, MetaMdUserWebserviceBc> user : usersList.entrySet()){
				userNamesList.add(user.getKey());
			}
			
		}
		
		return userNamesList;
	}
	
	private boolean loadUsers(){
		System.out.println("Cargando los usuarios...");
		
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
			e.printStackTrace();
		}
		
		return users != null && users.length > 0;
	}

	@Override
	protected void finalize() throws Throwable{
		super.finalize();
	}

}
