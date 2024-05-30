import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	
		@BeforeClass
		public void BeforeClass()
		{
			
			System.out.println("This is my BeforeClass1 for 2nd class method");
		}
		
		@BeforeClass
		public void BeforeClass1()
		{
			
			System.out.println("This is my BeforeClass2 for 2nd class method");
		}
		
		@AfterClass
		public void AfterClass()
		{
			
			System.out.println("This is my AfterClass for 2nd class method");
		}
		
		@BeforeMethod
		public void BeforeTest1()
		{
			
			System.out.println("This is my BeforeMethod for 2nd class method");
		}
		
		@AfterMethod
		public void AfterMethod()
		{
			
			System.out.println("This is my AfterMethod for 2nd class method");
		}
		
		
		@Test
		public void Test3()
		{
			
			System.out.println("This is my First Test3 method");
		}
		
		@Test
		public void Test4()
		{
			
			System.out.println("This is my First Test4 method");
		}

		@BeforeTest
		public void BeforeTest()
		{
			
			System.out.println("This is BeforeTest Annotation");
		}
		
		@AfterTest
		public void AfterTest()
		{
			
			System.out.println("This is AfterTest Annotation");
		}
	}

