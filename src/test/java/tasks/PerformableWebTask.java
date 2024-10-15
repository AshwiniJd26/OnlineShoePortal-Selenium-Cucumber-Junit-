package tasks;
import constants.PageLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static Utility.BrowserDriver.driver;

public class PerformableWebTask {

    public static void clickOnMenu(WebDriver driver) {
        driver.findElement(By.xpath(PageLocators.menu_xpath)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void signInLink(WebDriver driver) {
        driver.findElement(By.xpath(PageLocators.signIn_link_xpath)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void ClickOnNewUser(WebDriver driver) {
        driver.findElement(By.xpath(PageLocators.newUser_button_xpath)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public static void registrationSalutation(WebDriver driver) {
       WebElement salution = driver.findElement(By.xpath(PageLocators.salution_dropdown_xpath));
        Select salutionDropDown = new Select(salution);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        salutionDropDown.selectByValue("Ms");
    }

    public static void sendKeysUsername(WebDriver driver){
        driver.findElement(By.id(PageLocators.username_text_id)).sendKeys("ashwinij");

    }
    public static void sendKeysPassword(WebDriver driver){
        driver.findElement(By.id(PageLocators.password_text_id)).sendKeys("Ashwini@3434");

    }
    public static void clickOnLoginbutton(WebDriver driver){
        driver.findElement(By.xpath(PageLocators.login_button_xpath)).click();
    }

    public static void viewProductCategories(WebDriver driver){
        String productCategory = driver.findElement(By.xpath(PageLocators.viewProductCategories)).getText();
        Assert.assertEquals(productCategory, "Formal Shoes");
    }
    public static void enterFirstName(WebDriver driver){
        driver.findElement(By.xpath(PageLocators.firstName_text_xpath)).sendKeys("Ashwini");
    }
    public static void enterLastName(WebDriver driver){
        driver.findElement(By.xpath(PageLocators.lastName_text_xpath)).sendKeys("Jd");
    }
    public static void enterEmailId(WebDriver driver){
        driver.findElement(By.id(PageLocators.emailId_text_id)).sendKeys("ahireashwini@gmail.com");
    }
    public static void enterContact(WebDriver driver){
        driver.findElement(By.id(PageLocators.contact_text_id)).sendKeys("9898789879");
    }
    public static void clickOnSubmitButton(){
        driver.findElement(By.xpath(PageLocators.submit_button_xpath)).click();
    }
    public static String visiblity_registrationheading() {
        String getRegistration =  driver.findElement(By.xpath(PageLocators.registration_heading_xpath)).getText();
        return getRegistration;
    }
}
