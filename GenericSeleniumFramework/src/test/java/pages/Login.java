package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.TestDataHelper;

public class Login extends BaseWebPage{

	//public Login(ScenarioContext scenarioContext)
	
	
	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
By Username =By.id("userName");	
By password =By.id("userName");
By LoginButton =By.id("userName");

public Login loginToApplication(String loginType) throws Exception
{
   String username;
   String password;
   String Url=TestDataHelper.getcurrentEnvironmentConfiguration().getURL();
	if(loginType.equalsIgnoreCase("user"))
	{
		username =TestDataHelper.getcurrentEnvironmentConfiguration().getUserName();
		username =TestDataHelper.getcurrentEnvironmentConfiguration().getPassword();
		
	}
	return this;
}


private WebElement searchedNumber(String num)
{
   try { return getcommands().getDriver().findElement(By.xpath(""));
   
   }catch(NoSuchElementException e) { 
	
	   e.printStackTrace();
	   throw e;
   }
   
}


}
