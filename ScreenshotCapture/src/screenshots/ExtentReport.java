package screenshots;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentReports report=new ExtentReports(System.getProperty("user.dir")+"/Reports/"+System.currentTimeMillis()+".html",true);
		ExtentTest logger=report.startTest("Log in to application");
		logger.log(LogStatus.INFO, "login to application sucesfully");
		report.endTest(logger);
		report.flush();
		report.close();
		System.out.println("Execution is completed");
		
		
		
	}

}
