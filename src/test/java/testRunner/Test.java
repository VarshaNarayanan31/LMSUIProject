package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
public class Test {
    @RunWith(Cucumber.class)


    @CucumberOptions(features ={"src/test/resources/features"},
            glue = {"stepDefinitions","Hooks"},
            monochrome = true,
            plugin = {"pretty",
                    "",
                    "",
                    "",
                    ""})

    public class TestRunner {

    }
}
