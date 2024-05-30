package logicalPrograms;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[]= {5,3,5,7,8,9};
		int sum=0;
		
		for (int i = 0; i <=a.length; i++) {
			
			int j =a[1];
			sum=sum+j;
			
		}
		System.out.println(sum);
	}*/
		/*
		String str ="Murali";
		String rev = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		
		System.out.println(rev);*/
		// Remove special characters 
		/*String str="Ree43357uuhhh@#$$%%";
		str=str.replaceAll("[^A-Z0-9]", "");
		System.out.println(str);*/
		
		//Remove white spaces 
		/*String str ="Java    selenium    TestNg";
		String ch=str.replaceAll("\\s", "");
		System.out.println(ch);*/
		
		/*String s="java Programming Java oops";
		
		int len=s.length();
		
		int totlacount=s.replace("a", "").length();
		
		int count =len-totlacount;
		
		System.out.println(count);*/
		
		//words in count 
		
	  /*String str ="Java is a object oriented programming";
		
	   int ch=str.split(" ").length;
	   
	   System.out.println(ch);
*/		
		
		String ch ="Murali";
		
		for (int i =ch.length()-1; i>=0; i--) {
		
			System.out.print(ch.charAt(i));
		}
		
		String mu="K G kunta";
		
		char[] ch1= mu.toCharArray();
		
		for (int i = ch1.length; i < ch1.length; i++) {
			
		}
	}
}
