package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionTest2 {

	
	public static void main(String[] args) throws FileNotFoundException 
	{
	PrintWriter pw = new PrintWriter("Abc");
	pw.print("Hello");
	System.out.println(10/0);
	}
	
}
