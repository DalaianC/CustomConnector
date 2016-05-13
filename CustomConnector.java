package openconnector;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sun.istack.internal.logging.Logger;

import openconnector.AbstractConnector;
import openconnector.ConnectorException;
import openconnector.Filter;
import openconnector.ObjectNotFoundException;
import openconnector.Schema;
import openconnector.Schema.Type;
import sailpoint.api.SailPointFactory;
import soapservice.Employee;
import soapservice.HumanResourcesProxy;

public class CustomConnector extends AbstractConnector{

	private final static Logger log = Logger.getLogger(CustomConnector.class);

	//Attributes of the SPSElite service
	public static final String ATTR_USERNAME = "UserName";
	public static final String ATTR_FIRSTNAME = "FirstName";
	public static final String ATTR_LASTNAME = "LastName";
	public static final String ATTR_EMAIL = "EmailAddress";
	public static final String ATTR_ISACTIVE = "IsActive";
	
	public static final String CONFIG_USERNAME = "spseliteuser";
	public static final String CONFIG_PASSWORD = "spselitepassword";
	public static final String CONFIG_HOST = "host";
	
	private String host;
	private String spseliteuser;
	private String spselitepassword;
	
	private HumanResourcesProxy spsEliteProxy = new HumanResourcesProxy();
	
	@Override
	public List<Feature> getSupportedFeatures(String objectType) {
		// TODO Auto-generated method stub
		return Arrays.asList(Feature.values());
	}
	
	@Override
	public void testConnection(){
		host = config.getString("host");
		spseliteuser = config.getString("spseliteuser");
		spselitepassword = config.getString("spselitepassword");
		
		URL url;
		HttpURLConnection connection;
		
		try {
			url = new URL(host);
			connection = (HttpURLConnection)url.openConnection();
			connection.connect();
			int code = connection.getResponseCode();
			if(code == 200)
				spsEliteProxy.setEndpoint(host);
			else{
				throw new ConnectorException(String.valueOf(connection.getResponseCode()));
			}
		} catch (Exception e) {
			throw new ConnectorException(e.getClass().getName());
		}
	}

	@Override
	public Schema discoverSchema() throws ConnectorException ,UnsupportedOperationException {
		Schema schema = new Schema();

		schema.setObjectType("account");
		schema.setNativeObjectType("account");
		schema.setIdentityAttribute(ATTR_USERNAME);

		schema.addAttribute(ATTR_USERNAME, Type.STRING);
		schema.addAttribute(ATTR_FIRSTNAME, Type.STRING);
		schema.addAttribute(ATTR_LASTNAME, Type.STRING);
		schema.addAttribute(ATTR_EMAIL, Type.STRING);
		schema.addAttribute(ATTR_ISACTIVE, Type.BOOLEAN);
		
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
			if(iterator != null)
				System.out.println(iterator);
			else
				System.out.println("El iterator es nulo");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iterator;
	}

	private List<String> getUserNames() {
		List<String> userNamesList = new ArrayList<String>();
		
		try{
			Employee[] employeeList = spsEliteProxy.getEmployees("");
			
			for(Employee e : employeeList){
				userNamesList.add(e.getUsername());
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
			Employee employee = spsEliteProxy.getEmployees(arg0)[0];
			System.out.println("read gets userName: " + employee.getUsername());
			System.out.println("read gets firstName: " + employee.getFirstName());
			System.out.println("read gets lastName: " + employee.getLastName());
			System.out.println("read gets emailAddress: " + employee.getEmailAddress());
			System.out.println("read gets isActive: " + employee.getIsActive());
			
			employeeMap.put(ATTR_USERNAME, employee.getUsername());
			employeeMap.put(ATTR_FIRSTNAME, employee.getFirstName());
			employeeMap.put(ATTR_LASTNAME, employee.getLastName());
			employeeMap.put(ATTR_EMAIL, employee.getEmailAddress());
			employeeMap.put(ATTR_ISACTIVE, employee.getIsActive());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeeMap;
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
	}
	
}
