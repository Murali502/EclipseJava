package exception;

public class ExceptionTest {

	
	public static void main(String[] args) 
	{
	doStuff();
	}
	public static void doStuff()
	{
	doMoreStuff();
	System.out.println(10/0);
	}

	public static void doMoreStuff()
	{
	System.out.println("Hello");
	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
}
