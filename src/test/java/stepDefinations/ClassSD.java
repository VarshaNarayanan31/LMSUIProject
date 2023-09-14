package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Class_POM;

import baseClass.TestBase;


public class ClassSD {
	long start;
	long end;
	long responsetime;
	WebDriver driver;
	
	Class_POM classPom = new Class_POM( driver);
	ArrayList<String> sortedList;
	ArrayList<String> obtainedListAsc;
	ArrayList<String> obtainedListDesc;
	
	
	//Feature: Manage Class Page Verification_1
	
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		driver.get("url");
	}

	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {
		start = System.currentTimeMillis();
		classPom.clickClass();
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
		classPom.verifyurl();
		end = System.currentTimeMillis();
	}

	@Then("Get the response time for navigation from dashboard page to manage class page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page() {
		long responseTime = end - start;
		System.out.println("Response time" + responseTime);
	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String string) {
	    classPom.verifyClassTitle();
	}

	@When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
	public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see correct spelling for the all the fields")
	public void admin_should_see_correct_spelling_for_the_all_the_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see disabled delete icon below the {string}")
	public void admin_should_see_disabled_delete_icon_below_the(String string) {
	    classPom.DisabledDeleteIcon();
	}

	@Then("Admin should see search bar on the class page")
	public void admin_should_see_search_bar_on_the_class_page() {
	    classPom.searchBox();
	}

	@Then("Admin should see +Add New Class button on the class page")
	public void admin_should_see_add_new_class_button_on_the_class_page() {
	    classPom.NewClassButton();
	}

	@Then("Admin should see data table on the Manage Class Page With following column headers. \\(Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete)")
	public void admin_should_see_data_table_on_the_manage_class_page_with_following_column_headers_check_box_symbol_batch_id_class_no_class_date_class_topic_staff_id_description_comments_notes_recording_edit_delete() {
	    classPom.headerValidation();
	}

	@Then("Edit Icon in each row of data table only  when entries are available")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    classPom.chkEditBtnIsDisplayed();
	}

	@Then("Edit Icon will not be present in data table")
	public void edit_icon_will_not_be_present_in_data_table() {
	    classPom.chkEditBtnIsDisplayed();
	}

	@Then("Delete Icon in each row of data table only  when entries are available")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    classPom.chkDeleteBtnIsDisplayed();
	}

	@Then("Admin cant see delete  Icon in data table")
	public void admin_cant_see_delete_icon_in_data_table() {
	    classPom.chkDeleteBtnIsDisplayed();
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    classPom.sortIcon();
	}

	@Then("Admin should see check box in the all rows of data table")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table() {
	   classPom.checkBox();
	}

	@Then("Above the footer Admin should see the text as {string} below the table.")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table(String string) {
	    classPom.paginationText();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	   classPom.paginationControl();
	}

	@Then("Admin should see the text with total number classes in the data table.")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table() {
	   classPom.footerText(0, 0, 0);
	}
	
	//Feature: Manage Class Page Verification_2
	
	@Given("Admin is on Manage Class Page")
	public void admin_is_on_manage_class_page() {
	    classPom.verifyClassTitle();
	}

	@When("Admin enters batch id {string} into search box")
	public void admin_enters_batch_id_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
	    classPom.enterValidDetailsInSearch(dataTable);
	}

	@Then("Displays entries with that batch Id")
	public void displays_entries_with_that_batch_id() {
	    classPom.loadSearchResultsIntoListOfMap();
	    boolean isSearchItemDisplayed = classPom.checkIfSearchItemDisplayed();
	    assertEquals(true, isSearchItemDisplayed, "Searched Batch Id not displayed");
	}

	@When("Admin enters batch id {string} which is not existing in the table into search box")
	public void admin_enters_batch_id_which_is_not_existing_in_the_table_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
		classPom.loadSearchResultsIntoListOfMap();
	    boolean isSearchItemDisplayed = classPom.checkIfSearchItemDisplayed();
	    assertEquals(false, isSearchItemDisplayed, "Searched Batch Id is displayed");
	}

	@When("Admin enters class no {string} into search box")
	public void admin_enters_class_no_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@Then("Displays entries with that class no")
	public void displays_entries_with_that_class_no() {
		classPom.loadSearchResultsIntoListOfMap();
	    boolean isSearchItemDisplayed = classPom.checkIfSearchItemDisplayed();
	    assertEquals(true, isSearchItemDisplayed, "Searched Class No is not displayed");
	}

	@When("Admin enters class no {string} which is not existing in the table into search box")
	public void admin_enters_class_no_which_is_not_existing_in_the_table_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@When("Admin enters class topic {string} into search box")
	public void admin_enters_class_topic_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@Then("Displays entries with that class topic")
	public void displays_entries_with_that_class_topic() {
		classPom.loadSearchResultsIntoListOfMap();
	    boolean isSearchItemDisplayed = classPom.checkIfSearchItemDisplayed();
	    assertEquals(true, isSearchItemDisplayed, "Searched Class Topic is not displayed");
	}

	@When("Admin enters class topic {string} which is not existing in the table into search box")
	public void admin_enters_class_topic_which_is_not_existing_in_the_table_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@When("Admin enters staff id {string} into search box")
	public void admin_enters_staff_id_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@Then("Displays entries with that staff id")
	public void displays_entries_with_that_staff_id() {
		classPom.loadSearchResultsIntoListOfMap();
	    boolean isSearchItemDisplayed = classPom.checkIfSearchItemDisplayed();
	    assertEquals(true, isSearchItemDisplayed, "Searched Staff Id is not displayed");
	}

	@When("Admin enters staff id {string} which is not existing in the table into search box")
	public void admin_enters_staff_id_which_is_not_existing_in_the_table_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@When("Admin enters class date {string} into search box")
	public void admin_enters_class_date_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}

	@Then("Displays entries with that class date")
	public void displays_entries_with_that_class_date() {
		classPom.loadSearchResultsIntoListOfMap();
	    boolean isSearchItemDisplayed = classPom.checkIfSearchItemDisplayed();
	    assertEquals(true, isSearchItemDisplayed, "Searched Class Date is not displayed");
	}

	@When("Admin enters invalid class date {string} into search box")
	public void admin_enters_invalid_class_date_into_search_box(String string, io.cucumber.datatable.DataTable dataTable) {
		classPom.enterValidDetailsInSearch(dataTable);
	}


	//Feature: Class detail Popup window verification
	
	@When("Admin click +Add New Class button")
	public void admin_click_add_new_class_button() {
	    classPom.newClassClick();
	}

	@Then("Admin should see a popup  with  heading {string}")
	public void admin_should_see_a_popup_with_heading(String string) {
	    classPom.addClassWindow();
	}

	@Then("Admin should see input fields Text \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_should_see_input_fields_text_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{int} textbox should be  present in Class details popup window")
	public void textbox_should_be_present_in_class_details_popup_window(Integer int1) {
	    classPom.noOfTextBoxes();
	}

	@Then("Admin should see  dropdown option for Batch ID")
	public void admin_should_see_dropdown_option_for_batch_id() {
	    classPom.batchDropdownDisplayed();
	}

	@Then("Admin should see  dropdown option for Staff Id")
	public void admin_should_see_dropdown_option_for_staff_id() {
	    classPom.staffIdDropdownDisplayed();
	}

	@Then("Admin should see  calendar icon for class date")
	public void admin_should_see_calendar_icon_for_class_date() {
	    classPom.calenderIconDisplayed();
	}

	@Then("Admin should see  save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
	    classPom.saveBtnDisplayed();
	}

	@Then("Admin should see cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
	    classPom.cancelBtnDisplayed();
	}

	@Then("Admin should see close button on the class details popup window")
	public void admin_should_see_close_button_on_the_class_details_popup_window() {
	    classPom.closeBtnDisplayed();
	}
	
	//Feature: Add New Class 
	
	@Given("Admin is in  class detail popup window")
	public void admin_is_in_class_detail_popup_window() {
		classPom.addClassWindow();
	
	}

	@When("Admin clicks  Batch ID dropdown")
	public void admin_clicks_batch_id_dropdown() {
		classPom.batchDropdown();
	}

	@Then("Batch id in the drop down should match with Batch id in the manage batch page table")
	public void batch_id_in_the_drop_down_should_match_with_batch_id_in_the_manage_batch_page_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin enters all mandatory field values with valid data from {string} and {int} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_valid_data_from_and_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@Then("Admin should see new class details is added in the data table")
	public void admin_should_see_new_class_details_is_added_in_the_data_table() {
	    classPom.searchValue();
	    classPom.loadSearchResultsIntoListOfMap();
	    classPom.checkIfSearchItemDisplayed();
	}

	@When("Admin enters all mandatory field values with invalid data from {string} and {int} and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_from_and_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
		classPom.alertMesg();
	}

	@When("Admin enters values in all fields with valid data from {string} and {int} and clicks save button")
	public void admin_enters_values_in_all_fields_with_valid_data_from_and_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@When("Admin enters with invalid data from {string} and {int} in optional fields and clicks save button")
	public void admin_enters_with_invalid_data_from_and_in_optional_fields_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@When("Admin enters  data from {string} and {int} missing value in Batch ID and clicks save button")
	public void admin_enters_data_from_and_missing_value_in_batch_id_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@Then("Batch Id is missing alert message should appear")
	public void batch_id_is_missing_alert_message_should_appear() {
		classPom.alertMesg();
	}

	@When("Admin enters data from {string} and {int} missing value in No of class and clicks save button")
	public void admin_enters_data_from_and_missing_value_in_no_of_class_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@Then("No of classes is missing alert message should appear")
	public void no_of_classes_is_missing_alert_message_should_appear() {
		classPom.alertMesg();
	}

	@When("Admin enters data from {string} and {int} missing value in  class date and clicks save button")
	public void admin_enters_data_from_and_missing_value_in_class_date_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@Then("Class date is missing alert message should appear")
	public void class_date_is_missing_alert_message_should_appear() {
		classPom.alertMesg();
	}

	@When("Admin enters data from {string} and {int} missing value in staff id and clicks save button")
	public void admin_enters_data_from_and_missing_value_in_staff_id_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@Then("staff id is missing alert message should appear")
	public void staff_id_is_missing_alert_message_should_appear() {
		classPom.alertMesg();
	}

	@When("Admin enters passed date from {string} and {int} in the class date field and clicks save button")
	public void admin_enters_passed_date_from_and_in_the_class_date_field_and_clicks_save_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs(sheetName, rowNumber);
		classPom.saveClick();
	}

	@Then("class cannot be  created for the passed date alert message should appear")
	public void class_cannot_be_created_for_the_passed_date_alert_message_should_appear() {
		classPom.alertMesg();
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
	    classPom.datePicker();
	}

	@Then("selected date should be there in class date text box")
	public void selected_date_should_be_there_in_class_date_text_box() {
		Assert.assertEquals(classPom.date, classPom.selectedDate);
	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Next month calender should be visible")
	public void next_month_calender_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("previous month calender should be visible")
	public void previous_month_calender_should_be_visible() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
		 classPom.datePicker();
	}

	@Then("Admin should see current date is highlighted in the date picker")
	public void admin_should_see_current_date_is_highlighted_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
		 classPom.datePicker();
	}

	@Then("Admin should see selected date is highlighted in the date picker")
	public void admin_should_see_selected_date_is_highlighted_in_the_date_picker() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    classPom.cancelClick();
	}

	@Then("Admin should land on Manage Class page")
	public void admin_should_land_on_manage_class_page() {
	    classPom.verifyClassTitle();
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
		 classPom.cancelClick();
	}

	@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
	    classPom.verifyClassTitle();
	    classPom.searchValue();
	    classPom.loadSearchResultsIntoListOfMap();
	    classPom.checkIfSearchItemDisplayed();
	}


	//Feature: Edit class Validation_1
	
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
	    classPom.verifyClassTitle();
	}

	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
	    classPom.editBtnClick();
	}

	@Then("Edit popup window appears with heading Class Details")
	public void edit_popup_window_appears_with_heading_class_details() {
	    classPom.editClassDisplayed();
	}

	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
		classPom.editBtnClick();
	}

	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
		classPom.editClassDisplayed();
	}

	//Feature: Edit class Validation_2
	
	@Given("Admin is in  Edit class detail popup window")
	public void admin_is_in_edit_class_detail_popup_window() {
		classPom.editClassDisplayed();
	}

	@Then("Admin should see particular class details is updated in the data table")
	public void admin_should_see_particular_class_details_is_updated_in_the_data_table() {
		
	    classPom.searchValue();
	    classPom.loadSearchResultsIntoListOfMap();
	    classPom.checkIfSearchItemDisplayed();
	}

	@When("Admin enters values in all fields with invalid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_enters_values_in_all_fields_with_invalid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs("data_class", 2);
		classPom.saveClick();
	}

	@When("Admin enters  data missing value in No of Class and clicks save button \\(Batch ID, Class Date, Staff Id)")
	public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id() throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs("data_class", 6);
		classPom.saveClick();
	}

	@Then("No of Class is missing alert message should appear")
	public void no_of_class_is_missing_alert_message_should_appear() {
		classPom.alertMesg();
	}

	@When("Admin enters  data missing value in Class Date and clicks save button \\(Batch ID, No of class, Staff Id)")
	public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_batch_id_no_of_class_staff_id() throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs("data_class", 7);
		classPom.saveClick();
	}

	
	@When("Admin enters  data missing value in staff id and clicks save button \\(Batch ID, No of class, Class Date)")
	public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_batch_id_no_of_class_class_date() throws InvalidFormatException, IOException, InterruptedException {
		classPom.Enter_Valid_SheetInputs("data_class", 8);
		classPom.saveClick();
	}

	

	@Then("class cannot be updated for the passed date alert message should appear")
	public void class_cannot_be_updated_for_the_passed_date_alert_message_should_appear() {
		classPom.alertMesg();
	}

	@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table() {
		classPom.verifyClassTitle();
	    classPom.searchValue();
	    classPom.loadSearchResultsIntoListOfMap();
	    classPom.checkIfSearchItemDisplayed();
	}
	
	//Feature: Delete class validation_1
	
	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
	  classPom.DeleteButtonRight();
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert(String alert) {
		classPom.alertMessage();
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
	   classPom.yesBtn();
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string) {
	    classPom.noBtn();
	}

	//Feature: Delete class validation_2
	
	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() {
	    classPom.deleteAlertWindow();
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() {
	    classPom.yesButtonClick();
	}

	@Then("Success message and validate particular class details are deleted from the data table")
	public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table() {
	    classPom.successMessage();
	    Integer deleteElement = classPom.chkDeletedRow();
	    assertEquals(0, deleteElement,"Row not deleted");
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() {
	    classPom.noButtonClick();
	}

	@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table() {
	    String title =  classPom.verifyPageTitle();
	    assertEquals(title, "Manage Class", "Page Title do not match");
	    Integer deleteElement = classPom.chkDeletedRow();
	    assertNotEquals(0, deleteElement,"Row is deleted");
	    
	}
	
	//Feature: Delete multiple class validation_1
	
	@When("Admin clicks single  row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	    classPom.singleChkBox();
	}

	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() {
	    classPom.deleteEnabled();
	}

	@Then("Admin should see tick mark in check box")
	public void admin_should_see_tick_mark_in_check_box() {
	    classPom.tickChkBox();
	}

	@When("Admin clicks multiple row level check box in the data table")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
	    classPom.multipleChkBox();
	}

	@Then("Admin should see tick mark in check box  of the selected rows")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
	    classPom.tickChkBox();
	    classPom.tickMultiChkBox();
	}
	
	//Feature: Delete multiple class validation_2- same step def from delete class
	
	//Feature: Delete multiple class validation_3
	
	@Then("Admin should land on manage class page and validate particular class details are deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_deleted_from_the_data_table() {
		String title =  classPom.verifyPageTitle();
	    assertEquals(title, "Manage Class", "Page Title do not match");
	    Integer deleteElement = classPom.chkDeletedRow();
	    assertEquals(0, deleteElement,"Row not deleted");
	    
	}
	
	//Feature: Verify sort function in manage class page
	
	@When("Admin click on Batch id column header to sort")
	public void admin_click_on_batch_id_column_header_to_sort() {
		sortedList = new ArrayList<>();   
		for(WebElement wb:classPom.batchIdvalues){
		sortedList.add(wb.getText());
		}
		Collections.sort(sortedList);
		
	    classPom.sortAscending();
	    
	     obtainedListAsc = new ArrayList<>(); 
	
		for(WebElement we:classPom.batchIdvalues){
		   obtainedListAsc.add(we.getText());
		}
	    
	}
	

	@Then("Admin should see data table sorted in descending order")
	public void admin_should_see_data_table_sorted_in_descending_order() {
		Assert.assertTrue(sortedList.equals(obtainedListDesc));
	}

	@When("Admin double click on Batch id column header to sort")
	public void admin_double_click_on_batch_id_column_header_to_sort() {
		Collections.reverse(sortedList);
		 classPom.sortDescending();
		 
		 obtainedListDesc = new ArrayList<>();
		 
		 for(WebElement we:classPom.batchIdvalues){
			   obtainedListDesc.add(we.getText());
			}
		 
	}

	@Then("Admin should see data table sorted in ascending  order")
	public void admin_should_see_data_table_sorted_in_ascending_order() {
		Assert.assertTrue(sortedList.equals(obtainedListAsc));
	    
	}

	//Feature: Pagination in manage class_1
	
	@Then("Data table should display {int} page  when entries available")
	public void data_table_should_display_page_when_entries_available(Integer int1) {
	   assertEquals(1,classPom.currentPageNumber(),"1 page result not displayed");
	    
	}

	@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
	   classPom.isRightArrowDisplayed();
	}

	@Then("Left arrow should be disabled in page one")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
	    classPom.isLeftArrowDisplayed();
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
		classPom.isRightArrowDisplayed();
	}

	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
		classPom.isLeftArrowDisplayed();
	}

	@Then("When entries are more than {int} in data table pagination controls enabled")
	public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
	    classPom.isPaginationArrowDisplayed();
	}

	@Then("When entries are less than {int} in data table pagination controls disabled")
	public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
		 classPom.isPaginationArrowDisplayed();
	}

	//Feature: Pagination in manage class_2
	
	@Given("Admin is in add class details popup window")
	public void admin_is_in_add_class_details_popup_window() {
	    classPom.addClassWindow();
	}

	@When("Admin creates {int} new class")
	public void admin_creates_new_class(Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		for ( int i = 0; i<6; i++) {
		classPom.Enter_Valid_SheetInputs("data_class", 1);
		classPom.saveClick();
		}
		
	}

	@Then("When total class entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void when_total_class_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
	    classPom.isRightArrowDisplayed();
	}

	@When("Admin creates less than or equal to {int} new class")
	public void admin_creates_less_than_or_equal_to_new_class(Integer int1) throws InvalidFormatException, IOException, InterruptedException {
		for ( int i = 0; i<5; i++) {
			classPom.Enter_Valid_SheetInputs("data_class", 1);
			classPom.saveClick();
			}
	}

	@Then("When total class entries  {int} or below next page is disabled")
	public void when_total_class_entries_or_below_next_page_is_disabled(Integer int1) {
		classPom.isRightArrowDisplayed();
	}
	
	//Feature: Navigation function validation from manage class page to other pages 
	
	@When("Admin clicks {string} button in the navigation bar")
	public void admin_clicks_button_in_the_navigation_bar(String linkName) {
		
			if (linkName.equalsIgnoreCase("Student")) {
	           classPom.clickStudent();
	        } else if (linkName.equalsIgnoreCase("Program")) {
	        	classPom. clickProgram();
	        } else if (linkName.equalsIgnoreCase("Batch")) {
	        	classPom.clickBatch();
	        } else if ("User".equalsIgnoreCase("User")) {
	        	classPom.clickUser();
	        } else if ("Assignment".equalsIgnoreCase("Assignment")) {
	        	classPom.clickAssignment();
	        } else if ("Attendance".equalsIgnoreCase("Attendance")) {
	        	classPom.clickAttendance();
	        } else if ("Logout".equalsIgnoreCase("Logout")) {
	        	classPom.clickLogout();
		}
	}

	@Then("Admin should be able to land on student page")
	public void admin_should_be_able_to_land_on_student_page() {
		classPom.verifyStudentTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should be able to land on program page")
	public void admin_should_be_able_to_land_on_program_page() {
		classPom.verifyProgramTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should be able to land on batch page")
	public void admin_should_be_able_to_land_on_batch_page() {
		classPom.verifyBatchTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should be able to land on user page")
	public void admin_should_be_able_to_land_on_user_page() {
		classPom.verifyUserTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should be able to land on assignment page")
	public void admin_should_be_able_to_land_on_assignment_page() {
	    classPom.verifyAssignmentTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should be able to land on attendance page")
	public void admin_should_be_able_to_land_on_attendance_page() {
		classPom.verifyAttendanceTitle();
		   driver.navigate().back(); 
	}

	@Then("Admin should be able to land on login page")
	public void admin_should_be_able_to_land_on_login_page() {
		classPom.verifyLoginTitle();
	}
	
	
	
	
	
	
	




}
