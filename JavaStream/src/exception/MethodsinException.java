package exception;

public class MethodsinException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
		
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//e.toString();
			//e.getMessage();
		}
		
	}
	
	

}
