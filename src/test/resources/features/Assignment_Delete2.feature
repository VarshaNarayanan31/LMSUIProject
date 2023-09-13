Feature: Delete Assignment validation_2

Background: Admin clicks row level delete button after landing to manage assignment page
    Given Admin clicks row level delete button in Manage Assignment
    
  Scenario: Validate accept in alert for manage assignment
    Given Admin is in delete alert for assignmentPage
    When Admin clicks yes button for assignment
    Then Success message and validate particular Assignment details are deleted from the data table
   
  Scenario: Validate reject in alert for manage assignment
    Given Admin is in delete alert for assignmentPage
    When Admin clicks no button for assignment
    Then Admin should land on manage Assignment page and validate particular Assignment details are not deleted from the data table
