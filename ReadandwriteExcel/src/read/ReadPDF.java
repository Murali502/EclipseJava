package read;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadPDF {

	public static WebDriver driverthread;
	static FileInputStream fs;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\girish\\Desktop\\Resources\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("no-sandbox");
		Map<String,Object> prefs=new HashMap();
		options.setExperimentalOption("prefs",prefs);
		driverthread =new ChromeDriver(options);
		
		URL url=new URL("https://www.tutorialspoint.com//gradle//gradle_tutorial.pdf");
	    InputStream is=url.openStream();
	    BufferedInputStream fileparse=new BufferedInputStream(is);
	    PDDocument document=null;
	    document=PDDocument.load(fileparse);
	    String pdfContent=new PDFTextStripper().getText(document);
	    System.out.println(pdfContent);
	    
	    
	    
	
		
		
		
		
	}

}
