Feature: Delete Assignment validation_2

Background: Admin clicks row level delete button after landing to manage assignment page

  Scenario: Validate accept in alert
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Success message and validate particular Assignment details are deleted from the data table
   
  Scenario: Validate reject in alert
    Given Admin is in delete alert
    When Admin clicks no button
    Then Admin should land on manage Assignment page and validate particular Assignment details are not deleted from the data table
