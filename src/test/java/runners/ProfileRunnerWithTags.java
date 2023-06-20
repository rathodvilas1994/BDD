package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\applicationtest\\Profile.feature"},
		
		glue= {"steps"},
		
		//tags="@sanity or @functional",
		
		//tags="@sanity and @functional",
		
		tags="not @regression",
		
		plugin= {"pretty"},
		
		publish=true
		
		
		)

public class ProfileRunnerWithTags extends AbstractTestNGCucumberTests {

}
