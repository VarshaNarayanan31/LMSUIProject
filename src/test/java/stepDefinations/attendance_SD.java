package stepDefinations;
import baseClass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Attendance_POM;

public class attendance_SD extends TestBase {
        long start;
        long end;
        long responsetime;
        Attendance_POM at_manage = new Attendance_POM();
        // Manage attendance steps
        @Given("Admin is on dashboard page after Login")
        public void admin_is_on_dashboard_page_after_Login() {



            System.out.println("Admin is in dashboard page after login");
        }

        @When("Admin clicks {string} on the navigation bar")
        public void admin_clicks_on_the_navigation_bar(String string) {
            start = System.currentTimeMillis();
           //

        }
        //Validate the header of the page
        @Then("Admin should see the {string} in header")
        public void admin_should_see_the_Manage_attendance_in_header(String Heading) {
            at_manage.verifyTitle();
        }
        //Validate response time
        @Then("Maximum navigation time in milliseconds, defaults to {int} seconds")
        public void maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) {
            long responseTime = end - start;
            System.out.println("Response time" + responseTime);


        }
        //Validate the broken link
        @Then("HTTP response >= {int}. Then the link is broken")
        public void http_response_Then_the_link_is_broken(Integer int1) {


        }
        //Verify LMS title
        @Then("Admin should see {string}  as title")
        public void admin_should_see_LMS_Learning_management_system_as_title(String expectedtitle) {
            at_manage.verifyTitle();

        }

        //Verify the alignment of the Manage Attendance header
        @Then("Manage attendance header should be in left side of the page")
        public void manage_attendance_header_should_be_in_left_side_of_the_page() {


        }

        //Validate text in manage attendancepage
        @Then("Admin should see correct spelling for the all the fields in get all text from the portal page")
        public void admin_should_see_correct_spelling_for_the_all_the_fields() {


        }

        @Then("Admin should see disabled delete icon below the {string}")
        public void admin_should_see_disabled_delete_icon_below_the(String string) {


        }

        @Then("Admin should see search bar on the attendance page")
        public void admin_should_see_search_bar_on_the_attendance_page() {


        }

        @Then("Admin should see +Add New Attendance button on the attendance page")
        public void admin_should_see_Add_New_Attendance_button_on_the_attendance_page() {


        }

        @Then("Admin should see data table on the Manage Attendance Page With following column headers.")
        public void admin_should_see_data_table_on_the_Manage_Attendance_Page_With_following_column_headers_Check_box_symbol_Class_ID_Student_Id_Preasent_Edit_Delete() {


        }

        @Then("Edit Icon in each row of data table only  when entries are available")
        public void edit_Icon_in_each_row_of_data_table_only_when_entries_are_available() {


        }

        @Then("Edit Icon will not be present in data table")
        public void edit_Icon_will_not_be_present_in_data_table() {


        }

        @Then("Delete Icon in each row of data table only  when entries are available")
        public void delete_Icon_in_each_row_of_data_table_only_when_entries_are_available() {


        }

        @Then("Admin cant see delete  Icon in data table")
        public void admin_cant_see_delete_Icon_in_data_table() {


        }

        @Then("Admin should see sort icon near the column headers except for Edit and Delete")
        public void admin_should_see_sort_icon_near_the_column_headers_except_for_Edit_and_Delete() {


        }

        @Then("Admin should see check box in the all rows  of data table")
        public void admin_should_see_check_box_in_the_all_rows_of_data_table() {


        }

        @Then("Above the footer Admin should see the text as {string} below the table.")
        public void above_the_footer_Admin_should_see_the_text_as_below_the_table(String string) {


        }

        @Then("Admin should see the pagination controls under the data table")
        public void admin_should_see_the_pagination_controls_under_the_data_table() {


        }

        @Then("Admin should see the text with total number classes in the data table. \\( {string})")
        public void admin_should_see_the_text_with_total_number_classes_in_the_data_table(String string) {


        }

        ///////*******************Attendance Details Feature ****************************///////

        @Given("Admin is in manage attendance page")
        public void admin_is_in_manage_attendance_page() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @When("Admin clicks + a new attendance button")
        public void admin_clicks_a_new_attendance_button() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Admin should see correct spellings in the label")
        public void admin_should_see_correct_spellings_in_the_label() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Four dropdown should be present")
        public void four_dropdown_should_be_present() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Admin should see  close button on the attendance details popup window")
        public void admin_should_see_close_button_on_the_attendance_details_popup_window() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Close button should on the top right corner")
        public void close_button_should_on_the_top_right_corner() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("First dropdown box {string} text  should be present")
        public void first_dropdown_box_text_should_be_present(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Second dropdown box {string} text  should be present")
        public void second_dropdown_box_text_should_be_present(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Third dropdown box {string} text  should be present")
        public void third_dropdown_box_text_should_be_present(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Fourth dropdown box {string} text  should be present")
        public void fourth_dropdown_box_text_should_be_present(String string) {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Admin  should text in gray color")
        public void admin_should_text_in_gray_color() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Admin should see  save button in the class detail popup window")
        public void admin_should_see_save_button_in_the_class_detail_popup_window() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Admin should see  cancel button in the class detail popup window")
        public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }

        @Then("Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.")
        public void order_of_the_label_should_be_Program_name_Class_Name_Student_Name_Attendance_Attendance_Date() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }








    }


