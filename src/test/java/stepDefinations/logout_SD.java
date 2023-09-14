package stepDefinations;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Logout_POM;
public class logout_SD extends TestBase{

    public Logout_POM logout= new Logout_POM();

    @When("Admin Clicks on LogOut button")
    public void admin_User_Staff_Clicks_on_LogOut_button() {

        logout.clickLogout();
    }


    @Then("Admin should be navigated to Login page")
    public void admin_should_be_navigated_to_Login_page() {

        String title = driver.getTitle();
        Assert.assertEquals("Login", title);
        System.out.println("Admin is on " + title + " Page" );
    }

}