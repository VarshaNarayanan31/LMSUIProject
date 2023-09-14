Feature: Delete multiple assignment validation3

Background: Admin clicks delete button under header after selecting the multiple check box in the data table

  @deleteAssignment_9
  Scenario: Verify accept alert in delete multiple assignment function by selecting multiple checkbox
    Given Admin is in delete alert for assignmentPage
    When Admin clicks yes button for assignment
    Then Admin should land on manage assignment page and validate particular assignment details are deleted from the data table
  
    @deleteAssignment_10 
  Scenario: Verify reject alert in delete multiple assignment function by selecting multiple checkbox
    Given Admin is in delete alert for assignmentPage
    When Admin clicks no button for assignment
    Then Admin should land on manage assignment page and validate particular assignment details are not deleted from the data table