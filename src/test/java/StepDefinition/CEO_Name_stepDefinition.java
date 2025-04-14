package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CEO_Name_stepDefinition {

	@Given("the user is logged in successfully and is on the home page")
    public void the_user_is_logged_in_successfully_and_is_on_the_home_page() {
        System.out.println("The user is logged in successfully and is on the home page");
    }

    @When("the user clicks on the directory option from the menu bar")
    public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
        System.out.println("The user clicks on the directory option from the menu bar");
    }

    @When("the user selects the job title as {string} from the dropdown")
    public void the_user_selects_the_job_title_as_from_the_dropdown(String jobTitle) {
        System.out.println("The user selects the job title as " + jobTitle + " from the dropdown");
    }

    @When("clicks on the search button")
    public void clicks_on_the_search_button() {
        System.out.println("Clicks on the search button");
    }

    @Then("the user should see the CEO name as {string}")
    public void the_user_should_see_the_ceo_name_as(String ceoName) {
        System.out.println("The user should see the CEO name as " + ceoName);
    }
}