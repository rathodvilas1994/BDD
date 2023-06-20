package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {

	@Given("user is at the add profile page")
	public void user_is_at_the_add_profile_page() {
		System.out.println(">>Given for add profile");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
		System.out.println(">>When for adding informstion");
	}

	@Then("profile gets created")
	public void profile_gets_created() {
		System.out.println(">>Then for creation of profile");
	}

	@Given("user is at profile page")
	public void user_is_at_profile_page() {
		System.out.println(">>Given for updation of profile");
	}

	@When("user click on edit link")
	public void user_click_on_edit_link() {
		System.out.println(">>When for update profile");
	}

	@When("update the information")
	public void update_the_information() {
		System.out.println(">>When for update profile");
	}

	@Then("profile gets updated")
	public void profile_gets_updated() {
		System.out.println(">>Then for updatin of profile");
	}

	@When("user click on delete button")
	public void user_click_on_delete_button() {
		System.out.println(">>When for delete profile");
	}

	@Then("profile should  gets deleted")
	public void profile_should_gets_deleted() {
		System.out.println(">>Then for deletion");
	}

}
