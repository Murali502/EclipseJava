package screenshots;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CompareScreenshots {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girish\\Desktop\\Resources\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("-incognito");
		options.addArguments("--disable-popup-blocking");
		Map<String,Object> prefs=new HashMap();
		options.setExperimentalOption("prefs",prefs);
		driver =new ChromeDriver(options);
		
		driver.manage().window().maximize();

		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		String screenshot_1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		 Thread.sleep(2000);
		 String screenshot_2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

		if(screenshot_1.equals(screenshot_2)){
			System.out.println("Screenshots are matching");
		}
		else{
			System.out.println("Screenshots are NOT matching");
		}
		driver.quit();
	}

}
