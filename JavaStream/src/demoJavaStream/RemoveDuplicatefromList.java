package demoJavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicatefromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listwithStringValues = Arrays.asList("Java","Selenium","Physics","Selenium");
		
		List<String> listwithoutDuplicate = new ArrayList<>();
		
		for (String string : listwithStringValues) {
			
			if(!listwithoutDuplicate.contains(string))
			{
				listwithoutDuplicate.add(string);
			}
			
		}
		System.out.println("Before removing duplicate : " + listwithStringValues);
		System.out.println("After removing duplicate : " + listwithoutDuplicate);

		listwithStringValues
		.stream()
		.distinct()
		.collect(Collectors.toList());
	}

	
}
