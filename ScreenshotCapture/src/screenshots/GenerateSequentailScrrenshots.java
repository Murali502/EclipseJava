package screenshots;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerateSequentailScrrenshots {

	 static ArrayList screenshots = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList screenshots = new ArrayList();
		System.setProperty("webdriver.chrome.driver", "D:\\PATH\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://google.com");

		// take the screenshot 1 and store it
		screenshots.add(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));

		driver.get("https://chercher.tech/java/index-selenium-webdriver");
		// take the screenshot 2 and store it
		screenshots.add(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
		
		GeneratePDF(screenshots);
	}

	public static void GeneratePDF(ArrayList screenshots)
	{
		Document document = new Document();
		PdfWriter writer ;
		Image im = null;
		//FileOutputStream fos = new FileOutputStream("C:\\PATH\\Zip\\" + "series of screenshots" + ".pdf");
		//writer = PdfWriter.getInstance(document, fos);
		
		/*for (byte[] bytes : screenshots) {

			// process content into an image
			im = Image.getInstance(bytes);
			//set the size of the image
			im.scaleToFit(PageSize.A4.getWidth()/2, PageSize.A4.getHeight()/2);

			document.add(new Paragraph(" "));
			document.add(new Paragraph("Chercher Tech website"));

			// add the image to PDF
			document.add(im);
			System.out.println("added");
	}
*/		document.close();
		//writer.close();
}
}