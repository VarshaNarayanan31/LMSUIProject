Feature: Verify sort function in manage assignment page

Background: Admin is manage assignment page after logged in
Given Admin is on the Manage Assignment page

@AssignSort_1
Scenario: Verify sort function in data table for ascending order
Given Admin is on the Manage Assignment page
When Admin click on assignment name column header to sort 
Then Admin should see data table sorted in ascending order

@AssignSort_2
Scenario: Verify sort function in data table for descending order
Given Admin is on the Manage Assignment page
When Admin double click on assignment name column header to sort 
Then Admin should see data table sorted in descending order


