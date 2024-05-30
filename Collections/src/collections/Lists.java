package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*	List al  = new ArrayList();
		al.add("chercher tech");
		al.add(true);
		al.add(10);
		al.add(new ArrayList());
		
		System.out.println("value at index 2 before Adding value at 2 : " +al.get(2));
		al.add(2, 20);
		System.out.println("value at index 2 after Adding value at 2 : " +al.get(2));

		al.remove("chercher tech");  // based on object
		System.out.println("All values in list : " +al);
		al.remove(1); // based on index
		System.out.println("All values in list : " +al);

		al.set(1, "eee");
		System.out.println("Value at index 1 :" +al.get(1));

		System.out.println("index of avengers (none present): "+ al.indexOf("Avenger"));
		System.out.println("get the value at index 0 " +al.get(0));

		System.out.println("Number of elements present in the list : "+al.size());
		System.out.println("does list contains 'eee' : "+al.contains("eee"));

		al.clear();
		System.out.println("Elements present in list after clearing the list :" +al );
		*/
		
		List<Integer> values=new ArrayList<Integer>();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(236);
		values.add(881);
	    java.util.Collections.sort(values);
	    
	    System.out.println(values);
	    

	    
	    Comparator<Integer> com = new ComparInterface();
	    
	    java.util.Collections.sort(values,com);
	}
	
	}


