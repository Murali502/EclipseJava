package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Iterate through a HashMap using for each :
		//Map<String, String> map = new HashMap<String, String>();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("firstKey", 123);
		map.put("secondKey", 344);
		map.put("Thirdkey", 147);
		map.put("Fourkey", 147);
		map.put("Fivekey", 147);
		//enhanced for loop
		/*for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}*/
		/*Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
		
			 Map.Entry pair = (Entry) it.next();
			//Map.Entry pair =it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());*/
		
		/*Iterator it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
		    Map.Entry pair=(Entry) it.next();	
			
		   System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		*/
		//we can iterate through Map using lambda function in Java 8
		map.forEach((key,value) -> System.out.println(key + " - " + value));
		
		//Map<String, String> map = new HashMap<String, String>();
		//map.put("firstKey", "firstValue");
		//map.put("secndKey", "secondValue");
		for(Entry entry: map.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		
		for (Entry entry : map.entrySet()) {
		System.out.println(entry.getKey() + " = " + entry.getValue());
	}
		
	}
	}


