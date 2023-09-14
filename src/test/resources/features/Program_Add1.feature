@Program_Add1
Feature: Add Program

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

@Searchbox
Scenario: Search Program By Name
Given Admin is on Manage Program Page
When Admin enters Program name phrase into search box.	
Then Admin should see the Programs displayed based on the Program Name

Scenario: Search Program By Description
Given Admin is on Manage Program Page
When Admin enters Program description phrase into search box.	
Then Admin should see the Programs displayed based on the Program Description

Scenario: Search Program By Status
Given Admin is on Manage Program Page
When Admin enters Program status phrase into search box.	
Then Admin should see the Programs displayed based on the Program Status

Scenario: Validating the Search with unrelated keyword
Given Admin is on Manage Program Page
When Admin enters the keywords not present in the data table on the Search box 	
Then Admin should see zero entries on the data table

@add_program
Scenario: Validate Program Details Popup window
Given Admin is on Manage Program Page
When Admin clicks A New Program button	
Then Admin should see a popup open for Program details with empty form along with SAVE and CANCEL button 
and Close(X) Icon on the top right corner of the window

Scenario: Validate input fields and their text boxes in Program details form 
Given Admin is on Manage Program Page
When Admin clicks A New Program button	
Then Admin should see two input fields and their respective text boxes in the program details window

Scenario: Validate radio button for Program Status 
Given Admin is on Manage Program Page
When Admin clicks A New Program button	
Then Admin should see two radio button for Program Status


