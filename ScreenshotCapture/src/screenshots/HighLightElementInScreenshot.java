package screenshots;

import java.io.File;
import java.io.IOException;
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

public class HighLightElementInScreenshot {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
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
		// store the webelement
		WebElement element_node = driver.findElement(By.xpath("//input"));
		// pass the stored webelement to javascript executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// highlight the element with red border 3px width
		jse.executeScript("arguments[0].style.border='3px solid red'", element_node);
		// added sleep to give little time for browser to respond
		Thread.sleep(3000);

		// Take ScreenShot
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// store the converted file as Image on D driver
		FileUtils.copyFile(file, new File("D:\\Element With Highlight.png"), true);
		driver.quit();
  }
	}

