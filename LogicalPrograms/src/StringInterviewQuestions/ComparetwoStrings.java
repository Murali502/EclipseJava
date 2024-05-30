package StringInterviewQuestions;

public class ComparetwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="Murali";
		String str2="Balaji";
		boolean Iscompare = false;
		compareString(str1,str2,Iscompare);
	}

	
	public static void compareString(String str1,String str2,boolean Iscompare)
	{
	
		for(int i =0; i<str1.length();i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				Iscompare= false;
				break;
			}
			Iscompare=true;
		}
		
		System.out.println(Iscompare);
	}
	
}
