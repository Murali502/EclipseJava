package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

public class PropertyUtil {
	
	private String a ="";
	
	public PropertyUtil(String var1)
	{
		this.a=var1;
		
	}

	public PropertyUtil()
	{
		this.a=System.getProperty("user.dir")+"/test.properties";
		
	}
	
	public HashMap<String,String> getProperties()
	{
		
		HashMap var1 = new HashMap();
		FileInputStream var2=null;
		
		HashMap var17;
		boolean var11= false;
		label91: {
			
			try {
				
				var11=true;
				Properties var3 = new Properties();
				var2=new FileInputStream(this.a);
				var3.load(var2);
				Iterator var4 =var3.stringPropertyNames().iterator();
				while(var4.hasNext())
				{
					String var5 =(String)var4.next();
					var1.put(var5, var3.getProperty(var5));
				}
				
				var17=var1;
			    var11= false;
			    break label91;
			}catch(Exception var15) {
				
				var15.printStackTrace();
				System.out.println("Exception : " + var15);
			}finally {
				
				if(var11) {
					
					try {
						
						var2.close();
					}catch(IOException var12) {
						var12.printStackTrace();
					}
				}
				try {
					var2.close();
					
				}catch(IOException var13)
				{
					var13.printStackTrace();
				}
				return null;
			}
			 
		}
		
	}
	
	public String getProperty(String var1)
	{
		String var2;
		if((var2 = System.getProperty(var1))!=null && !var2.isEmpty())
{
  System.out.println("Property key => " + var1 + " has been overridden by the build . value is " + var2 + "'");	
  return var2;
}else 
{
return (String)this.getProperties().get(var1);	
}
	}
}
