@program_Add2
Feature: Program add module

Background: Admin is on Manage Program Page after clicks Program on the navigation bar

@Add_program
Scenario: Empty form submission
Given Admin is on Program Details Popup window
When Admin clicks Save button without entering any data	
Then Admin gets a Error message alert

Scenario Outline: Program_Admin created a new program with all validate criterias
    Given Program_Admin clicks on A New Program button
    When Program_Admin Enter "<Name>","<Description>" and "<Message>"
    Then Program_Admin clicks on Save button

    Examples: 
      | Name            | Description    | Message                 |
      | SDET Automation | LMS Automation | New Program Created     |
      | SDET Automation |                | Description is required |
      |                 | LMS Automation | Name is required        |
      |                 |                | Name is required        |

Scenario: Select Status only
Given Admin is on Program Details Popup window
When Admin selects only Status and clicks Save button	
Then Admin gets a message alert Name and Description required

Scenario: Validate invalid values on the text column
Given Admin is on Program Details Popup window
When Admin enters only numbers or special char in name and desc column	
Then Admin gets a Error message alert 

Scenario: Validate Cancel/Close(X) icon on Program Details form
Given Admin is on Program Details Popup window
When Admin clicks Cancel/Close(X) Icon on Program Details form	
Then Program Details popup window should be closed without saving

Scenario: Validate Save button on Program Details form
Given Admin is on Program Details Popup window
When Enter all the required fields with valid values and click Save button	
Then Admin gets a message Successful Program Created alert and able to see the new program added in the data table

Scenario: Validate Cancel button on Program Details form
Given Admin is on Program Details Popup window
When Admin clicks Cancel button 	
Then Admin can see the Program details popup disappears without creating any program



