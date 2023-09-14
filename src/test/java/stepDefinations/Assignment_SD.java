package stepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

import baseClass.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.testng.internal.BaseClassFinder;
import pages.Assignment_POM;
import utilities.LoggerLoad;

public class Assignment_SD extends TestBase {

	long start;
	long end;
	long responsetime;
    WebDriver driver;

	Assignment_POM Assign = new Assignment_POM(driver);
	
	ArrayList<String> sortedList;
	ArrayList<String> obtainedListAsc;
	ArrayList<String> obtainedListDesc;
	
	@Given("Logged into the Lms portal as admin")
	public void logged_into_the_lms_portal_as_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		
		//driver.get(url);
		LoggerLoad.info("Admin is in dashboard page after login");
	}

	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {

		start = System.currentTimeMillis();
		Assign.Assignmentlnk();

	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {

		Assign.verifyurl();
		end = System.currentTimeMillis();

	}

	@Then("Get the response time for navigation from dashboard page to manage assignment page")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page() {
		
		long responseTime = end - start;
		System.out.println("Response time" + responseTime);

	}

	@Then("Admin should see header with {string}")
	public void admin_should_see_header_with(String string) {
		
		Assign.verifyAssignTitle();
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
		Assign.DisabledIcon();
	}

	@Then("Admin should see search bar on the manage assignment page")
	public void admin_should_see_search_bar_on_the_manage_assignment_page() {
		Assign.searchBox();
	}

	@Then("Admin should see +Add New assignment button on the manage assignment page")
	public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() {
		Assign.NewAssignButton();
	}

	@When("Admin clicks the {string} button on the navigation bar")
	public void admin_clicks_the_button_on_the_navigation_bar(String string) {
		Assign.NewAssignButtonClk();
		
	}

	@Then("Admin should see a data table on the Manage Assignment page with the following column headers:")
	public void admin_should_see_a_data_table_on_the_manage_assignment_page_with_the_following_column_headers(
			io.cucumber.datatable.DataTable dataTable) {
		Assign.headerValidation();
	}

	@Then("Edit Icon in each row of the data table should only appear when entries are available")
	public void edit_icon_in_each_row_of_the_data_table_should_only_appear_when_entries_are_available() {
		Assign.chkEditBtnIsDisplayed();
	}

	@Then("Edit Icon should not be present in the data table")
	public void edit_icon_should_not_be_present_in_the_data_table() {
		Assign.editBtn();
	}

	@Then("Delete Icon in each row of the data table should only appear when entries are available")
	public void delete_icon_in_each_row_of_the_data_table_should_only_appear_when_entries_are_available() {
		Assign.chkDeleteBtnIsDisplayed();
	}

	@Then("Delete Icon should not be present in the data table")
	public void delete_icon_should_not_be_present_in_the_data_table() {
		Assign.deleteBtn();
	}

	@Then("Admin should see sort icons near the column headers except for Edit and Delete")
	public void admin_should_see_sort_icons_near_the_column_headers_except_for_edit_and_delete() {
		Assign.sortIcon();
	}

	@Then("Admin should see a check box in all rows of the data table when entries are available")
	public void admin_should_see_a_check_box_in_all_rows_of_the_data_table_when_entries_are_available() {
		Assign.checkBox();
	}

	@Then("Above the footer, Admin should see the text as {string} below the table")
	public void above_the_footer_admin_should_see_the_text_as_below_the_table() {
       Assign.paginationText();
	}

	@Then("Admin should see pagination controls under the data table")
	public void admin_should_see_pagination_controls_under_the_data_table() {
		Assign.paginationControl();
	}

	@Then("Admin should see the text with the total number of assignments in the data table: {string}")
	public void admin_should_see_the_text_with_the_total_number_of_assignments_in_the_data_table(String string) {
		Assign.footerText();
	}
//manageSearch
	
	@Given("Admin is on the Manage Assignment page")
	public void admin_is_on_the_manage_assignment_page() {
		Assign.verifyAssignTitle();
		LoggerLoad.info("admin is in manage assignment page");
	}

	@When("Admin enters Assignment Name into the search box")
	public void admin_enters_assignment_name_into_the_search_box(io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String assignmentName = credential.get(0);
		Assign.searchAssignmentName(assignmentName);
	}

	@Then("Admin should see Displays entries with that assignment name in the data table")
	public void admin_should_see_displays_entries_with_that_assignment_name_in_the_data_table(String searchText, List<WebElement> elements) {
				
		Assign.searchForText(Assign.assignmentName,Assign.assignmentNamevalues);
	}

	@When("Admin enters non-existing Assignment Name into the search box")
	public void admin_enters_non_existing_assignment_name_into_the_search_box(
			io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String nonExistingAssignmentName = credential.get(0);
		Assign.search_NonAssignName(nonExistingAssignmentName);
	}


	@When("Admin enters Assignment description into the search box")
	public void admin_enters_assignment_description_into_the_search_box(io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String assignmentDescription = credential.get(0);
		Assign.search_AssignDescription(assignmentDescription);
	}

	@Then("Displays entries with that assignment description")
	public void displays_entries_with_that_assignment_description(String searchText, List<WebElement> elements) {
		Assign.searchForText(Assign.assignmentDescription, Assign.assignmentDescriptionvalues);
	}

	@When("Admin enters non-existing Assignment description into the search box")
	public void admin_enters_non_existing_assignment_description_into_the_search_box(
			io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String nonExistingassignmentDescription = credential.get(0);
		Assign.search_NonAssignDescription(nonExistingassignmentDescription);
	}

	@Then("Displays empty fields in the datatable")
	public void displays_empty_fields_in_the_datatable() {
	        Assign.emptyField();
	}

	@When("Admin enters Assignment due date into the search box")
	public void admin_enters_Assignment_due_date_into_the_search_box(io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String assignmentDueDate = credential.get(0);
		Assign.search_AssignDuedate(assignmentDueDate);
	}

	@Then("Displays entries with that assignment due date")
	public void displays_entries_with_that_assignment_due_date(String searchText, List<WebElement> elements) {
		Assign.searchForText(Assign.assignmentDescription, Assign.assignmentDescriptionvalues);
	}

	@When("Admin enters non-existing Assignment duedate into the search box")
	public void admin_enters_non_existing_assignment_duedate_into_the_search_box(
			io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String nonExistingAssignmentDueDate = credential.get(0);
		Assign.search_NonAssignDuedate(nonExistingAssignmentDueDate);
	}

	@When("Admin enters grade Value into the search box")
	public void admin_enters_grade_value_into_the_search_box(io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String gradeValue = credential.get(0);
		Assign.search_GradeValue(gradeValue);
	}

	@Then("Displays entries with that assignment grade")
	public void displays_entries_with_that_assignment_grade(String searchText, List<WebElement> elements) {
		Assign.searchForText(Assign.gradeValue, Assign.gradeByValues);
	}

	@When("Admin enters non-existing grade Value into the search box")
	public void admin_enters_non_existing_grade_value_into_the_search_box(io.cucumber.datatable.DataTable dataTable) {
		List<String> credential = dataTable.asList(String.class);
		String nonExistingGradeValue = credential.get(0);
		Assign.search_NonGradeValue(nonExistingGradeValue);
	}
	
//Assignment details Popup window verification
	
	@Given("Admin logged into the LMS portal and clicks assignment button on the navigation bar")
	public void admin_logged_into_the_lms_portal_and_clicks_assignment_button_on_the_navigation_bar() {
	    Assign.AssignButtonClick();
	}

	
	@When("Admin clicks the {string} button")
	public void admin_clicks_the_button(String NewAssignmentButton) {
	    Assign.NewAssignButton();
	}

	@Then("Admin should see a popup with the heading {string}")
	public void admin_should_see_a_popup_with_the_heading(String ExpectedTitle) {
	    Assign.assignpopWindowTitle();
	    
	}

	@Then("Admin should see the following input fields:")
	public void admin_should_see_the_following_input_fields(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see {int} textboxes in the Assignment details popup window")
	public void admin_should_see_textboxes_in_the_assignment_details_popup_window(Integer int1) {
	    Assign.noOfTextBoxes();
	}

	@Then("Admin should see a dropdown option for Batch Number")
	public void admin_should_see_a_dropdown_option_for_batch_number() {
	    Assign.batchNodropdown();
	}

	@Then("Admin should see a dropdown option for Program Name")
	public void admin_should_see_a_dropdown_option_for_program_name() {
	    Assign.programNameDropdown();
	}

	@Then("Admin should see a calendar icon for selecting the assignment due date")
	public void admin_should_see_a_calendar_icon_for_selecting_the_assignment_due_date() {
	   Assign.validateCalendarIcon();
	}

	@Then("Admin should see a Save button in the Assignment details popup window")
	public void admin_should_see_a_save_button_in_the_assignment_details_popup_window() {
	   Assign.validateSaveBtn();
	}

	@Then("Admin should see a Cancel button on the Assignment details popup window")
	public void admin_should_see_a_cancel_button_on_the_assignment_details_popup_window() {
	    Assign.validateCancelBtn();
	}
	@Then("Admin should see a Delete button on the Assignment details popup window")
	public void admin_should_see_a_delete_button_on_the_assignment_details_popup_window() {
	    Assign.validatDeleteBtn();
	}
	@Then("Admin should see a Close button on the Assignment details popup window")
	public void admin_should_see_a_close_button_on_the_assignment_details_popup_window() {
	    Assign.closeIcon();
	}
	
//Verify sort function in manage assignment page
	
	@When("Admin click on assignment name column header to sort")
	public void admin_click_on_assignment_name_column_header_to_sort() {
		
		sortedList = new ArrayList<>();   
		for(WebElement wb:Assign.assignmentNamevalues){
		sortedList.add(wb.getText());
		}
		Collections.sort(sortedList);
		
	    Assign.sortAscending();
	    
	     obtainedListAsc = new ArrayList<>(); 
	
		for(WebElement we:Assign.assignmentNamevalues){
		   obtainedListAsc.add(we.getText());
		}
	    
	}

	@Then("Admin should see data table sorted in ascending order")
	public void admin_should_see_data_table_sorted_in_ascending_order() {
		
		
		Assert.assertTrue(sortedList.equals(obtainedListAsc));
	    
	}

	@When("Admin double click on assignment name column header to sort")
	public void admin_double_click_on_assignment_name_column_header_to_sort() {
		
		Collections.reverse(sortedList);
		 Assign.sortDescending();
		 
		 obtainedListDesc = new ArrayList<>();
		 
		 for(WebElement we:Assign.assignmentNamevalues){
			   obtainedListDesc.add(we.getText());
			}
		 
	}

	@Then("Admin should see data table sorted in descending order")
	public void admin_should_see_data_table_sorted_in_descending_order() {
		
		Assert.assertTrue(sortedList.equals(obtainedListDesc));
	}

//Navigation function validation from manage assignment page to other pages 
	
	@When("Admin clicks {string} button in the navigation bar")
	public void admin_clicks_button_in_the_navigation_bar(String linkName) {
		if (linkName.equalsIgnoreCase("Student")) {
           Assign.clickStudent();
        } else if (linkName.equalsIgnoreCase("Program")) {
           Assign. clickProgram();
        } else if (linkName.equalsIgnoreCase("Batch")) {
            Assign.clickBatch();
        } else if ("User".equalsIgnoreCase("User")) {
            Assign.clickUser();
        } else if ("Class".equalsIgnoreCase("Class")) {
           Assign.clickClass();
        } else if ("Assignment".equalsIgnoreCase("Assignment")) {
            Assign.Assignmentlnk();; 
        } else if ("Attendance".equalsIgnoreCase("Attendance")) {
            Assign.clickAttendance();
        } else if ("Logout".equalsIgnoreCase("Logout")) {
            Assign.clickLogout();
	}
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() {
	    Assign.verifyStudentTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() {
	    Assign.verifyProgramTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() {
	    Assign.verifyBatchTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should able to land on user page")
	public void admin_should_able_to_land_on_user_page() {
	    Assign.verifyUserTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should able to land on class page")
	public void admin_should_able_to_land_on_class_page() {
	    Assign.verifyClassTitle();
	    driver.navigate().back(); 
	}

	@Then("Admin should able to land on attendance page")
	public void admin_should_able_to_land_on_attendance_page() {
	   Assign.verifyAttendanceTitle();
	   driver.navigate().back(); 
	}

	@Then("Admin should able to land on Login page")
	public void admin_should_able_to_land_on_login_page() {
	   Assign.verifyLoginTitle();
	   
	}
	
//Delete assignment
	
	@When("Admin clicks delete button in data table row level in assignment page")
	public void admin_clicks_delete_button_in_data_table_row_level_in_assignment_page() {
		Assign.deleteBtnRightclk();
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert() {
		Assign.deleteAlertMessage();
	   
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String yes) {
		Assign.yesBtn();
	   
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String no) {
	  Assign.noBtn();
	}

	//Delete Assignment 2
	
	@Given("Admin clicks row level delete button in Manage Assignment")
	public void admin_clicks_row_level_delete_button_in_manage_assignment() {
	   Assign.deleteBtnRightclk();
	}

	@Given("Admin is in delete alert for assignmentPage")
	public void admin_is_in_delete_alert_assignment_Page() {
		Assign.deleteAlertWindow();
	}

	@When("Admin clicks yes button for assignment")
	public void admin_clicks_yes_button_for_assignment() {
		Assign.yesButtonClick();
	}

	@Then("Success message and validate particular Assignment details are deleted from the data table")
	public void success_message_and_validate_particular_assignment_details_are_deleted_from_the_data_table() {
		Assign.successMessage();
	}

	@When("Admin clicks no button for assignment")
	public void admin_clicks_no_button_assignment() {
		Assign.noButtonClick();
	}

	@Then("Admin should land on manage Assignment page and validate particular assignment details are not deleted from the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_particular_assignment_details_are_not_deleted_from_the_data_table() {
		Assign.verifyAssignTitle();
		Integer deleteElement = Assign.chkDeletedRow();
		assertNotEquals(0, deleteElement, "Row is deleted");
	}
//Delete multiple assignment1

	@When("Admin clicks single row level check box in the data table of manage assignment")
	public void admin_clicks_single_row_level_check_box_in_the_data_table_of_manage_assignment() {
		Assign.singleChkBox();
	}

	@Then("Admin should see delete icon below the header is enabled in manage assignment")
	public void admin_should_see_delete_icon_below_the_header_is_enabled_in_manage_assignment() {
		Assign.headerDeleteEnabled();
	}

	@Then("Admin should see tick mark in check box in manage assignment")
	public void admin_should_see_tick_mark_in_check_box_in_manage_assignment() {
		Assign.tickChkBox();
	}

	@When("Admin clicks multiple row level check box in the data table of manage assignment")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table_of_manage_assignment() {
		Assign.multipleChkBox();
	}

	@Then("Admin should see tick mark in check box  of the selected rows in manage assignment")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows_in_manage_assignment() {
		Assign.tickMultiChkBox();
	}

//delete multiple assignment3

	@Then("Admin should land on manage assignment page and validate particular assignment details are deleted from the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_particular_assignment_details_are_deleted_from_the_data_table() {

		Assign.verifyAssignTitle();
		Integer deleteElement = Assign.chkDeletedRow();
		assertEquals(0, deleteElement, "Row is deleted");
	}

//add assignment

	@Given("Admin is in assignment details popup window")
	public void admin_is_in_assignment_details_popup_window() {
		Assign.assignpopWindowTitle();
		 //LoggerLoad.info("Admin is in assignment details pop up window");
	}

	@When("Admin enters all mandatory field values with valid data from <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_valid_data_from_sheet_Name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("Admin should see new assignment details is added in the data table")
	public void admin_should_see_new_assignment_details_is_added_in_the_data_table() {

		// Assert.assertTrue(dataTable.getText().contains("ExpectedData"));
	}

	@When("Admin enters all mandatory field values with invalid data from <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_all_mandatory_field_values_with_invalid_data_from_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
		Assign.alertMesg();
	}

	@When("Admin enters values in all fields with valid data <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_values_in_all_fields_with_valid_data_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@When("Admin enters with invalid data in optional fields <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_with_invalid_data_in_optional_fields_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {

		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@When("Admin enters  data missing value in program name <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_data_missing_value_in_program_name_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("Program name is missing")
	public void program_name_is_missing() {
		Assign.alertMesg();
	}

	@When("Admin enters  data missing value in batch number <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_data_missing_value_in_batch_number_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("Batch number is missing")
	public void batch_number_is_missing() {
		Assign.alertMesg();
	}

	@When("Admin enters  data missing value in assignment name <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_data_missing_value_in_assignment_name_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("Assignment name is missing")
	public void assignment_name_is_missing() {
		Assign.alertMesg();
	}

	@When("Admin enters  data missing value in due date <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_data_missing_value_in_due_date_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("due date is missing")
	public void due_date_is_missing() {
		Assign.alertMesg();
	}

	@When("Admin enters  data missing value in grade by <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_data_missing_value_in_grade_by_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("grade by is missing")
	public void grade_by_is_missing() {
		Assign.alertMesg();
	}

	@When("Admin enters Passed date in the due date field <sheetName> and <rowNumber> and clicks save button")
	public void admin_enters_passed_date_in_the_due_date_field_sheet_name_and_row_number_and_clicks_save_button(
			String sheetName, int rowNumber) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		Assign.Enter_Valid_SheetInputs(sheetName, rowNumber);
		Assign.passValue();
		Assign.saveBtnClick();
	}

	@Then("Assignment cannot be created for the passed date")
	public void assignment_cannot_be_created_for_the_passed_date() {
		Assign.alertMesg();
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
		Assign.datePicker();
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
		Assert.assertEquals(Assign.date, Assign.selectedDate);
	}
	
// Assignment pagination
	
	@Then("Data table should display {int} page  when entries available")
	public void data_table_should_display_page_when_entries_available(Integer int1) {
		 assertEquals(1,Assign.currentPageNumber(),"1 page result not displayed");
	}

	@Then("Right arrow should be enabled in page one  when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
		   Assign.isRightArrowDisplayed();
	}

	@Then("Left arrow should be disabled in page one")
	public void left_arrow_should_be_disabled_in_page_one() {
	    Assign.isLeftArrowDisplayed();
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
	    Assign.isRightArrowDisplayed();
	}

	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {
	   Assign.isLeftArrowDisplayed();
	}

	@Then("When entries are more than {int} in data table pagination controls enabled")
	public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
	  Assign.isPaginationArrowDisplayed();
	}

	@Then("When entries are less than {int} in data table pagination controls disabled")
	public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
	    Assign.isPaginationArrowDisplayed();
	}
	@When("Admin creates {int} new assignment")
	public void admin_creates_new_assignment(Integer int1) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException, InterruptedException {
		for ( int i = 0; i<6; i++) {
			Assign.Enter_Valid_SheetInputs("data_class", 1);
			Assign.saveBtnClick();
			}
	}

	@Then("When total assignment entries above {int} next page is enabled \\( On multiples of {int} new page will be enabled)")
	public void when_total_assignment_entries_above_next_page_is_enabled_on_multiples_of_new_page_will_be_enabled(Integer int1, Integer int2) {
	    Assign.isRightArrowDisplayed();
	}

	@When("Admin creates less than or equal to {int} new assignment")
	public void admin_creates_less_than_or_equal_to_new_assignment(Integer int1) throws InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, Exception, InterruptedException {
		
		for ( int i = 0; i<5; i++) {
		Assign.Enter_Valid_SheetInputs("data_class", 1);
			Assign.saveBtnClick();
			}
	}

	@Then("When total assignment entries  {int} or below next page is disabled")
	public void when_total_assignment_entries_or_below_next_page_is_disabled(Integer int1) {
	    Assign.isRightArrowDisplayed();
	}

// edit assignment
	
	@Given("Admin is in manage assignment page")
	public void admin_is_in_manage_assignment_page() {
	    Assign.verifyAssignTitle();
	}

	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
	    Assign.editBtn();
	}

	@Then("Edit popup window appears with heading Assignment Details")
	public void edit_popup_window_appears_with_heading_assignment_details() {
	    Assign.assignpopWindowTitle();
	}

	@When("Admin clicks Edit button from one of the row in data table")
	public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
	    Assign.editBtn();
	}

	@Then("Edit popup window appears with same row values in the all fields")
	public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
	    Assign.assignpopWindowTitle();
	}


	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	    Assign.cancelBtnClick();
	}

	@Then("Admin should land on manage assignment page")
	public void admin_should_land_on_manage_assignment_page() {
	    Assign.verifyAssignTitle();
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
		Assign.cancelBtnClick();
	    
	}

	@Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
	public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
	    Assign.verifyAssignTitle();
	}

}
