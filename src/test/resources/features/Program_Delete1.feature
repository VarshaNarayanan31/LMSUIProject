@Program_delete1
Feature: Check the Program page Delete Functionality

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

Scenario: Delete Feature
Given Admin is on Manage Program Page 
When Admin clicks Delete button on the data table for any row	
Then Admin should see a alert open with heading Confirm along with  YES and NO button for deletion

Scenario: Validate details for Confirm Deletion form
Given Admin is on Manage Program Page
When Admin clicks Delete button on the data table for any row	
Then Admin should see a message Are you sure you want to delete Program name?

Scenario: Validate Common Delete button enabled after clicking on any checkbox
Given Admin is in Manage Program page	
When Admin clicks any checkbox in the data table	
Then Admin should see common delete option enabled under header Manage Program


