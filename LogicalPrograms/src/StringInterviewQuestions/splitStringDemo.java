package StringInterviewQuestions;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class splitStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method one
		String demo = "This is my first program in java";		
		/*String [] strarry=demo.split(" ");
		splitString(strarry);
*/		
		//Method2 
		/*List<String> restrig=Pattern.compile(" ").splitAsStream(demo).collect(Collectors.toList());
		
		for(String value: restrig)
		{
			System.out.println(value);
		}*/
		
		//Method3 
		
		StringTokenizer strtoken= new StringTokenizer(demo, " ");
		
		while(strtoken.hasMoreElements())
		{
		   String str=strtoken.nextToken();	
		 System.out.println(str);
		}
		
		//String strutils=StringUtils.split()
		
		//Splitter.
}
	public static void splitString(String [] strarry)
	{
		
		for(String str : strarry)
		{
			System.out.println(str);
		}
	}
	
}
