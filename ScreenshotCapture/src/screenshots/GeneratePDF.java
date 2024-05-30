package screenshots;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {

	public static WebDriver driver;
	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
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

		// take the screenshot and store it in byte[] array format
				byte[] input = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				Document document = new Document();
			    String output = "C:\\Users\\girish\\Desktop\\Resources\\Screenshots\\" + "nameOfFile" + ".pdf";
			    FileOutputStream fos = new FileOutputStream(output);

			    // Instantiate the PDF writer
			    PdfWriter writer = PdfWriter.getInstance(document, fos);

			    // open the pdf for writing
			    writer.open();
			    document.open();

			    // process content into image
			    Image im = Image.getInstance(input);

			    //set the size of the image
			    im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);

			    // add the image to PDF
			    document.add(im);
			    document.add(new Paragraph(" "));

			    //close the files and write to local system
			    document.close();
			    writer.close();
		    }
		
	}



