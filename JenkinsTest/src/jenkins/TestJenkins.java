package jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestJenkins {
	
	//@Parameters({"TestEnv","MyBrowser"})
	@Test
	public void openGoogle(/*String MyBrowser,String TestEnv*/) {

		System.out.println("Test  Started");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girish\\Desktop\\Resources\\chromedriver_win32 (1)\\chromedriver.exe");

		System.out.println("open browser");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("open google");
		driver.get("https://google.com");

		driver.quit();
		System.out.println("Test Ended");
	}
}

