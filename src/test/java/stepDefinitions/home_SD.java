package stepDefinitions;
import java.util.List;

import io.cucumber.java.Before;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import baseClass.TestBase;
import pages.Home_POM;
public class home_SD extends TestBase {
    public Home_POM home = new Home_POM();
    @Before
    //tag1
    @Given("Admin launch the browser")
    public void admin_launch_the_browser() {
        driver.get("url");
    }
    @When("Admin gives the correct LMS portal URL")
    public void admin_gives_the_correct_lms_portal_url() {
        Initialization();
    }

    @Then("Admin lands on the home page")
    public void admin_lands_on_the_home_page() {
        home.verifyurl();
    }
    @When("Admin gives the invalid LMS portal URL")
    public void admin_gives_the_invalid_lms_portal_url() {
        driver.get("url");
    }

    @Then("Admin receives {int} page not found error")
    public void admin_receives_page_not_found_error(Integer int1) {
        home.verifyurl();
    }

    @Then("HTTP response >= {int}. Then the link is broken")
    public void http_response_then_the_link_is_broken(Integer int1) {
//pending;
    }

    @Then("Admin should see the L with text LEARNING")
    public void admin_should_see_the_l_with_text_learning() {
        home.verify_actual_fields();
        home.text_spelling();
    }

    @Then("Admin should see the M with text MANAGEMENT")
    public void admin_should_see_the_m_with_text_management() {
        home.verify_actual_fields();
        home.text_spelling();
    }

    @Then("Admin should see the S with text SYSTEM")
    public void admin_should_see_the_s_with_text_system() {
        home.verify_actual_fields();
        home.text_spelling();
    }
    @Then("Admin see correct logo of the LMS")
    public void admin_see_correct_logo_of_the_lms() {

        home.verifylogo();
    }
    @Then("Admin should see logo is properly aligned")
    public void admin_should_see_logo_is_properly_aligned() {
       // home.verifylogin_allgin();
    }
    @Then("Admin should see login button")
    public void admin_should_see_login_button() {

        home.verify_loginBtn();
    }
    @Then("Admin should able to click the Login button")
    public void admin_should_able_to_click_the_login_button() {

        home.loginBtn();
    }


}