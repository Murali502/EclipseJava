package testNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	//@Parameters in the test method is used to fetch simple parameters values from parameters tag mentioned in the testng.xml
	@BeforeClass
	@Parameters({"Browser","URL"})
	public void setup(@Optional("Firefox")String browser1,String Url)
	{
		System.out.println("Browser"+browser1);
		System.out.println("URl"+Url);
	}
	
	
  @Test
  public void test() {
	  System.out.println("Test Method");
  }
}
