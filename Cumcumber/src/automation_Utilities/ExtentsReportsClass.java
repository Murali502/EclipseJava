package automation_Utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentsReportsClass {
	public static ExtentReports testreports;

public synchronized static ExtentReports getlogger(String path){
    if(testreports == null){
        //Set HTML reporting file location
        //String workingDir = System.getProperty("user.dir");
    	testreports = new ExtentReports(path, false);
    	testreports.addSystemInfo("Test Environment","Test 1");
    	testreports.addSystemInfo("Test Cycle","Regression");
    	testreports.addSystemInfo("UserName","Murali Golla");
        //reporter.loadConfig(Resources.getResource("extent-config.xml"));
    }
    return testreports;
}
	
}
