package screenshots;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fullpage {
	public static WebDriver driver;
	static FileInputStream fs;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girish\\Desktop\\Resources\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("no-sandbox");
		Map<String,Object> prefs=new HashMap();
		options.setExperimentalOption("prefs",prefs);
		driver =new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Go to URL
		driver.get("https://chercher.tech/selenium-webdriver-sample");
		// Take ScreenShot
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\girish\\Desktop\\Resources\\Screenshots\\pic.png"), true);

		// Close Driver
		driver.quit();
		
	}

}


