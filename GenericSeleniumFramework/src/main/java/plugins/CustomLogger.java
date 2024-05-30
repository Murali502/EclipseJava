package plugins;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CustomLogger {
	
	static ExtentReports extentReports;
	public static ExtentTest extenTest;
	
	public static void initializeReport(String filePath)
	{
		extentReports =new ExtentReports(filePath);
	}
	
	public static ExtentTest startTest(String testcaseName)
	{
		if(extentReports == null) throw new RuntimeException("Please initialize report first using initializeReport(filepath)");
		extenTest = extentReports.startTest(testcaseName);
		return extenTest;
	}
	
	public static void endTest()
	{
		
		if(extentReports == null) throw new RuntimeException("Please initialize report first using initializeReport(filepath)");
		if(extenTest == null) throw new RuntimeException("Please initialize report first using initializeReport(filepath)");
		extentReports.endTest(extenTest);
		
	}
	
	
	public static void log(LogStatus logStatus,String message)
	{
		if(extenTest == null) throw new RuntimeException("Please initialize report first using initializeReport(filepath)");
		extenTest.log(logStatus, message);
		
	}
	
	public static void closeReport()
	{
		extentReports.flush();
		extentReports.close();
	}
	public void attachScreenshot(LogStatus status, String screenshotBase64)
	{
		extenTest.log(status, extenTest.addBase64ScreenShot(screenshotBase64));
	}

	
}