package stepDefinitions;

import org.junit.Assert;

import baseClass.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Logout;
public class logout_SD extends TestBase{

    public Logout logout= new Logout();

    @When("Admin Clicks on LogOut button")
    public void admin_User_Staff_Clicks_on_LogOut_button() {
       // logout.clickLogout();
    }


    @Then("Admin should be navigated to Login Screen")
    public void admin_User_Staff_should_be_navigated_to_Login_Screen() {

        String title = driver.getTitle();
        Assert.assertEquals("Login", title);
        System.out.println("Admin is on " + title + " Page" );
    }

}