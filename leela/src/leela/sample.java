

package leela;

public class sample {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//add(20,20);
		//factorial(5);
		//primenumber(4);
		
		//sample.findrepeatedcharacters();
	}

	public static void findrepeatedcharacters()
	{
		String str="Infosys";
		int counter=0;
		for (int i = 0; i < str.length()-1; i++) {

			if(str.valueOf(str.charAt(i)).equalsIgnoreCase("s"))
			{
			counter++;	
			}
		}
		
		System.out.println(counter);
	}

 public static void add(int a,int b)
 {
	 int c=0;
	 System.out.println(c=a+b);
 }

 public static void factorial(int number)
 {
	 int result=1;
	 while(number!=0)
	 {
		 result=result*number;
		 number--;
	 }
	 System.out.println(result);
 }
 
 public static void primenumber(int number)
 {
	 for (int i = 2; i <=number/2; i++) {
		
		 if(number%i==0)
		 {
			 System.out.println("it is not a prime number"+number);
			 break;
		 }
		 else
		 {
			 System.out.println("it is prime number"+number);
		 }
	}
	 
	
 }
}
