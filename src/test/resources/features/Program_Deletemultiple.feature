@delete_multiple
Feature: Program deletion multiple functionality

Background: Admin clicks delete button under header after selecting multiple checkboxes in the data table

@deletion
Scenario: Validate multiple program deletion by selecting multiple check boxes
Given Admin is on Confirm Deletion alert	
When Admin clicks YES button on the alert	
Then Admin should land on Manage Program page and can see the selected programs are deleted from the data table

Scenario: Verify that program is not deleted by clicking on No button for multiple programs
Given Admin is on Confirm Deletion alert	
When Admin clicks NO button on the alert 	
Then Admin should land on Manage Program page and can see the selected programs are not deleted from the data table
		

