package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Class_POM;
import pages.User_POM;

public class UserSD {
	WebDriver driver;
	
	Class_POM classPom = new Class_POM( driver);	
	User_POM user = new User_POM( driver);
	
	
	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	    user.clickUser();
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
	    user.verifyurl();
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
	    user.verifyUserTitle();
	}

	@Then("Admin Should see the data table with headers Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_headers_id_name_location_phone_number_edit_delete() {
	    user.headerValidation();
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	    user.DisabledDeleteIcon();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
	    user.NewUserButton();
	}

	@Then("Admin should be able to see the search text box")
	public void admin_should_be_able_to_see_the_search_text_box() {
	    user.searchBox();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	    user.checkBox();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	    user.chkEditBtnIsDisplayed();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    user.chkDeleteBtnIsDisplayed();
	}

	@Given("Admin is on dashboard page after Login and Admin clicks {string} from navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_admin_clicks_from_navigation_bar(String string) {
		driver.get("url");
		user.clickUser();
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
	    user.newUserClk();
	}

	@Then("A new pop up with User details appears")
	public void a_new_pop_up_with_user_details_appears() {
	   user.addUserWindow();
	}
	
	@Given("The delete icon on row level in data table is enabled")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {
		user.chkDeleteBtnIsDisplayed();
	}

	@When("Admin clicks the delete icon")
	public void admin_clicks_the_delete_icon() {
		classPom.DeleteButtonRight();
	}

	@Then("Alert appears with yes and No option")
	public void alert_appears_with_yes_and_no_option() {
		classPom.yesBtn();
		 classPom.noBtn();
	}

	
	@When("Admin click yes option")
	public void admin_click_yes_option() {
		classPom.yesButtonClick();
	}

	@Then("User deleted alert pops and user is no more available in data table")
	public void user_deleted_alert_pops_and_user_is_no_more_available_in_data_table() {
		classPom.successMessage();
	    Integer deleteElement = classPom.chkDeletedRow();
	    assertEquals(0, deleteElement,"Row not deleted");
	}

	@When("Admin click No option")
	public void admin_click_no_option() {
		 classPom.noBtn();
	}

	@Then("User is still listed in data table")
	public void user_is_still_listed_in_data_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("None of the checkboxes in data table are selected")
	public void none_of_the_checkboxes_in_data_table_are_selected() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The delete icon under the {string} header should be disabled")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {
	    user.DisabledDeleteIcon();
	}

	@Given("One of the checkbox\\/ row is selected")
	public void one_of_the_checkbox_row_is_selected() {
		classPom.tickChkBox();
	}

	@When("Click delete icon below {string} header")
	public void click_delete_icon_below_header(String string) {
	    classPom.DeleteButton();
	}

	@Then("The respective row in the data table is deleted")
	public void the_respective_row_in_the_data_table_is_deleted() {
		String title =  classPom.verifyPageTitle();
	    assertEquals(title, "Manage Class", "Page Title do not match");
	    Integer deleteElement = classPom.chkDeletedRow();
	    assertEquals(0, deleteElement,"Row not deleted");
	    
	}

	@Given("Two or more checkboxes\\/row is selected")
	public void two_or_more_checkboxes_row_is_selected() {
		classPom.tickChkBox();
	    classPom.tickMultiChkBox();
	}


	
	


}
