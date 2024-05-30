package StringInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiffernetArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] strarry = {"Murali","NNNJ","ABSCC","KKKK"};
		
		List list =Arrays.asList(strarry);
		//System.out.println(list);
	
		List<String> li=new ArrayList<>();
		
		Collections.addAll(li, strarry);
		
		System.out.println(li);
		
		for(String str: strarry)
		{
			
			li.add(str);
		}
		
	}

}
