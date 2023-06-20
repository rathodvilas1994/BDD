package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithDataSteps {
	
	@Given("User should be at the login screen")
	public void user_should_be_at_the_login_screen() {
	    System.out.println("given statement");
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	   System.out.println("when statement for username and value is "+uname);
	}

	@When("User enter the password as {string}")
	public void user_enter_the_password_as(String pwd) {
	  System.out.println("when statement for password and value is "+pwd);
	}

	@When("User click on {int} Login button")
	public void user_click_on_login_button(Integer int1) {
	   System.out.println("when statement for login button and valu is "+int1);
	}


	@Then("User should get logged in")
	public void user_should_get_logged_in() {
	   System.out.println("Then statement");
	}

	

}
