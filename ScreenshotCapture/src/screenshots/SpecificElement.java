package screenshots;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpecificElement {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		  // set the geckodriver.exe property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girish\\Desktop\\Resources\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("no-sandbox");
		Map<String,Object> prefs=new HashMap();
		options.setExperimentalOption("prefs",prefs);
		driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get("https://chercher.tech/selenium-webdriver-sample");

		  //Locate Image element to capture screenshot.
		  WebElement element = driver.findElement(By.xpath("//input"));

		  //Capture entire page screenshot as File.
		  //Used TakesScreenshot, OutputType Interface of selenium and File class of java to capture screenshot of entire page.
		  File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		  //Used selenium Point class to get x y coordinates of Image element.
		  //get location(x y coordinates) of the element.
		  Point point = element.getLocation();
		  int xcordinate = point.getX();
		  int ycordinate = point.getY();

		  //Used selenium getSize() method to get height and width of element.
		  //Retrieve width of element.
		  int imageWidth = element.getSize().getWidth();
		  //Retrieve height of element.
		  int imageHeight = element.getSize().getHeight();

		  //Reading full image screenshot.
		  BufferedImage img = ImageIO.read(screen);

		  //cut Image using height, width and x y coordinates parameters.
		  BufferedImage destination = img.getSubimage(xcordinate, ycordinate, imageWidth, imageHeight);
		  ImageIO.write(destination, "png", screen);
		  
		  //save Image screenshot In D: drive.
		  FileUtils.copyFile(screen, new File("C:\\Users\\girish\\Desktop\\Resources\\Screenshots\\element.png"));
		  
		  driver.quit();
	}
}