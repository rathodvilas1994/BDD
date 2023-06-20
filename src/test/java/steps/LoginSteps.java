package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("User is at the login screen")
	public void user_is_at_the_login_screen() {
	  System.out.println("Given statement");
	}

	@When("User enters the username")
	public void user_enters_the_username() {
	   System.out.println("When first statement");
	}

	@When("User enters the password")
	public void user_enters_the_password() {
		 System.out.println("When second statement");
	}

	@When("User click on login button")
	public void user_click_on_login_bitton() {
		 System.out.println("When third statement");
	}

	@Then("User should get redirect to the home page")
	public void user_should_get_redirec_t_to_the_home_page() {
		 System.out.println("Then statement");
	}
	
	@When("User enter the incorrect username")
	public void user_enter_the_incorrect_username() {
	  System.out.println("When for incorrect username");
	}

	@When("User enter incorrect password")
	public void user_enter_incorrect_password() {
		  System.out.println("When for incorrect password");
	}

	@Then("User should not get error message")
	public void user_should_not_get_error_message() {
		  System.out.println("Then for error message");
	}


	

}
