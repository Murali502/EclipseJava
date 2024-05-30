package demoJavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> allSubjects = Arrays.asList("Java","Automation testing","Functional testing","Selenium testing","Performance testing");
		List<String> allTestingSubjects = new ArrayList<>();
		
		for (String string : allSubjects) {
			
			if(allSubjects.contains(string))
			{
				allTestingSubjects.add(string);
			}
			
		}
		
		System.out.println("All Subjects " + allSubjects);
		
		System.out.println("All testing Subjects " + allTestingSubjects);
		
		
		
		List<String> fileterUsingStream=allSubjects
		.stream()
		.filter(lam -> lam.contains("testing"))
		.collect(Collectors.toList());
		
        System.out.println("-----------------------------------------------");
		
		System.out.println("Using Java stream " + fileterUsingStream);
		
	}

}
