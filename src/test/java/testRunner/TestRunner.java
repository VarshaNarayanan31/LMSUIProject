package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","html:target/TestReports/HTML/index.html",
                "junit:target/TestReports/junit/report.xml",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose

        monochrome=false,
        features = {"src/test/resources/features"}, //location of feature files
        glue={"stepdefinition"},
        publish=true) //location of step definition file


public class TestRunner {

}
