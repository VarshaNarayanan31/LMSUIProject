package stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Assignment_POM;

public class Assignment_SD {

	long start;
	long end;
	long responsetime;

	Assignment_POM Assign = new Assignment_POM(driver);

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
		
		driver.get(url);
		LOGGER.info("Admin is in dashboard page after login");
	}

	@When("Admin clicks {string} button on the navigation bar")
	public void admin_clicks_button_on_the_navigation_bar(String string) {

		start = System.currentTimeMillis();
		Assign.AssignmentButton();

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
		
		Assign.verifyTitle();
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
		Assign.emptyField();
	}

	@Then("Edit Icon should not be present in the data table")
	public void edit_icon_should_not_be_present_in_the_data_table() {
		Assign.editBtn();
	}

	@Then("Delete Icon in each row of the data table should only appear when entries are available")
	public void delete_icon_in_each_row_of_the_data_table_should_only_appear_when_entries_are_available() {
		Assign.emptyField();
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

	@When("Admin is on the Manage Assignment page")
	public void admin_is_on_the_manage_assignment_page() {
		Assign.verifyTitle();
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
}
