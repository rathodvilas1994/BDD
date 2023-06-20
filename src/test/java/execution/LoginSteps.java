package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import qa.DriverFactory;

public class LoginSteps {
	
	LoginPage loginpage=new LoginPage(DriverFactory.getDriver());
	static String title;

	@Given("user is at landing page")
	public void user_is_at_landing_page() {
		
		WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.amazon.in/");
		
	}

	@When("user gets the title of page")
	public void user_gets_the_title_of_page() {
		
		 title = loginpage.getTitleOfPage();
		
	}

	@Then("page title should contains {string}")
	public void page_title_should_contains(String string) {
		
		boolean ispresent = title.contains(string);
		
		Assert.assertEquals(ispresent, true);
		
	}

	@Then("cart icon should get display")
	public void cart_icon_should_get_display() {
		
		boolean isdisplay = loginpage.isCartdisplaying();
		
		Assert.assertEquals(isdisplay, true);
		
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		
		loginpage.enterUsername(string);
		
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		
		loginpage.enterPassword(string);
		
	}

	@When("user confirms signin")
	public void user_confirms_signin() {
		
		loginpage.finalSignin();
		
	}

}
