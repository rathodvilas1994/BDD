package execution;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHooks {
	
	WebDriver driver;
	DriverFactory driverfactory;
	
	@Before
	public void launchBrowser() 
	{
		 driverfactory=new DriverFactory();
		
		 driver = driverfactory.initBrowser();
		
		driver.manage().window().maximize();
	}
	@After
	public void closeBrowser() 
	{
		driver.close();
	}

}
