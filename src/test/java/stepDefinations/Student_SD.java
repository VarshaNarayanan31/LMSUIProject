package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Assignment_POM;
import pages.StudentDetails_POM;

public class Student_SD {
	WebDriver driver;
	StudentDetails_POM stud = new StudentDetails_POM(driver);
	
	
	@Given("Admin is on the dashboard page after Login")
	public void admin_is_on_the_dashboard_page_after_login() {
		
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) {
	    stud.clickStudent();;
	}

	@Then("Admin should see the Student Details Page Title")
	public void admin_should_see_the_student_details_page_title() {
		
		Assert.assertEquals("Student Details Page", stud.getCurrentPageTitle());
	}


	@Then("Admin should see LMS-Learning management system as the title")
	public void admin_should_see_as_the_title(String string) {
		Assert.assertEquals("LMS-Learning management system", stud.getlmsTitle());
	}


	@Then("Admin should see a search box inside the student name dropdown")
	public void admin_should_see_a_search_box_inside_the_student_name_dropdown() {
	    Assert.assertTrue(stud.checkSearchBoxVisiblility("Student Name"));
	   
	}

	@Then("Admin should see a search box inside the batch id dropdown")
	public void admin_should_see_a_search_box_inside_the_batch_id_dropdown() {
		 Assert.assertTrue(stud.checkSearchBoxVisiblility("Batch Id"));
	}

	@Then("Admin should see the correct spelling of {string}")
	public void admin_should_see_the_correct_spelling_of(String string) {
	   Assert.assertTrue(stud.checkDropDownSpelling("select student name"));
	}

	@Then("Admin should see the correct spelling of {string} text")
	public void admin_should_see_the_correct_spelling_of_text(String string) {
		Assert.assertTrue(stud.checkDropDownSpelling("select batch id"));
	}

	@Then("Admin should see {string} as the first dropdown label")
	public void admin_should_see_as_the_first_dropdown_label(String string) {
	    stud.firstDropDownTitle(string);
	}

	@Then("Admin should see {string} as the second dropdown label")
	public void admin_should_see_as_the_second_dropdown_label(String string) {
	    stud.secondDropDownTitle(string);
	}

	@Then("Admin should be able to scroll down to select a name")
	public void admin_should_be_able_to_scroll_down_to_select_a_name() {
	    Assert.assertEquals(stud.selectNameFromStudentDropdown(), "sylvia");
	}

	@Then("Admin should be able to scroll down to select a batch")
	public void admin_should_be_able_to_scroll_down_to_select_a_batch() {
		Assert.assertEquals(stud.selectBatchIdFromBatchDropdown(), "3566");
	}


}
