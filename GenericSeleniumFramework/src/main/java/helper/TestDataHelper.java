package helper;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import constants.Constants;
import constants.Environments;
import model.EnvironmentConfiguration;
import model.TestConfiguration;
import utilities.JsonUtil;
import utilities.PropertyUtil;

public class TestDataHelper {
	
	 PropertyUtil pro=new PropertyUtil();
	private final static String TEST_CONFIGURATION_JSON="TestConfiguration.json";
	
	/* Convert the Environment value to Enum(Environment)
	 * 
	 * */
	private static Environments getEnvironment() throws Exception 
	{
		
		String environment =new PropertyUtil().getProperty(Constants.ENVIRONMENT).toUpperCase();
		if(environment ==null || environment.isEmpty()) throw new Exception("Environment name cannot be null");
		return Environments.valueOf(environment.toUpperCase());
		//return null;
	}
	
	public static String getEnvironmentName()
	{
		String environment = new PropertyUtil().getProperty(Constants.ENVIRONMENT).toUpperCase();
		return environment;
	}
	
	
	public static EnvironmentConfiguration getEnvironmentConfiguration(Environments environment) throws Exception
	{
		String file = getProjectRoot()+"/"+TEST_CONFIGURATION_JSON;
		TestConfiguration[] testConfiguration =JsonUtil.readJsonAsArray(file, TestConfiguration[].class);
		TestConfiguration configuration =Arrays.stream(testConfiguration)
				.filter(env -> env.Environment.equals(environment))
				.findFirst().orElse(null);
		if(configuration ==null) throw new Exception("No configuration found for Environment");
		return configuration.Configuration;
	}
	
	
	public static EnvironmentConfiguration getcurrentEnvironmentConfiguration() throws Exception
	{
		Environments environment=getEnvironment();
		String file = getProjectRoot()+"/"+TEST_CONFIGURATION_JSON;
		TestConfiguration[] testConfiguration =JsonUtil.readJsonAsArray(file, TestConfiguration[].class);
		TestConfiguration configuration =Arrays.stream(testConfiguration)
				.filter(env -> env.Environment.equals(environment))
				.findFirst().orElse(null);
		if(configuration ==null) throw new Exception("No configuration found for Environment");
		return configuration.Configuration;
	}
	
	
	
	public static String getProjectRoot() {return System.getProperty("user.dir");}
	
	public static String getMainPackagepath() { return getProjectRoot().concat("/src/main/");}
	public static String getJavaDirectoryPathInTest() {return getProjectRoot().concat("/src/test/java");}
	
	
	
	public static String getTextBetweenTowStrings(String fullText,String startString, String endString)
	{
		String val="";
		Pattern pattern = Pattern.compile(startString+ "(.*?)" +endString,Pattern.DOTALL);
		Matcher matcher = pattern.matcher(fullText);
		while(matcher.find())
		{
			
		}
		return val;
		
	}
	
/*	private static Environments getEnvironment1()
	{
		String environment =new PropertyUtil().getProperty(Constants.ENVIRONMENT).toUpperCase();
		
		return Environments.valueOf(environment.toUpperCase());
	}*/
}