package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	

@Given("user is at the application login screen")
public void user_is_at_the_application_login_screen() {
    System.out.println("Given statement");
}

@When("user enters {string} in username field")
public void user_enters_in_username_field(String username) {
	System.out.println("username is :"+username);
}

@When("user enters {string} in password field")
public void user_enters_in_password_field(String password) {
	System.out.println("password is :"+password);
}

@When("click on the signin button")
public void click_on_the_signin_button() {
	System.out.println("click on login");
}

@Then("user should get error message")
public void user_should_get_error_message() {
	System.out.println("user gets error message");
}


}
