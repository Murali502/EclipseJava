package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonUtil {
	
	public JsonUtil()
	{
		
	}

	/*public static String readJsonFileIntoString(String var0)
	{
		StringBuilder var1 = new StringBuilder();
		try {
			BufferedReader var13 =new BufferedReader(new FileReader(var0));
			Throwable var2 =null;
			
			while(true)
			{
				boolean var8 =false;
				
				try {
					
				}
			}
			
		}
		
		return var0;
		
	}*/
	
	public static <T> T[] readJsonAsArray(String var0, Class<T[]> var1)
	{
		StringBuilder var2 = new StringBuilder();	
		
		try {
			BufferedReader var14 =new BufferedReader(new FileReader(var0));
			Throwable var3 =null;
			
			while(true)
			{
				boolean var9 =false;
				try {
				
					var9 =true;
					String var4;
					if((var4=var14.readLine())==null)
					{
					  var9=false;
					  break;
					}
					var2.append(var4).append("\n");
				}catch (Throwable var11) {
					var3=var11;
					throw var11;
				} finally {
					
					if(var9) {
						if(var3!=null)
						{
						try {
							var14.close();
							
						}	catch(Throwable var10)
						{
							var3.addSuppressed(var10);
						}
						} else
						{
							var14.close();
						}
					}
				}
				 }
			var14.close();
				}catch(IOException var13)
		{
					var13.printStackTrace();
		}
		
		return (T[])(new Gson()).fromJson(var2.toString(), var1);
	}
	
	public static JsonObject toJSONObject(String var0) throws Exception
	{
		try { return (new JsonParser()).parse(var0).getAsJsonObject();
		}catch(Exception var1)
		{
			throw new Exception(var1.getMessage());
		}
	}
	
	/*public static String queryJson(String var0,String var1)
	{
		try {
			
			
		}catch(PathNotFoundException var3)
		{
			
		}
		
	}*/
}
