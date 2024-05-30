package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<String> li= new ArrayList<>();
	
	li.add("acvv");
	li.add("acvv");
	li.add("acvv");
	li.add("agcvv");
	li.add("nmcvv");
	li.add("zcvv");
	
	System.out.println("Before sort"+"  "+li);
	
	Collections.sort(li);
	
	System.out.println("After sorting of collection" + li);
	
	
	Collections.reverse(li);
	
	System.out.println("Reverse the collection" + li);
	
	
	System.out.println( Collections.frequency(li, "acvv") );
	
  /*  Collections.
	
	System.out.println("Reverse the collection" + li);*/
	
	
	List<Integer> liint= new ArrayList<>();
	
	
	
	
	
		
		
	}

}
