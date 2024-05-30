import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annonations {
	
	
	@BeforeClass
	public void BeforeClass()
	{
		
		System.out.println("This is my BeforeClass Test1 method");
	}
	
	@AfterClass
	public void AfterClass()
	{
		
		System.out.println("This is my AfterClass Test1 method");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		
		System.out.println("This is my BeforeMethod Test1 method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		
		System.out.println("This is my AfterMethod Test1 method");
	}
	
	
	@Test
	public void Test1()
	{
		
		System.out.println("This is my First Test1 method");
	}
	
	@Test
	public void Test2()
	{
		
		System.out.println("This is my First Test2 method");
	}
	

}
