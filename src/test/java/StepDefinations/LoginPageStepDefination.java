package StepDefinations;

import constants.PageLocators;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tasks.PerformableWebTask;
import Utility.BrowserDriver;

import java.util.concurrent.TimeUnit;

import static Utility.BrowserDriver.driver;

public class LoginPageStepDefination {

    @Given("^User navigates to the login page$")
    public void user_navigate_to_the_login_page() {
        PerformableWebTask.clickOnMenu(driver);
        PerformableWebTask.signInLink(driver);
    }

    @When("user successfully enters the login details")
    public void user_successfully_enters_the_login_details() {
        PerformableWebTask.sendKeysUsername(driver);
        PerformableWebTask.sendKeysPassword(driver);
        PerformableWebTask.clickOnLoginbutton(driver);
    }

    @Then("User is able to view the product categories")
    public void user_is_able_to_view_the_product_categories() {
        PerformableWebTask.viewProductCategories(driver);
    }
}
