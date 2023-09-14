package stepDefinations;
import java.util.ArrayList;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import constants.Constants;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Program_POM;

public class Program_SD {
	
	    WebDriver driver;
		Program_POM objprogram = new Program_POM(driver);
		ArrayList<String> sortedList;
		ArrayList<String> obtainedListAsc;
		ArrayList<String> obtainedListDesc;
		
		
		@Given("Logged into the Lms portal as admin")
		public void logged_into_the_lms_portal_as_admin() {
		    
		    
		}

		@Given("Admin is on dashboard page after Login")
		public void admin_is_on_dashboard_page_after_login() {
			driver.get("url");
			//LOGGER.info("Admin is in dashboard page after login");
		    
		}

		@When("Admin clicks Program on the navigation bar")
		public void admin_clicks_program_on_the_navigation_bar() {
			objprogram.clickonprogram();
		    
		}

		@Then("Admin should see URL with Manage Program")
		public void admin_should_see_url_with_manage_program() {
		    
			objprogram.urlwith_manageprogram();
			
		}

		@Then("Admin should see a heading with text Manage Program on the page")
		public void admin_should_see_a_heading_with_text_manage_program_on_the_page() {
			objprogram.headingwith_manageprogram();
		    
		}

		@Then("Admin should see the text as Showing x to y of z entries along with Pagination icon below the table, x is starting record number on that page y is ending record number on that page z is Total number of records")
		public void admin_should_see_the_text_as_showing_x_to_y_of_z_entries_along_with_pagination_icon_below_the_table_x_is_starting_record_number_on_that_page_y_is_ending_record_number_on_that_page_z_is_total_number_of_records() {
		  
			objprogram.paginationText();	    
		}

		@Then("Admin should see the footer as In total there are z program,z- Total number of records")
		public void admin_should_see_the_footer_as_in_total_there_are_z_program_z_total_number_of_records() {
			objprogram.footerText();
		    
		}

		@Then("Admin should see a Delete button on the top left hand side as Disabled")
		public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
			objprogram.deletemultiplebutton();
		    
		}

		@Then("Admin should see a +A New Program button on the program page above the data table")
		public void admin_should_see_a_a_new_program_button_on_the_program_page_above_the_data_table() {
			
			objprogram.NewprogramButton();
		}

		@Then("Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
		public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
			objprogram.noOfRows();
		    
		}

		@Then("Admin should see data table on the Manage Program Page with following column headers \\(Program Name, Program Description, Program Status, Edit,Delete)")
		public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_program_name_program_description_program_status_edit_delete() {
			objprogram.headerValidation();
		    
		}

		@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
		public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
		    
			objprogram.sortIcon();
		}

		@Then("Admin should see check box on the left side in all rows of the data table")
		public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
			objprogram.checkBox();  
		    
		}

		@Then("Admin should see the Edit and Delete buttons on each row of the data table")
		public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
		    
			objprogram.editBtn();
			objprogram.deleteBtn();
		}

		@Then("Admin should see Search bar with text as Search...")
		public void admin_should_see_search_bar_with_text_as_search() {
		    
			objprogram.searchBox();
		}

	//Navigation scenarios 
		
		@Given("Admin is on Manage Program page")
		public void admin_is_on_manage_program_page() {
			objprogram.clickonprogram();
			objprogram.headingwith_manageprogram();
		}

		@When("Admin clicks on Student link on Manage Program page")
		public void admin_clicks_on_student_link_on_manage_program_page() {
			objprogram.navigatetostudent();
		 
		}

		@Then("Admin is re-directed to Student page")
		public void admin_is_re_directed_to_student_page() {
			objprogram.verifyStudentTitle();
			driver.navigate().back(); 
		}

		@When("Admin clicks on Batch link on Manage Program page")
		public void admin_clicks_on_batch_link_on_manage_program_page() {
			objprogram.navigatetobatch();
		 
		}

		@Then("Admin is re-directed to Batch page")
		public void admin_is_re_directed_to_batch_page() {
			objprogram.verifyBatchTitle();
			driver.navigate().back();
		}

		@When("Admin clicks on Class link on Manage Program page")
		public void admin_clicks_on_class_link_on_manage_program_page() {
			objprogram.navigatetoclass();
		 
		}

		@Then("Admin is re-directed to Class page")
		public void admin_is_re_directed_to_class_page() {
		    
			objprogram.verifyClassTitle();
			driver.navigate().back();
		}

		@When("Admin clicks on User link on Manage Program page")
		public void admin_clicks_on_user_link_on_manage_program_page() {
			objprogram.navigatetouser();
		 
		}

		@Then("Admin is re-directed to User page")
		public void admin_is_re_directed_to_user_page() {
			objprogram.verifyUserTitle();
			driver.navigate().back();
		}

		@When("Admin clicks on Assignment link on Manage Program page")
		public void admin_clicks_on_assignment_link_on_manage_program_page() {
			objprogram.navigatetoassignment();
		 
		}

		@Then("Admin is re-directed to Assignment page")
		public void admin_is_re_directed_to_assignment_page() {
			objprogram.verifyAssignmentTitle();
			driver.navigate().back();
		}

		@When("Admin clicks on Attendance link on Manage Program page")
		public void admin_clicks_on_attendance_link_on_manage_program_page() {
			objprogram.navigatetoassignment();
		 
		}

		@Then("Admin is re-directed to Attendance page")
		public void admin_is_re_directed_to_attendance_page() {
			objprogram.verifyAttendanceTitle();
			driver.navigate().back();
		}

		@When("Admin clicks on Logout link on Manage Program page")
		public void admin_clicks_on_logout_link_on_manage_program_page() {
			objprogram.navigatetologout();
		 
		}

		@Then("Admin is re-directed to Login page")
		public void admin_is_re_directed_to_login_page() {
			objprogram.verifyLogoutTitle();
			driver.navigate().back();
		}
		
		//sorting and pagination
		
		@When("Admin clicks the sort icon of program name column")
		public void admin_clicks_the_sort_icon_of_program_name_column() {
			objprogram.clickOnSortBtn_Name();
		    
		}
		@Then("The data get sorted on the table based on the program name column values in ascending order")
		public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_ascending_order() {
			objprogram.verifyASCOrder_Name();
		    
		}
		@Given("The data is in the ascending order on the table based on Program Name column")
		public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
			objprogram.clickOnSortBtn_Name();
			objprogram.verifyASCOrder_Name();
		    
		    
		}
		@Then("The data get sorted on the table based on the program name column values in descending order")
		public void the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order() {
			objprogram.verifyDESCOrder_Name();
		    
		}
		@When("Admin clicks the sort icon of program Desc column")
		public void admin_clicks_the_sort_icon_of_program_desc_column() {
			objprogram.clickOnSortBtn_Desc();
		    
		}
		@Then("The data get sorted on the table based on the program description column values in ascending order")
		public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order() {
			objprogram.verifyASCOrder_Desc();
		    
		}
		@Given("The data is in the ascending order on the table based on Program Description column")
		public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {
			objprogram.clickOnSortBtn_Desc();
			objprogram.verifyASCOrder_Desc();
		}
		@Then("The data get sorted on the table based on the program description column values in descending order")
		public void the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
			objprogram.verifyDESCOrder_Desc();
		    
		}
		@When("Admin clicks the sort icon of program Status column")
		public void admin_clicks_the_sort_icon_of_program_status_column() {
			objprogram.clickOnSortBtn_Status();
		    
		}
		@Then("The data get sorted on the table based on the program status column values in ascending order")
		public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order() {
		    
			objprogram.verifyASCOrder_Status();
		}
		@Given("The data is in the ascending order on the table based on Program Status column")
		public void the_data_is_in_the_ascending_order_on_the_table_based_on_program_status_column() {
			objprogram.clickOnSortBtn_Status();
			objprogram.verifyASCOrder_Status();
		}
		@Then("The data get sorted on the table based on the program status column values in descending order")
		public void the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order() {
			objprogram.verifyDESCOrder_Status();
		    
		}
		@When("Admin clicks Next page link on the program table")
		public void admin_clicks_next_page_link_on_the_program_table() {
			objprogram.clickNextPage();
		    
		}
		@Then("Admin should see the Pagination has Next link")
		public void admin_should_see_the_pagination_has_next_link() {
			objprogram.verifyPaginatorTextafter();
		    
		}
		@When("Admin clicks Last page link")
		public void admin_clicks_last_page_link() {
			objprogram.clickLastPage();
		    
		}
		@Then("Admin should see the last page record on the table with Next page link are disabled")
		public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() {
			objprogram.disableLastPageArrow(); 

		    
		}
		@Given("Admin is on last page of Program table")
		public void admin_is_on_last_page_of_program_table() {
			objprogram.clickLastPage();
		    
		}
		@When("Admin clicks First page link")
		public void admin_clicks_first_page_link() {
			objprogram.clickFirstPage();
		    
		}
		@Then("Admin should see the previous page record on the table with pagination has previous page link")
		public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() {
			objprogram.clickPrevPage();
		    
		}
		@Given("Admin is on Previous Program page")
		public void admin_is_on_previous_program_page() {
		    
			objprogram.verifyCurrentPageNumber();
		}
		@When("Admin clicks Start page link")
		public void admin_clicks_start_page_link() {
			objprogram.clickFirstPage();  
			objprogram.verifyPage();
		}
		@Then("Admin should see the very first page record on the table with Previous page link are disabled")
		public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() {
			objprogram.verifyCurrentPageNumber(); 
			objprogram.disableLastPageArrow();
		}


		//add program
		
		@When("Admin enters Program name phrase into search box.")
		public void admin_enters_program_name_phrase_into_search_box() {
		    
			objprogram.enterprogramnameinsearchbox();
		}
		@Then("Admin should see the Programs displayed based on the Program Name")
		public void admin_should_see_the_programs_displayed_based_on_the_program_name() {
			objprogram.verifySearchResultProgramName() ;
		    
		}
		@When("Admin enters Program description phrase into search box.")
		public void admin_enters_program_description_phrase_into_search_box() {
			objprogram.enterprogramdescriptioninsearchbox();
		    
		}
		@Then("Admin should see the Programs displayed based on the Program Description")
		public void admin_should_see_the_programs_displayed_based_on_the_program_description() {
			objprogram.verifySearchResultProgramDesc();
		    
		}
		@When("Admin enters Program status phrase into search box.")
		public void admin_enters_program_status_phrase_into_search_box() {
			objprogram.enterprogramstatusinsearchbox();
		    
		}
		@Then("Admin should see the Programs displayed based on the Program Status")
		public void admin_should_see_the_programs_displayed_based_on_the_program_status() {
			objprogram.verifySearchResultProgramStatus()
		    
		}
		@When("Admin enters the keywords not present in the data table on the Search box")
		public void admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box() {
		    
			objprogram.verifyProgramPage();
		}
		@Then("Admin should see zero entries on the data table")
		public void admin_should_see_zero_entries_on_the_data_table() {
			objprogram.verifyProgramPage();
		    
		}
		@When("Admin clicks A New Program button")
		public void admin_clicks_a_new_program_button() {
		    
			objprogram.NewprogramButton();
		}
		@Then("Admin should see a popup open for Program details with empty form along with SAVE and CANCEL button and Close\\(X) Icon on the top right corner of the window")
		public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
			objprogram.NewprogramButton(); 
			objprogram.popWindowTitle();
		}
		@Then("Admin should see two input fields and their respective text boxes in the program details window")
		public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() {
			objprogram.noOfTextBoxes();
		    
		}
		@Then("Admin should see two radio button for Program Status")
		public void admin_should_see_two_radio_button_for_program_status() {
		    
			objprogram.noOfradiobuttons(); 
		}

		@Given("Admin is on Program Details Popup window")
		public void admin_is_on_program_details_popup_window() {
			
			objprogram.popWindowTitle();
		}
		@When("Admin clicks Save button without entering any data")
		public void admin_clicks_save_button_without_entering_any_data() {
		    
			objprogram.clicksaveButton() ;
		}
		@Then("Admin gets a Error message alert")
		public void admin_gets_a_error_message_alert() {
			objprogram.verifyMsg();
		    
		}
		@Given("Program_Admin clicks on A New Program button")
		public void program_admin_clicks_on_a_new_program_button() {
			objprogram.NewprogramButton();
			 
		}
		@When("Program_Admin Enter {string},{string} and {string}")
		public void program_admin_enter_and(String string, String string2, String string3) {
			objprogram.setProgramName();
			objprogram.setProgramDescription;
			objprogram.setstatusbutton();
		}
		@Then("Program_Admin clicks on Save button")
		public void program_admin_clicks_on_save_button() {
			objprogram.clicksaveButton();
		    
		}
		@When("Admin selects only Status and clicks Save button")
		public void admin_selects_only_status_and_clicks_save_button() {
		    
			objprogram.setstatusbutton();
			objprogram.clicksaveButton();
		}
		@Then("Admin gets a message alert Name and Description required")
		public void admin_gets_a_message_alert_name_and_description_required() {
			objprogram.verifyMsg();
		    
		}
		@When("Admin enters only numbers or special char in name and desc column")
		public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column() {
			objprogram.enterinvalid();
		    
		}
		@When("Admin clicks Cancel\\/Close\\(X) Icon on Program Details form")
		public void admin_clicks_cancel_close_x_icon_on_program_details_form() {
		    
			objprogram.verifyWindowClose();
		}
		@Then("Program Details popup window should be closed without saving")
		public void program_details_popup_window_should_be_closed_without_saving() {
		    
			objprogram.verifyWindowClose();
		}
		@When("Enter all the required fields with valid values and click Save button")
		public void enter_all_the_required_fields_with_valid_values_and_click_save_button() {
		
			objprogram.setProgramName();
			objprogram.setProgramDescription;
			objprogram.setstatusbutton();
			clicksaveButton()
		}
		
		@Then("Admin gets a message Successful Program Created alert and able to see the new program added in the data table")
		public void admin_gets_a_message_successful_program_created_alert_and_able_to_see_the_new_program_added_in_the_data_table() {
			objprogram.getsuccessmsg();
		    
		}
		@When("Admin clicks Cancel button")
		public void admin_clicks_cancel_button() {
			objprogram.clickCancelButton();
		    
		}
		@Then("Admin can see the Program details popup disappears without creating any program")
		public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program() {
			objprogram.
		    
		}


//edit program 
		
		@When("Admin clicks Edit button on the data table for any row")
		public void admin_clicks_edit_button_on_the_data_table_for_any_row() {
		    
			objprogram.
		}
		@Then("Admin should see a popup open for Program details to edit")
		public void admin_should_see_a_popup_open_for_program_details_to_edit() {
		    
		    
		}

		@Given("Admin is on Program Details Popup window to Edit")
		public void admin_is_on_program_details_popup_window_to_edit() {
			objprogram. 
		    
		}
		@When("Admin edits the Name column and clicks save button")
		public void admin_edits_the_name_column_and_clicks_save_button() {
			objprogram.
		    
		}
		@Then("Admin gets a message {string} alert and able to see the updated name in the table for the particular program")
		public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String string) {
			objprogram. 
		    
		}
		@When("Admin edits the Description column and clicks save button")
		public void admin_edits_the_description_column_and_clicks_save_button() {
			objprogram.
		    
		}
		@Then("Admin gets a message {string} alert and able to see the updated description in the table for the particular program")
		public void admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String string) {
			objprogram.
		    
		}
		@When("Admin changes the Status and clicks save button")
		public void admin_changes_the_status_and_clicks_save_button() {
			objprogram.
		    
		}
		@Then("Admin gets a message {string} alert and able to see the updated status in the table for the particular program")
		public void admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String string) {
		    
			objprogram.
		}
		
		    
		
		
		@When("Admin clicks Cancel button on edit popup")
		public void admin_clicks_cancel_button_on_edit_popup() {
		    
			objprogram.
		}
		@Then("Admin can see the Program details popup disappears and can see nothing changed for particular program")
		public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
			objprogram.
		    
		}
		@When("Admin clicks Save button on edit popup")
		public void admin_clicks_save_button_on_edit_popup() {
		    
			objprogram.
		}
		@Then("Admin gets a message {string} alert and able to see the updated details in the table for the particular program")
		public void admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String string) {
			objprogram.
		    
		}
     
		//delete program
		
		@When("Admin clicks Delete button on the data table for any row")
		public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
			objprogram.
		    
		}
		@Then("Admin should see a alert open with heading Confirm along with  YES and NO button for deletion")
		public void admin_should_see_a_alert_open_with_heading_confirm_along_with_yes_and_no_button_for_deletion() {
		    
			objprogram.
		}
		@Then("Admin should see a message Are you sure you want to delete Program name?")
		public void admin_should_see_a_message_are_you_sure_you_want_to_delete_program_name() {
		    
			objprogram.
		}
		@Given("Admin is in Manage Program page")
		public void admin_is_in_manage_program_page() {
		    
			objprogram.
		}
		@When("Admin clicks any checkbox in the data table")
		public void admin_clicks_any_checkbox_in_the_data_table() {
		    
			objprogram.
		}
		@Then("Admin should see common delete option enabled under header Manage Program")
		public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
		    
			objprogram.
		}


        
		@When("Admin clicks YES button on the alert")
		public void admin_clicks_yes_button_on_the_alert() {
			objprogram.   
		    
		}
		@Then("Admin gets a message Successful Program Deleted alert and able to see that program deleted in the data table")
		public void admin_gets_a_message_successful_program_deleted_alert_and_able_to_see_that_program_deleted_in_the_data_table() {
			objprogram.
		    
		}
		@When("Admin clicks NO button on the alert")
		public void admin_clicks_no_button_on_the_alert() {
			objprogram.  
		    
		}
		@Then("Admin can see the deletion alert disappears without deleting")
		public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
			objprogram.
		    
		}
		@When("Admin clicks Cancel\\/Close\\(X) Icon on Deletion alert")
		public void admin_clicks_cancel_close_x_icon_on_deletion_alert() {
			objprogram. 
		    
		}
		@Then("Admin can see the deletion alert disappears without any changes")
		public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
			objprogram.
		    
		}
		
		
		    
		}
		@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
		public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
			objprogram. 
		    
		}
		
		    
		
		@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
		public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
			objprogram.  
		    
		}
		@Given("Admin is on Confirm Deletion alert")
		public void admin_is_on_confirm_deletion_alert() {
			objprogram.
		    
		}
		
		    
		
		@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
		public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
		    
		    
		}
		
		    

		@Then("Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
		public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
			objprogram.  
		    
		}
}
