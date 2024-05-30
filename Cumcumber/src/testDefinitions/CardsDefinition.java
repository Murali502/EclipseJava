package testDefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import automation_Utilities.ExtentsReportsClass;
import automation_Utilities.getdata;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.java.en.When;

public abstract class CardsDefinition extends getdata{

	public static ExtentReports testreports;
	public static ExtentTest logger;
	public static HashMap<String,String> globalmap;
	
	@When("^User executes \"([^\"]*)\" test case$")
	public static void user_executes_test_case(String arg1) throws IOException
	{
		if(testreports==null)
		{
			ExtentsReportsClass.getlogger(arg1);
		}
		globalmap=automation_Utilities.getdata.readDataSheet(arg1,Prop.getPropValues("Vendor_sheet_name"));
		
		for(Map.Entry<String, String> entry:globalmap.entrySet())
		{
			String key=entry.getValue();
			String value=entry.getValue();
			if(value==null)
			{
				globalmap.put(key, "");
			}
		}
		
		All_Global_Intitialisations(globalmap,logger);
		logger=testreports.startTest(globalmap.get("Test_Name"));
		
	}
}
