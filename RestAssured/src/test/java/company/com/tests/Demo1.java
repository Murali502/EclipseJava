package company.com.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.net.ssl.X509ExtendedTrustManager;

import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import company.com.reporting.ExtentManager;
import company.com.utilities.RestassuredUtility;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {
	
	
	
	private ExtentReports extent;
	private ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
	
	String testData;
	
	@BeforeClass
	public void init() throws IOException
	{
		String filePath = System.getProperty("user.dir")+"";
		testData = new String(Files.readAllBytes(Paths.get(filePath)));
	}
	
	
	public void setup() {
		
		extent =ExtentManager.getInstance();
	}

	
	@Test
	public void TC1()
	{
		extentTest.set(extent.createTest("Test case one"));
		extentTest.get().log(Status.INFO, "Test cases started");
		
		RestassuredUtility requestSpecification = new RestassuredUtility();
		
		JSONObject jsonObject = new JSONObject(testData);
		
		JSONObject testdata=jsonObject.getJSONObject("TC1");
		extentTest.get().log(Status.INFO, "Request Body " + testdata.toString());
		
		RequestSpecification reqstage =requestSpecification.requestSpecificatin("URI",testdata);
		Response responsestage = RestassuredUtility.postRequest(reqstage, testData, null, testData, testData, null);
		
		RequestSpecification reqprod =requestSpecification.requestSpecificatin("URI",testdata);
		Response responseprod = RestassuredUtility.postRequest(reqstage, testData, null, testData, testData, null);
		
		
	}
	
}
