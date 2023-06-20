package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = { "src\\test\\resources\\execution" },

		glue = { "execution" },

		plugin = { "pretty" },

		//dryRun = true, // To check whether all steps inside the feature file are glued with
						// the stepDefinition or not without any browser launching..

		publish = true

)

public class RunAmazonTest extends AbstractTestNGCucumberTests {

}
