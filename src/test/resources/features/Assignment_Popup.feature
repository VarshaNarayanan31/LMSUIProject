
Feature: Assignment Details Popup in LMS Admin Portal

Background: admin logged into Lms portal
Given Admin logged into the LMS portal and clicks assignment button on the navigation bar

Scenario: verify Assignment Details Popup window
Given Admin is on the "Manage Assignment" page
When Admin clicks the "+Add new assignment" button
Then Admin should see a popup with the heading "Assignment details"

Scenario: verifies input fields in Assignment Details Popup window
Given Admin is on the "Manage Assignment" page
When Admin clicks the "+Add new assignment" button
Then Admin should see the following input fields:
       |Program name|
      | Batch number|
       |Assignment Name|
       |Assignment Description|
      |Grade by|
       |Assignment due date|
       |Assignment File 1|
       |Assignment file 2|
       |Assignment file 3|
       |Assignment file 4|
       |Assignment file 5|

Scenario: verify the presence of text boxes in Assignment Details Popup window
Given Admin is on the "Manage Assignment" page
When Admin clicks the "+Add new assignment" button
Then Admin should see 8 textboxes in the Assignment details popup window

Scenario: verify  dropdown in Batch Number in Assignment Details Popup window
 Given Admin is on the "Manage Assignment" page
 When Admin clicks the "+Add new assignment" button
 Then Admin should see a dropdown option for Batch Number

 Scenario: verify dropdown in Program Name in Assignment Details Popup window
 Given Admin is on the "Manage Assignment" page
 When Admin clicks the "+Add new assignment" button
 Then Admin should see a dropdown option for Program Name

Scenario: verify  calendar icon in Assignment Due Date in Assignment Details Popup
Given Admin is on the "Manage Assignment" page
 When Admin clicks the "+Add new assignment" button
Then Admin should see a calendar icon for selecting the assignment due date

Scenario: verify  Save button is present
Given Admin is on the "Manage Assignment" page
When Admin clicks the "+Add new assignment" button
Then Admin should see a Save button in the Assignment details popup window

Scenario: verify Cancel button is present
Given Admin is on the "Manage Assignment" page
When Admin clicks the "+Add new assignment" button
Then Admin should see a Cancel button in the Assignment details popup window

Scenario: verify  Close button in Assignment Details Popup window
Given Admin is on the "Manage Assignment" page
When Admin clicks the "+Add new assignment" button
Then Admin should see a Close button on the Assignment details popup window





