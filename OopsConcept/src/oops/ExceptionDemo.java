package oops;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo obj = new ExceptionDemo();
        int l =0;
		int retuvalue =obj.valuereturn();
		System.out.println( retuvalue);
	/*	try
		{
			int a[]=new int[6];
			a[6]=8;
		int i=9/2;
		}
		
		catch(Exception e)
		{
			System.out.println("Error  ");
		}
		System.out.println("Bye");*/
		
	}

	public int valuereturn()
	
	{
		try
		{
		   return 10;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	/*	finally 
		{
			return 19;
		}*/
		return 0;
	}
	
	
}
