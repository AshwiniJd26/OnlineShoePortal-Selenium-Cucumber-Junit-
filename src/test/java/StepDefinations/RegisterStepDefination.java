package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.PerformableWebTask;

import static Utility.BrowserDriver.driver;
import static org.junit.Assert.assertEquals;

public class RegisterStepDefination {
    @Given("User navigate to the Sign In Portal page")
    public void user_navigate_to_the_sign_in_portal_page() {
        PerformableWebTask.clickOnMenu(driver);
        PerformableWebTask.signInLink(driver);
    }

    @When("User clicks on the new user register button")
    public void user_clicks_on_the_new_user_register_button() {
        // Write code here that turns the phrase above into concrete actions
        PerformableWebTask.ClickOnNewUser(driver);
    }

    @Then("User should able to view registration page")
    public void user_should_able_to_view_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        PerformableWebTask.visiblity_registrationheading();
        String actualRegistrtationPageheading = PerformableWebTask.visiblity_registrationheading();
        assertEquals(actualRegistrtationPageheading, "User Registration Page");
    }

    @When("User enter salution")
    public void user_enter_salution() {
       PerformableWebTask.registrationSalutation(driver);
    }

    @When("User enter firstName")
    public void user_enter_first_name() {
        PerformableWebTask.enterFirstName(driver);
    }

    @When("User enter lastName")
    public void user_enter_last_name() {
        // Write code here that turns the phrase above into concrete actions
        PerformableWebTask.enterLastName(driver);
    }

    @When("User enter emailId")
    public void user_enter_email_id() {
        PerformableWebTask.enterEmailId(driver);
    }

    @When("User enter Contact")
    public void user_enter_contact() {
        PerformableWebTask.enterContact(driver);
    }
    @When("User enter Username")
    public void user_enter_username() {
        PerformableWebTask.sendKeysUsername(driver);
    }

    @When("User enter Password")
    public void user_enter_password() {
        PerformableWebTask.sendKeysPassword(driver);
    }

    @Then("User clicks on the submit button")
    public void user_clicks_on_the_submit_button() {
        PerformableWebTask.clickOnSubmitButton();
    }
}
