package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber/cucumber-html-report", "json:target/cucumber/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"Utility","StepDefinations"}
)

public class TestRunner {


}
