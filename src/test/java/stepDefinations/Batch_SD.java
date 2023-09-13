package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Assignment_POM;
import pages.Batch_POM;

public class Batch_SD {
	

	Assignment_POM Assign = new Assignment_POM(driver);
    Batch_POM batch = new Batch_POM(driver);
    
    
	@When("Admin clicks {string} from navigation bar")
	public void admin_clicks_from_navigation_bar(String string) {
	  
		Assign.clickBatch();
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
	   batch.verifyurl();
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
	    batch.verifyAssignTitle();
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
	    Assign.paginationControl();
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
	    Assign.headerValidation();
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	   Assign.DisabledIcon();
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
	    batch.NewBatchButton();
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
	  Assign.checkBox();
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	    Assign.editBtn();
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
	    batch.deleteIconEnabled();
	}

	@When("AAdmin clicks {string} button")
	public void a_admin_clicks_button(String string) {
	    batch.NewBatchButtonClk();
	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
	   batch.batchDetailsPopup();
	}

}
