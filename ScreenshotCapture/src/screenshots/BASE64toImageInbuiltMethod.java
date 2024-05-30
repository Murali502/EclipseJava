package screenshots;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BASE64toImageInbuiltMethod {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girish\\Desktop\\Resources\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("no-sandbox");
		Map<String,Object> prefs=new HashMap();
		options.setExperimentalOption("prefs",prefs);
		driver =new ChromeDriver(options);
		
		driver.manage().window().maximize();

		// set time limit to find the element
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Go to URL
		driver.get("https://chercher.tech/selenium-webdriver-sample");

		// Take ScreenShot
		String scrBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		// convert the BASE64 to File type
		File file = OutputType.FILE.convertFromBase64Png(scrBase64);
		// store the converted file as Image on D driver
		FileUtils.copyFile(file, new File("C:\\Users\\girish\\Desktop\\Resources\\Screenshots\\BASE64-Conerted-Image.png"), true);
		
		driver.quit();
  }
}
