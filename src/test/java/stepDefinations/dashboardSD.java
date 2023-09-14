package stepDefinations;

import io.cucumber.java.en.*;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import baseClass.TestBase;
import pages.Dashboard_POM;

public class dashboardSD {

    WebDriver driver;
    Dashboard_POM dashboard = new Dashboard_POM(driver);

    @Given("Admin is in the login page")
    public void admin_is_in_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        driver = new ChromeDriver();
         
        driver.get("url"); 
    }

    @When("Admin enters valid credentials and clicks the login button")
    public void admin_enters_valid_credentials_and_clicks_the_login_button() {
        dashboard.clickLogin(); 
    }
 
    @Then("Admin should see {string} as the header")    
    public void admin_should_see_as_the_header_string_manage_program(String string) {
    	dashboard.verifyProgramTitle();
    }

    @Then("Admin should wait for a maximum navigation time in milliseconds, which defaults to {int} seconds")
    //public void admin_should_wait_for_max_navigation_time_int_30_maxSeconds(int maxSeconds) {
        //dashboard.waitForNavigation(maxSeconds * 1000);
    //}

    @Then("Admin should receive an HTTP response >= {int}, indicating that the link is broken")
    //public void admin_should_receive_an_http_response(int responseCode) {
       // int actualResponseCode = dashboard.getHttpResponseCode("url");
    // s}
    
    @Then("Admin should see {string} as the title")
    public void admin_should_see_as_the_title(String string) {
    dashboard.verifyLMSTitle(); 
    }

    @Then("LMS title should be on the top left corner of the page")
    public void lms_title_should_be_on_the_top_left_corner_of_the_page() {
       //Point lmsTitleLocation = dashboard.getLMSTitleLocation();
        //Assert.assertTrue(lmsTitleLocation.getX() < 100 && lmsTitleLocation.getY() < 100);
    }
    

    @Then("Admin should see correct spelling in the navigation bar text")
    public void admin_should_see_correct_spelling_in_the_navigation_bar_text() {
        //List<String> expectedNavigationBarText = Arrays.asList("Home", "Dashboard", "Profile", "Settings");
        //List<String> actualNavigationBarText = dashboard.getNavigationBarText();
        
        //for (int i = 0; i < expectedNavigationBarText.size(); i++) {
            //Assert.assertEquals(actualNavigationBarText.get(i), expectedNavigationBarText.get(i));
        }
    

    @Then("Admin should see correct spelling and space in the LMS title")
    public void admin_should_see_correct_spelling_and_space_in_the_lms_title() {
        String expectedLMSTitle = "LMS - Learning Management System";
        String actualLMSTitle = dashboard.getLMSTitleText();
        
        Assert.assertEquals(actualLMSTitle, expectedLMSTitle);
    }

    @Then("Admin should see the navigation bar text on the top right side")
    public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
        //Point navigationBarLocation = dashboard.getNavigationBarLocation();
        int screenWidth = driver.manage().window().getSize().getWidth();
        
        //Assert.assertTrue(navigationBarLocation.getX() > screenWidth - 200); // Assuming 200 pixels from the right
    }

    @Then("Admin should see {string} in the 1st place")
    public void admin_should_see_in_the_1st_place(String Student) {
    	assertEquals("Student",dashboard.selectHeaderText().get(0).getText(),"Student is not in the 1st place");
	}
    

    @Then("Admin should see {string} in the 2nd place")
    public void admin_should_see_in_the_2nd_place(String Program) {
    	assertEquals("Program",dashboard.selectHeaderText().get(1).getText(),"Program is not in the 2nd place");
    }

    @Then("Admin should see {string} in the 3rd place")
    public void admin_should_see_in_the_3rd_place(String string) {
    	assertEquals("Batch",dashboard.selectHeaderText().get(2).getText(),"Batch is not in the 3rd place");
    }

    @Then("Admin should see {string} in the 4th place")
    public void admin_should_see_in_the_4th_place(String string) {
    	assertEquals("class",dashboard.selectHeaderText().get(3).getText(),"class is not in the 4th place");
    }

    @Then("Admin should see {string} in the 5th place")
    public void admin_should_see_in_the_5th_place(String User) {
    	assertEquals("User",dashboard.selectHeaderText().get(4).getText(),"User is not in the 5th place");
    	}

    @Then("Admin should see {string} in the 6th place")
    public void admin_should_see_in_the_6th_place(String Assignment) {
    	assertEquals("Assignment",dashboard.selectHeaderText().get(5).getText(),"Assignment is not in the 6th place");
    }

    @Then("Admin should see {string} in the 7th place")
    public void admin_should_see_in_the_7th_place(String Attendance) {
    	assertEquals("Attendance",dashboard.selectHeaderText().get(6).getText(),"Attendance is not in the 7th place");
    }

    @Then("Admin should see {string} in the 8th place")
    public void admin_should_see_in_the_8th_place(String Logout) {
    	assertEquals("Logout",dashboard.selectHeaderText().get(7).getText(),"Logout is not in the 7th place");
    }

    @Given("Admin is in the dashboard page")
    public void admin_is_in_the_dashboard_page() {
    	 //WebElement dashboardLink = driver.findElement(By.linkText("Dashboard"));
         //dashboardLink.click();
         //WebDriverWait wait = new WebDriverWait(driver, 10); 
         //wait.until(ExpectedConditions.urlContains("dashboard")); 
    	driver.get("url");
    	}
 
    

    @When("Admin clicks the Logout button on the navigation bar")
    public void admin_clicks_the_logout_button_on_the_navigation_bar() {
        dashboard.clickLogout();
    }
 


@Then("Admin should land on the login page")
public void admin_should_land_on_the_login_page() {
    String loginPageURL = "URL";
    String currentURL = driver.getCurrentUrl();
    
   
    Assert.assertEquals(currentURL, loginPageURL);

}
 

public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
}

