package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Core.ScenarioContext;
import constants.Constants;
import utilities.PropertyUtil;
import webautomation.WebDriverUtil;

public class PreRequesiteSteps extends BaseStep {

	private ScenarioContext scenarioContext;
	
	public PreRequesiteSteps(ScenarioContext scenarioContext) {
		super(scenarioContext);
		this.scenarioContext=scenarioContext;
		// TODO Auto-generated constructor stub
	}

	
	public void i_launch_browser_session(String browser) throws Exception
	{
		WebDriver driver=null;
		
		switch(browser.toUpperCase())
		{
		case "CHROME" :
			driver =initializeChromeSession();
		    break;
		    default:
		    	throw new Exception ("Browser " +browser+ "not completed ");
		}
		
		scenarioContext.registerInstance(Constants.WEBDRIVER_KEY, driver);
	}
	
	private WebDriver initializeChromeSession()
	{
		String hubUrl = new PropertyUtil().getProperty("seleniumhub");
		String useSeleniumGrid = new PropertyUtil().getProperty("useSeleniumGrid");
		WebDriverUtil driverFactory = new WebDriverUtil();
		WebDriver driver=null;
		
		if(useSeleniumGrid.equalsIgnoreCase("true"))
		{
		    System.out.println("Launch Chrome Browser in Selenium Grid");
		  //  driver = driverFactory.create
		}
		
		else
		{
			 System.out.println("Launch Chrome Browser in Selenium Grid");
			 System.setProperty("webdriver.chrome.driver", "");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}
}
