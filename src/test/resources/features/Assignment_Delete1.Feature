Feature: Delete Assignment validation

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar
 Given Admin clicks "Assignment" button on the navigation bar
 
  Scenario: Verify Delete Assignment alert
    Given Admin is on the Manage Assignment page
    When Admin clicks delete button in data table row level
    Then Admin should see alert
     
  Scenario: Verify  accept enabled in alert
    Given Admin is on the Manage Assignment page
    When Admin clicks delete button in data table row level
    Then Alert should have "yes" button to accept
   
  Scenario: Verify reject enabled in alert
    Given Admin is on the Manage Assignment page
    When Admin clicks delete button in data table row level
    Then Alert should have "No" button to reject
