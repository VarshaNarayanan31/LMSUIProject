Feature: Delete multiple Assignment validation_1

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar
     Given Admin clicks "Assignment" button on the navigation bar
  
  Scenario: Verify delete multiple assignment button is enabled
    Given Admin is on the Manage Assignment page
    When Admin clicks single row level check box in the data table of manage assignment
    Then Admin should see delete icon below the header is enabled in manage assignment

  Scenario: verify tick mark is visible after clicking on check box
    Given Admin is on the Manage Assignment page
    When Admin clicks single row level check box in the data table of manage assignment
    Then Admin should see tick mark in check box in manage assignment
  
  Scenario: verify admin able to click multiple check box
    Given Admin is on the Manage Assignment page
    When Admin clicks multiple row level check box in the data table of manage assignment
    Then Admin should see tick mark in check box  of the selected rows in manage assignment