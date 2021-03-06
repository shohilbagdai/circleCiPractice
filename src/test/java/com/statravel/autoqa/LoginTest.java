package com.statravel.autoqa;

import com.statravel.autoqa.commons.WebDriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author STA Development Team
 *
 */
@CucumberStepsDefinition
public class LoginTest {

    /**
    * 
    */
    @Before
    public void init() {

    }

    /**
     * 
     */
    @Given("^I am on the login page$")
    public void loadLoginPage() {
        WebDriverFactory.getWebDriver()
                        .get("https://www.google.co.uk/");
        System.out.println("Entering url");

    }

    /**
     * 
     */
    @When("^I log in$")
    public void logIn() {
        System.out.println("log in");
    }

    /**
     * 
     */
    @Then("^I should be redirected to the home page$")
    public void redirectToHomePage() {
        System.out.println("redirect to homepage");
    }

}
