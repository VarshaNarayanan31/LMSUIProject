Feature: Validate search box function

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 
Given Admin clicks "Assignment" button on the navigation bar

Scenario: Validate search box function by assignment name
Given Admin is on the Manage Assignment page
When Admin enters Assignment Name into the search box
|assignmentName|
|Jun23-Apidaggers-SDET-SQL-002|
Then Admin should see Displays entries with that assignment name in the data table  
   
Scenario: Validate search box function by non-existing assignment name
Given Admin is on the Manage Assignment page
When Admin enters non-existing Assignment Name into the search box
|nonExistingAssignmentName|
|Jun23-hsgdags|
Then Displays empty fields in the datatable

Scenario: Validate search box function by assignment description
Given Admin is on the Manage Assignment page
When Admin enters Assignment description into the search box
|assignmentDescription|
|sql assignment|
Then Displays entries with that assignment description
   
Scenario: Validate search box function by non-existing assignment description
Given Admin is on the Manage Assignment page
When Admin enters non-existing Assignment description into the search box
|nonExistentAssignmentDescription|
|sql assignment|
Then Displays empty fields in the datatable

Scenario: Validate search box function by  assignment duedate
Given Admin is on the Manage Assignment page
When Admin enters Assignment description into the search box
|assignmentDueDate|
|06-10-2020|
Then Displays entries with that assignment due date

   
Scenario: Validate search box function by non-existing assignment duedate
Given Admin is on the Manage Assignment page
When Admin enters non-existing Assignment duedate into the search box
|nonExistingAssignmentDueDate|
|07-05-2023|
Then Displays empty fields in the datatable


Scenario: Validate search box function by grade value
Given Admin is on the Manage Assignment page
When Admin enters grade Value into the search box
|gradeValue|
|1|
Then Displays entries with that assignment grade  

Scenario: Validate search box function by non-existing grade value
Given Admin is on the Manage Assignment page
When Admin enters non-existing grade Value into the search box
|nonExistingGradeValue|
|10|
Then Displays empty fields in the datatable 
