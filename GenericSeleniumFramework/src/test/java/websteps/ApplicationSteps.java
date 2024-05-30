package websteps;

import com.gargoylesoftware.htmlunit.javascript.host.Selection;

import Core.ScenarioContext;
import pages.*;
import stepdefinitions.BaseStep;

public class ApplicationSteps extends BaseStep {

	public ApplicationSteps(ScenarioContext scenarioContext) {
		super(scenarioContext);
		// TODO Auto-generated constructor stub
	}

	
	public void login_to_CRM(String loginType) throws Exception
	{
		getPage(Login.class).loginToApplication(loginType);
		getPage(SelectionPage.class).selectAwaiting();
	}
	
	public void Close_application()
	{
		getDriver().quit();
	}
}
