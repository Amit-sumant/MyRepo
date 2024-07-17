package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
		(
		features = "\\Users\\mypc\\eclipse-workspace\\NopcommerceBDDFramework\\src\\main\\java\\Features",
		glue= "stepDefination",
		dryRun=	false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
		) //glue defines exactly step defn available

public class TestRunner 
{
	
}
