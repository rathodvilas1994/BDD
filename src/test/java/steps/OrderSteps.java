package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps {

	@Given("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
		System.out.println("Background Given");
	}

	@When("User click on order button")
	public void user_click_on_order_button() {
		System.out.println("Background When");
	}

	@Then("User should redirect to the order page")
	public void user_should_redirect_to_the_order_page() {
		System.out.println("Background Then");
	}

	@When("User click on the order")
	public void user_click_on_the_order() {
		System.out.println("Scenario 1 When statement");
	}

	@Then("User should track the package")
	public void user_should_track_the_package() {
		System.out.println("Scenario 1 Then statement");
	}

	@When("User click on past order button")
	public void user_click_on_past_order_button() {
		System.out.println("Scenario 2 When statement");
	}

	@Then("User should see the information")
	public void user_should_see_the_information() {
		System.out.println("Scenario 2 Then statement");
	}

}
