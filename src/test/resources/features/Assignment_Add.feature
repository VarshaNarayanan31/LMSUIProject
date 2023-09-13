Feature: Add new Assignmemnt

Background: Admin click +Add new assignment button after reaching to manage assignment page
Given: Admin click +Add new assignmnet button

Scenario Outline: Validate admin able to add new assignment with valid data in mandatory fields

Given Admin is in assignment details popup window
When Admin enters all mandatory field values with valid data from <sheetName> and <rowNumber> and clicks save button 
Then Admin should see new assignment details is added in the data table

Examples:
  |sheetName|rowNumber|
   |data_assignment  |1        |


Scenario Outline: Validate admin able to add new assignment with invalid data in mandatory fields

Given Admin is in assignment details popup window
When Admin enters all mandatory field values with invalid data from <sheetName> and <rowNumber> and clicks save button 
Then Error message should appear in alert

Examples:
 |sheetname|rownumber|
    |data_assignment|2|

Scenario Outline: Validate admin able to add new assignment with valid data in all fields

Given Admin is in assignment details popup window
When Admin enters values in all fields with valid data <sheetName> and <rowNumber> and clicks save button 
Then Admin should see new assignment details is added in the data table

Examples:
 |sheetname|rownumber|
    |data_assignment|3|

Scenario Outline: Validate admin able to add new assignment with invalid data in optional fields

Given Admin is in assignment details popup window
When Admin enters with invalid data in optional fields <sheetName> and <rowNumber> and clicks save button 
Then Error message should appear in alert

Examples:
 |sheetname|rownumber|
    |data_assignment|4|


Scenario Outline: Validate admin able to add new assignment missing program name

Given Admin is in assignment details popup window
When Admin enters  data missing value in program name <sheetName> and <rowNumber> and clicks save button 
Then Program name is missing

Examples:
 |sheetname|rownumber|
    |data_assignment|5|

Scenario Outline: Validate admin able to add new assignment missing batch number

Given Admin is in assignment details popup window
When Admin enters  data missing value in batch number <sheetName> and <rowNumber> and clicks save button 
Then Batch number is missing

Examples:
 |sheetName|rowNumber|
    |data_assignment|6|

Scenario Outline: Validate admin able to add new assignment missing Assignment name 

Given Admin is in assignment details popup window
When Admin enters  data missing value in assignment name <sheetName> and <rowNumber> and clicks save button 
Then Assignment name is missing

Examples:
 |sheetname|rownumber|
    |data_assignment|7|

Scenario Outline: Validate admin able to add new assignment missing duedate

Given Admin is in assignment details popup window
When Admin enters  data missing value in due date <sheetName> and <rowNumber> and clicks save button 
Then due date is missing

Examples:
 |sheetname|rownumber|
    |data_assignment|8|

Scenario Outline: Validate admin able to add new assignment missing grade by 

Given Admin is in assignment details popup window
When Admin enters  data missing value in grade by <sheetName> and <rowNumber> and clicks save button 
Then grade by is missing

Examples:
 |sheetname|rownumber|
  |data_assignment|9|

Scenario Outline: Validate admin able to add new assignment passing past date

Given Admin is in assignment details popup window
When Admin enters Passed date in the due date field <sheetName> and <rowNumber> and clicks save button 
Then Assignment cannot be created for the passed date

Examples:
 |sheetname|rownumber|
    |data_assignment|10|
    

Scenario: Validate date picker

Given Admin is in assignment details popup window
When Admin clicks date from date picker
Then selected date should be their in class date text box
