
Feature: Manage Attendance Page verification

  Background: Logged on the LMS portal as Admin

    Given Admin is on dashboard page after Login

    When Admin clicks "Attendance" on the navigation bar

  Scenario: Validate the header of the page
    Then Admin should see the "Manage Attendance" in header

  Scenario: Validate response time from dashboard page to attendance page
    Then Maximum navigation time in milliseconds, defaults to 30 seconds

  Scenario: Validate the broken link
    Then HTTP response >= 400. Then the link is broken

  Scenario: Verify LMS title
    Then Admin should see "LMS -Learning management system"  as title

  Scenario: Verify the alignment of the Manage Attendance header
    Then Manage attendance header should be in left side of the page

  Scenario: Validate text in manage attendancepage
    Then Admin should see correct spelling for the all the fields in get all text from the portal page

  Scenario: Verify delete icon below the header
    Then Admin should see disabled delete icon below the "Manage Attendance"

  Scenario: Verify search bar on the class page
    Then Admin should see search bar on the attendance page

  Scenario: Verify add new Attendance button  on Attendance page
    Then Admin should see +Add New Attendance button on the attendance page

  Scenario: Verify data table on the attendance page

    Then Admin should see data table on the Manage Attendance Page With following column headers.
      | data_table | | Class ID || Student Id || Present || Edit /Delete |

  Scenario: Verify Edit icon in the data table
    Then Edit Icon in each row of data table only  when entries are available

  Scenario: Verify Edit icon when no data in the table
    Then Edit Icon will not be present in data table

  Scenario: Verify delete icon in the data table
    Then Delete Icon in each row of data table only  when entries are available

  Scenario: Verify delete icon when no data in the table
    Then Admin cant see delete  Icon in data table

  Scenario: Verify sort icon in the data table
    Then Admin should see sort icon near the column headers except for Edit and Delete


  Scenario: Verify check box in the data table
    Then Admin should see check box in the all rows  of data table

  Scenario: Validate the number entries displaying
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table.

  Scenario: Verify Pagination control below the data table
    Then Admin should see the pagination controls under the data table

  Scenario: Validate footer  text
    Then Admin should see the text with total number classes in the data table. ( " In total there are number of classes")



