package stepdefinitions;

import Core.ScenarioContext;
import junit.framework.Assert;
import pages.Login;

public class ActualSteps extends BaseStep {
	
	
	
public ActualSteps(ScenarioContext scenarioContext) {
		super(scenarioContext);
		// TODO Auto-generated constructor stub
	}

public void ActualSteps(String loginType) throws Exception
{
   getPage(Login.class).loginToApplication(loginType);
  // Assert.assertTrue("Failed to Login", getpage());
}

}

