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
	
	private MetaWebServiceProxy spsEliteProxy = new MetaWebServiceProxy();
	
	@Override
	public List<Feature> getSupportedFeatures(String objectType) {
		return Arrays.asList(Feature.values());
	}
	
	@Override
	public void testConnection(){
		host = config.getString("host");
		spseliteuser = config.getString("spseliteuser");
		spselitepassword = config.getString("spselitepassword");
		
		try {
			spsEliteProxy.setEndpoint(host);
			if(spsEliteProxy.isValidUserCredentials(spseliteuser, spselitepassword))
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
			List<String> allUserNames = getUserNames();
			
			for(String username : allUserNames){
				accounts.put(username, read(username));
			}
			iterator = new ArrayList<Map<String,Object>>(accounts.values()).iterator();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iterator;
	}

	private List<String> getUserNames() {
		List<String> userNamesList = new ArrayList<String>();
		
		try{
			MetaWsSearchRequest searchRequest = new MetaWsSearchRequest();
			
			searchRequest.setUserName(spseliteuser);
			searchRequest.setPassword(spselitepassword);
			searchRequest.setSessionId(0);
			searchRequest.setCriteria(new MetaWsSearchRequestCriteria());
			
			MetaWsSearchResponse searchResponse = spsEliteProxy.search(searchRequest);
			MetaMdUserWebserviceBc[] users = searchResponse.getResult();
			
			for(MetaMdUserWebserviceBc e : users){
				userNamesList.add(e.getUserName());
			}
		}
		catch(Exception e){
			e.printStackTrace();
			throw new ConnectorException("class: " + e.getClass().getName() + ", cause: " + e.getMessage());
		}
		return userNamesList;
	}

	@Override
	public Map<String, Object> read(String arg0)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		Map<String, Object> employeeMap = new HashMap<String, Object>();
		
		try {
			MetaWsSearchRequest searchRequest = new MetaWsSearchRequest();
			
			searchRequest.setUserName(spseliteuser);
			searchRequest.setPassword(spselitepassword);
			searchRequest.setSessionId(0);
			
			searchRequest.setCriteria(new MetaWsSearchRequestCriteria());
			
			MetaWsSearchResponse searchResponse = spsEliteProxy.search(searchRequest);
			MetaMdUserWebserviceBc[] users = searchResponse.getResult();
			MetaMdUserWebserviceBc user = users[0];
			
			List<Field> attributes = new ArrayList<Field>(Arrays.asList(user.getClass().getFields()));
	      	
	      	int length = attributes.size();
	      	
	      	Class userClass = MetaMdUserWebserviceBc.class;
	      	String name = null;
	      	Object value = null;
	      	
			for(int x = 0; x < length; x++){
				name = attributes.get(x).getName();
				value = userClass.getField(name).get(user);
				
				employeeMap.put(name, value);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeeMap;
	}
	
	@Override
	public Result create(String id, List<Item> items)
			throws ConnectorException, ObjectAlreadyExistsException, UnsupportedOperationException {
		System.out.println("11 - create");
		System.out.println("11 - create values: ");
		
		for(Item item : items){
			System.out.println(item.name);
			System.out.println(item.value.toString());
		}
		if(userExist(id))
			throw new ObjectNotFoundException( "The user with the username: " + id + " already exists in the system" );
		
		try{
			MetaMdUserWebserviceBc userToUpdate = new  MetaMdUserWebserviceBc();
			userToUpdate.setUserName(id);
			
			int length = items.size();
			for(int x = 0; x < length; x++){
				userToUpdate.setFirstName(items.get(x).value.toString());
			}
			
			MetaMdUserWebserviceBc[] transactionData = new MetaMdUserWebserviceBc[1];
			transactionData[0] = userToUpdate;
			
			MetaWsUpdateTransactionRequest transactionRequest = new MetaWsUpdateTransactionRequest();
			transactionRequest.setData(transactionData);
			
			MetaWsUpdateRequest updateRequest = new MetaWsUpdateRequest();
			updateRequest.setUserName(spseliteuser);
			updateRequest.setPassword(spselitepassword);
			updateRequest.setTransactions(0, transactionRequest);
			spsEliteProxy.update(updateRequest);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return new Result(Result.Status.Committed);
	}
	
	@Override
	public Result update(String id, List<Item> items) throws ConnectorException, ObjectNotFoundException,
			IllegalArgumentException, UnsupportedOperationException {
		System.out.println("12 - update");
		System.out.println("12 - update items: ");
		
		for(Item item : items){
			System.out.println(item.name);
			System.out.println(item.value.toString());
		}
		if(!userExist(id))
			throw new ObjectNotFoundException( "The user with the username: " + id + " does not exists in the system" );
		
		try{
			MetaMdUserWebserviceBc userToUpdate = new  MetaMdUserWebserviceBc();
			userToUpdate.setUserName(id);
			
			List<Field> attributes = new ArrayList<Field>(Arrays.asList(userToUpdate.getClass().getFields()));
			
			Class userClass = MetaMdUserWebserviceBc.class;
	      	String name = null;
	      	Object value = null;
			
			int length = items.size();
			for(int x = 0; x < length; x++){
				name = attributes.get(x).getName();
				userClass.getField(name).set(userToUpdate, items.get(x).value);
			}
			
			MetaMdUserWebserviceBc[] transactionData = new MetaMdUserWebserviceBc[1];
			transactionData[0] = userToUpdate;
			
			MetaWsUpdateTransactionRequest transactionRequest = new MetaWsUpdateTransactionRequest();
			transactionRequest.setData(transactionData);
			
			MetaWsUpdateRequest updateRequest = new MetaWsUpdateRequest();
			updateRequest.setUserName(spseliteuser);
			updateRequest.setPassword(spselitepassword);
			updateRequest.setTransactions(0, transactionRequest);
			spsEliteProxy.update(updateRequest);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return new Result(Result.Status.Committed);
	}
	
	@Override
	public Result disable(String id, Map<String, Object> options)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		System.out.println("8 - disable");
		
		try {
			MetaMdUserWebserviceBc userToUpdate = new  MetaMdUserWebserviceBc();
			userToUpdate.setUserName(id);
			userToUpdate.setIsActive("false");
			
			MetaMdUserWebserviceBc[] transactionData = new MetaMdUserWebserviceBc[1];
			transactionData[0] = userToUpdate;
			
			MetaWsUpdateTransactionRequest transactionRequest = new MetaWsUpdateTransactionRequest();
			transactionRequest.setData(transactionData);
			
			MetaWsUpdateRequest updateRequest = new MetaWsUpdateRequest();
			updateRequest.setUserName(spseliteuser);
			updateRequest.setPassword(spselitepassword);
			updateRequest.setTransactions(0, transactionRequest);
			spsEliteProxy.update(updateRequest);
			
		} catch (Exception e) {
			throw new ConnectorException(e);
		}
		
		return new Result(Result.Status.Committed);
	}

	@Override
	public Result enable(String id, Map<String, Object> options)
			throws ConnectorException, ObjectNotFoundException, UnsupportedOperationException {
		System.out.println("9 - enable");
		
		try {
			MetaMdUserWebserviceBc userToEnable = new  MetaMdUserWebserviceBc();
			userToEnable.setUserName(id);
			userToEnable.setIsActive("true");
			
			MetaMdUserWebserviceBc[] users = new MetaMdUserWebserviceBc[1];
			users[0] = userToEnable;
			
			MetaWsUpdateTransactionRequest transactionRequest = new MetaWsUpdateTransactionRequest();
			transactionRequest.setData(users);
			
			MetaWsUpdateRequest request = new MetaWsUpdateRequest();
			request.setUserName(spseliteuser);
			request.setPassword(spselitepassword);
			request.setTransactions(0, transactionRequest);
			spsEliteProxy.update(request);
		} catch (Exception e) {
			throw new ConnectorException(e);
		}
		return new Result(Result.Status.Committed);
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
			
			MetaWsSearchResponse response = spsEliteProxy.search(request);
			MetaMdUserWebserviceBc userFound = response.getResult()[0];
			
			return userFound != null && userFound.getUserName().equals(username);
		}
		catch(Exception e){
			return false;
		}
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
	}
	
}
