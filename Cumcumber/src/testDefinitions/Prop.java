package testDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Prop {
public static String getPropValues(String key) throws IOException
{
InputStream inputstream=null;
String result= null;

try {
	Properties prop=new Properties();
	String propFileName=".\\Cumcumber\\resources\\config.properties";
	inputstream =new FileInputStream(propFileName);
	
	if(inputstream!=null)
	{
		prop.load(inputstream);
	}
	else
	{
		throw new FileNotFoundException("property file "+propFileName +"not found in the classpath");
	}
	
	result=prop.getProperty(key);
}
catch(Exception e)
{
	System.out.println("Exception :"+e);
}
finally
{
inputstream.close();	
}
return result;
}
	
}
