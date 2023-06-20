package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"src\\test\\resources\\applicationtest\\Formfilling.feature"},
		
		glue= {"steps"},
		
		publish=true
		
		)


public class DataTableRunner extends AbstractTestNGCucumberTests {

}
