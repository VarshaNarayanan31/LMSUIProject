@Program_Edit1
Feature: Program edit functionality

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar	

@Edit
Scenario: Validate Edit Feature	
Given Admin is on Manage Program Page 	
When Admin clicks Edit button on the data table for any row	
Then Admin should see a popup open for Program details to edit

