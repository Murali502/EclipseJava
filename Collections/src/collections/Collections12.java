package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.Messaging.SyncScopeHelper;

public class Collections12 {

	public static void main(String[] args) {
	
		 	
		HashMap<String, Integer> hm =new HashMap<>();
		
		
	      /* hm.put("BB", 1);
		   hm.put("BB", 2);*/
		   hm.put(null, 2);
		   
		  
	        String s1="FB";
		    String s2="Eb";
		   
		    System.out.println(s1.hashCode()  + "   "   +s2.hashCode());
		    
		       hm.put(s1, 1);
			   hm.put(s2, 2);
		   
			   System.out.println(hm);
			   
	        // enter data into hashmap 
	      /*  hm.put("Math", 98); 
	        hm.put("Math", 98); 
	        hm.put("Math", 98); 
	        hm.put("Math", 98); 
	        hm.put("Math", 98); */
		   
		 /*  hm.put(s1, 1);
		   hm.put(s2, 2);*/
	        
	       /* System.out.println(hm);*/
	       /* hm.put("Data Structure", 85); 
	        hm.put("Database", 91); 
	        hm.put("Java", 95); 
	        hm.put("Operating System", 79); 
	        hm.put("Networking", 80); 
	        //Map<String, Integer> hm1 = sortByValue(hm); 
	  
	        System.out.println(hm);
	      //  System.out.println(hm.entrySet());
	        // print the sorted hashmap 
	        for (Map.Entry<String, Integer> en : hm.entrySet()) { 
	            System.out.println("Key = " + en.getKey() +  
	                          ", Value = " + en.getValue()); 
	        } 
	        
	        HashMap<String,Integer> hm1=new HashMap<String,Integer>();
	        hm1.put("Math", 98);
	        hm1.put("C", 96);
	        hm1.put("Java",86);
	        System.out.println(hm1);
	        
	        for(Entry mu:hm1.entrySet())
	        {
	        	System.out.println("Key = "+mu.getKey());
	        }
	        HashMap<String, Integer> nm1=new HashMap<String,Integer>();
	        nm1.put("Small", 10);
	        nm1.put("large", 20);*/
	   
			
	}
	

}


