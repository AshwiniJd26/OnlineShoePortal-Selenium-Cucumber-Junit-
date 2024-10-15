package Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserDriver {
    public static WebDriver driver;

    @Before
    public void setup() {
        this.driver = driver;
        System.setProperty("webdriver.chrome.driver", "C:/Users/ahire/IdeaProjects/Selenium/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
