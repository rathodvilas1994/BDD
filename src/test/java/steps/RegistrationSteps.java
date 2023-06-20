package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	
	@Given("user should be at registration page")
	public void user_should_be_at_registration_page() {
	    System.out.println("Given statement");
	}

	@When("user enters the following information")
	public void user_enters_the_following_information(DataTable dataTable) {
	   
		List<List<String>> data = dataTable.asLists(String.class);
		
		List<String> firstIndexlist = data.get(0);
		System.out.println(firstIndexlist);   //this is to print the first list only
		
		for(List<String> value:data) 
		{
			System.out.println(value);
		}
	}

	@Then("user should see the app id")
	public void user_should_see_the_app_id() {
	   
		System.out.println("This is Then statement");
	}


}
