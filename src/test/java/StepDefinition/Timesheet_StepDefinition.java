package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Timesheet_StepDefinition {

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		System.out.println("the user is on the home page");  
	}

	@Given("the user enters the name as {string}")
	public void the_user_enters_the_name_as(String string) {
		System.out.println("the user enters the name as {string}");  

	}

	@Given("clicks on the view option")
	public void clicks_on_the_view_option() {
		System.out.println("clicks on the view option");  

	}
	
	@Then("the user should see the message as {string}")
	public void the_user_should_see_the_message_as(String string) {
		System.out.println("the user should see the message as {string}");  

	}

}
