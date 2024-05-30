package stepdefinitions;

import org.openqa.selenium.WebDriver;

import Core.ScenarioContext;
import constants.Constants;

public class BaseStep {
	
	ScenarioContext scenarioContext;
	
	public BaseStep(ScenarioContext scenarioContext)
	{
		this.scenarioContext=scenarioContext;
	}
 
	protected void print(String message)
	{
		System.out.println("Info"  + message);
	}
	
	public <Tpage> Tpage getPage(Class<Tpage> pageClass)
	{
		try {
		WebDriver driver=getDriver();
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
		
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public WebDriver getDriver()
	{
		return(WebDriver)this.scenarioContext.get(Constants.WEBDRIVER_KEY);
	}
	
}
