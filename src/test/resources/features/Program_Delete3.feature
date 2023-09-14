@Program_deletion3
Feature: Program deletion validation

Background: Admin clicks delete button under header after selecting the check box in the data table

@deletion
Scenario: Validate multiple program deletion by selecting Single checkbox
Given Admin is on Confirm Deletion alert	
When Admin clicks YES button on the alert	
Then Admin should land on Manage Program page and can see the selected program is deleted from the data table

Scenario: Verify that program is not deleted by clicking on No button
Given Admin is on Confirm Deletion alert	
When Admin clicks NO button on the alert	
Then Admin should land on Manage Program page and can see the selected program is not deleted from the data table
