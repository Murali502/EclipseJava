package StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<>();
		
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Orange");
        map.put(4, "Bananna");
        map.put(5, "Sapoto");
        
      /*  for( Integer value :map.keySet())
        {	
        System.out.println(map.get(value));
        }*/
        
       
        /*for(Map.Entry<Integer,String>  map1: map.entrySet())
        {
        	
          System.out.println(map1.getValue());
          System.out.println(map1.getKey());
        	
        }*/
        
       // map.entrySet().stream().forEach(m->);

        for(Entry entry : map.entrySet())
        {
        	entry.getKey();
        	entry.getValue();
        }
        
	}

	/*private static void streamMethod(Map<Integer,String> map)
	{
		map.entrySet().stream().forEach(e->);
	}
	*/
}
