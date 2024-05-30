import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FristTestNg {
	
	@Test(priority=1, description = "This test will verify the login")
	public void loginapplication()
	{
		
		System.out.println("This is my frist test");
		Assert.assertEquals(5, 6);
	}
	
	@Test(priority=2,description = "This test will verify the login")
	public void SelectItems()
	{
		
		System.out.println("This is my SelectItems");
	}
	
	@Test(priority=3,description = "This test will verify the login")
	public void Checkout()
	{
		
		System.out.println("This is SelectItems");
	}
}
