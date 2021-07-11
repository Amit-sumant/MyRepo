package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
		(
		features = "C:\\Users\\mypc\\eclipse-workspace\\FreeCRMBDDFramework\\src\\main\\java\\features\\login.festures",
		glue= "stepDefination",
		dryRun=	false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
		)
public class TestRunner
{

}
