package logicalPrograms;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printstarasTraingle();
		// ReversalTraingle();
		//factorial(10);
		fabonaciseries(9);
		//primenumber(41);
		
		//reversnumber(2546);
		//printstar();
		}
		
	

	
	// printing stars as 
	public static void printstar()
	{
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 6; j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
			//******
		}

	public static void printstarasTraingle()
	{
		
		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j <=i; j++) {
				
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

	public static void ReversalTraingle()
	{
		
		for (int i = 0; i <6; i++) {
			
			for (int j = 0; j <5-i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
	}
 public static void StarStartbetween() 
 {
	 
	 for (int i = 0; i < 6; i++) {
		
		 for (int j = 0; j < 4; j++) {
			
		}
	}
 }
 
 public static void factorial(int number)
 {
	 int result=1;
	 for (int i = 1; i <=number; i++) {
		 
		 result=result*i;
		
	}
	 
	 System.out.println(result);
 }
               
 public static void fabonaciseries(int number)
 {
	 int temp=0,first=0,second=1;
	 System.out.print(temp);
	 for (int i = 0; i <=number; i++) {
		
		 temp=first;
		 first=second;
		 second=first+temp;
		 System.out.print(first);
	}
 }

 public static void primenumber(int prime)
 {
  
	 int flag=0;
	 for (int i = 2; i <=prime/2; i++) {
		
		 if(prime%i==0)
		 {
			 flag=1;
			 break;
		 }
		 
	}
	 
	 if(flag==1)
	 {
		 System.out.println("It is not a primnumber"+prime);
	 }
	 else
	 {
		 System.out.println("It is a primnumber"+prime);
	 }
	 
 }
 

 public static void reversnumber(int num)
 {
	 int  reversed=0;
		
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /=10;
			
		}
		System.out.println("Reversed Number: " + reversed);
				
 }
 
 
}


