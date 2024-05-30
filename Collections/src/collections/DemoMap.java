package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "Selenium");
		map.put(1, "Qtp");
		map.put(1, "TestComplete");
		map.put(1, "TestNG");
		map.put(2, "TestNG");
		
		System.out.println("values" + map.get(1));
		System.out.println("values" + map.get(2));
		
		for (Entry en:map.entrySet()) {
			
			System.out.println(en.getKey() +"  "+en.getValue());
			
			
		}*/
		
	/*	Employee emp=new Employee("Murali",30,"QA");
		Employee emp2=new Employee("Bala", 20, "Dev");
		Employee emp3=new Employee("Naga" ,30,"Nag");
		
		Map<Integer,Employee> empMap= new  HashMap<>();
		empMap.put(1, emp);
		empMap.put(2, emp2);
		empMap.put(3, emp3);
		System.out.println("values" + empMap);
		
		
	  for(Entry<Integer,Employee> m:empMap.entrySet())
	  {
		  int key = m.getKey();
		  Employee e =m.getValue();
		  System.out.println(key   +"  "+ "Info");
		  System.out.println(e.name  + " "+e.age+ " " +e.age);
	  }*/
	  
	  //Map comparision 
	  
	  HashMap<Integer,String> map1= new  HashMap<>();
	  map1.put(1, "A");
	  map1.put(2, "B");
	  map1.put(3, "C");
	  
	  HashMap<Integer,String> map2= new  HashMap<>();
	  map1.put(1, "A");
	  map1.put(2, "B");
	  map1.put(3, "C");
	  
	  HashMap<Integer,String> map3= new  HashMap<>();
	  map1.put(1, "A");
	  map1.put(2, "B");
	  map1.put(3, "C");
	  map1.put(3, "D");
	  
	  // on the basis of Key - value  : use equals method
	  System.out.println(map1.equals(map2));
	  
	  //2. compare hashmaps for the same keys: Keyset();
	  System.out.println(map1.keySet().equals(map2.keySet()));
	  
	  
	  HashSet<String> set1 = new HashSet<>(map1.values());
	  
	  HashSet<String> set2 = new HashSet<>(map2.values());
	  
	  HashSet<String> set3 = new HashSet<>(map3.values());
	  
	  System.out.println("map1 values == map2 values : " + set1.equals(set2));
	  
	  System.out.println("map1 values == map3 values : "+ set1.equals(set3));
	  //System.out.println(map1.values());
	}

}
