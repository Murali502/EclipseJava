package collections;

import java.util.HashMap;
import java.util.HashSet;

public class GFG {

	public static void main(String[] args)
    {
  
		Integer.parseInt("");
        // New HashMap1
        HashMap<Integer, String> map1 = new HashMap<>();
  
        // Add Entry to map
        map1.put(1, "Akshay");
        map1.put(2, "Bina");
        map1.put(3, "Chintu");
        map1.put(4, "Chintu");
  
        // New HashMap2
        HashMap<Integer, String> map2 = new HashMap<>();
  
        // Add Entry to map
        map2.put(3, "Chintu");
        map2.put(2, "Bina");
        map2.put(1, "Akshay");
  
        // New HashMap3
        HashMap<Integer, String> map3 = new HashMap<>();
  
        // Add Entry to map
        map3.put(1, "Akshay");
        map3.put(2, "Binod");
        map3.put(3, "Chintu");
        
        
        // New HashMap3
        HashMap<Integer, String> map4 = new HashMap<>();
  
        // Add Entry to map
        map3.put(1, "Akshay");
        map3.put(2, "Binod");
        map3.put(3, "Chintu");
       
        
  
        // Compare map1 and map2
        System.out.println("map1 == map2 : "
                           + map1.equals(map2));
  
        // Compare map1 and map3
        System.out.println("map1 == map3 : "+ map1.equals(map3));
        
      HashSet<String> set1 = new HashSet<>(map1.values());
  	  
  	  HashSet<String> set2 = new HashSet<>(map2.values());
  	  
  	  HashSet<String> set3 = new HashSet<>(map3.values());
  	  
  	  System.out.println("map1 values == map2 values : " + set1.equals(set2));
  	  
  	  System.out.println("map1 values == map3 values : "+ set1.equals(set3));
  	  
  	  HashSet<Integer> combinekeys = new HashSet<>(map1.keySet());
  	  
  	  combinekeys.addAll(map4.keySet());
  	 // combinekeys.removeAll(map1.entrySet());
  	  
  	  System.out.println(combinekeys);
  	  
    }
}
