package company.com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	
	static String propertiesFilePath = "src//main//resources//node.properties";
	static Properties prop;
	
	static {
	  try {
		  prop = new Properties();
		  FileInputStream fis = new FileInputStream(new File(propertiesFilePath));
		  prop.load(fis);
	  }	catch(Exception e) {
		  e.printStackTrace();
		  throw new RuntimeException("Global.properties file not found at " + propertiesFilePath);
	  }
		
	}

	public static String get(String property) {
            String propertyValue = prop.getProperty(property);
            if(propertyValue != null) {
            	return propertyValue;
            }else {
            	throw new RuntimeException(property + "is not mentioned in the global.properties file");
            }

	}
	
}
