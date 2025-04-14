package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utilities.ConfigReader;
import Utilities.Hooks;

public class loginPage {
	WebDriver driver = Hooks.driver;

    @Given("I open the login page")
    public void iOpenTheLoginPage() {
        driver.get(ConfigReader.getProperty("APP_URL"));
    }

    @When("I enter valid credentials and submit")
    public void iEnterValidCredentialsAndSubmit() {
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys(ConfigReader.getProperty("UserName"));

        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(ConfigReader.getProperty("Password"));

        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();
    }

    @Then("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToTheDashboard() {
        WebElement dashboardHeader = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        assert dashboardHeader.isDisplayed() : "Dashboard is not displayed";
    }
}