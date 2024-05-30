package testDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map1=new HashMap<>();
		
		map1.put(1, 2);
		map1.put(4, 3);
		
		Map<Integer,Integer> map2=new HashMap<>();
		map2.put(1, 4);
		map2.put(4, 5);
		
		int key;
		int value;
		int key1;
		int value2;
		for(Entry entry:map1.entrySet())
		{
			 key=(int) entry.getKey();
			 value =(int) entry.getValue();
			for(Entry entry2:map1.entrySet())
			{
				 key1=(int) entry.getKey();
				 value2 =(int) entry.getValue();
				if(value==value2)
				{
					System.out.println("Value from map1"+ "  " + value + " map2 value " +value2);
				}
			}
		}
	
	}

}
