@Program_Sorting_Functionality
Feature: Sortind and Pagination of Program

Background: Admin is on Manage Program Page after clicks Program on the navigation bar	

@Program_Sorting
Scenario: Verify Program Name are displayed in Ascending order
Given Admin is on Manage Program page	
When Admin clicks the sort icon of program name column	
Then The data get sorted on the table based on the program name column values in ascending order

Scenario: Verify Program Name are displayed in Descending order		
Given The data is in the ascending order on the table based on Program Name column	
When Admin clicks the sort icon of program name column	
Then The data get sorted on the table based on the program name column values in descending order

Scenario: Verify Program Description are displayed in Ascending order		
Given Admin is on Manage Program page	
When Admin clicks the sort icon of program Desc column	
Then The data get sorted on the table based on the program description column values in ascending order
		
Scenario: Verify Program Description are displayed in Descending order
Given The data is in the ascending order on the table based on Program Description column	
When Admin clicks the sort icon of program Desc column	
Then The data get sorted on the table based on the program description column values in descending order
		
Scenario: Verify Program Status are displayed in Ascending order
Given Admin is on Manage Program page	
When Admin clicks the sort icon of program Status column	
Then The data get sorted on the table based on the program status column values in ascending order
		
Scenario: Verify Program Status are displayed in Descending order
Given The data is in the ascending order on the table based on Program Status column	
When Admin clicks the sort icon of program Status column	
Then The data get sorted on the table based on the program status column values in descending order		

@Program_pagination
Scenario: Verify Next page link
Given Admin is on Manage Program page	
When Admin clicks Next page link on the program table 	
Then Admin should see the Pagination has Next link	

Scenario: Verify Last page link
Given Admin is on Manage Program page 	
When Admin clicks Last page link	
Then Admin should see the last page record on the table with Next page link are disabled
	
Scenario: Verify First page link
Given Admin is on last page of Program table	
When Admin clicks First page link	
Then Admin should see the previous page record on the table with pagination has previous page link
	
Scenario: Verify Start page link
Given Admin is on Previous Program page 	
When Admin clicks Start page link	
Then Admin should see the very first page record on the table with Previous page link are disabled
	


