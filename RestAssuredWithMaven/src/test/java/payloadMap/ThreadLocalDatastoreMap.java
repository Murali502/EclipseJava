package payloadMap;

import java.util.LinkedHashMap;

public class ThreadLocalDatastoreMap {

	
	private ThreadLocalDatastoreMap()
	{
		
	};
	
	//private static LinkedHashMap<String, Object>  datamap1 = new LinkedHashMap<String, Object>();
	
	private static ThreadLocal<LinkedHashMap<String, Object>> threadlocalObj = 
			ThreadLocal.withInitial(() -> new LinkedHashMap<String, Object>());
	
	public static void setValue(String key, Object value)
	{
		threadlocalObj.get().put(key, value);
	}
	
	public static Object getValue(String key)
	{
	   return threadlocalObj.get().get(key);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
