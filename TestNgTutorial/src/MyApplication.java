import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApplication {

	@Test
	public void Startapp()
	{
		
		Assert.assertEquals(4, 7);
		System.out.println("Starting app");
	}
	
	@Test(dependsOnMethods="Startapp")
	public void Loginapp()
	{
		
		System.out.println("Login to App");
	}
	
	@Test(dependsOnMethods="Loginapp")
	public void logoutApp()
	{
		
		System.out.println("Logout App");
	}
}
