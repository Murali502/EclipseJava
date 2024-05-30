import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
dryRun = false,
glue ="",
strict = false,
plugin= {
		"pretty",
		"junit:target/cucumber-results.xml",
		"html:target/cucumber-html-report",
		"plugins.Logger:TestReport",
		"io.qameta.allura.cucumber4jvm.AllureCucumber4Jvm"
		
},

features = {"/src/test/java/features"},
tags="@BusinessCustomerCreation"
)

public class Runner {
	

}
