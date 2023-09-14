Feature: Delete Assignment validation

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar
 Given Admin clicks "Assignment" button on the navigation bar
 
 @DeleteAssignmet_1
  Scenario: Verify Delete Assignment alert
    Given Admin is on the Manage Assignment page
    When Admin clicks delete button in data table row level in assignment page
    Then Admin should see alert
  
  @DeleteAssignment_2   
  Scenario: Verify  accept enabled in alert
    Given Admin is on the Manage Assignment page
    When Admin clicks delete button in data table row level in assignment page
    Then Alert should have "yes" button to accept
  
  @DeleteAssignment_3 
  Scenario: Verify reject enabled in alert
    Given Admin is on the Manage Assignment page
    When Admin clicks delete button in data table row level in assignment page
    Then Alert should have "No" button to reject
