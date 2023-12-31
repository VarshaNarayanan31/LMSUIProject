   
Feature: Manage assignment page verification

Background: Logged into lms portal
Given: Logged into the Lms portal as admin

Scenario: verify landing in manage assignment page 
Given Admin is on dashboard page after Login
When Admin clicks "assignment" button on the navigation bar
Then Admin should see URL with "Manage assignment"

Scenario: Capture the response time to navigate to manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks "assignment" button on the navigation bar
Then Get the response time for navigation from dashboard page to manage assignment page

Scenario: Verify manage assignment page Header	
Given Admin is on dashboard page after Login
When  Admin clicks "assignment" button on the navigation bar	
Then  Admin should see header with "Manage assignment"

Scenario: Validate text in manage assignment page
Given Admin is on dashboard page after Login
When  Admin clicks "assignment" button on the navigation bar and get all text from the portal page	
Then  Admin should see correct spelling for the all the fields

Scenario: Verify delete icon below the header	
Given Admin is on dashboard page after Login
When Admin clicks "assignment" button on the navigation bar	
Then Admin should see disabled delete icon below the "Manage assignment"

Scenario: Verify search bar on the manage assignment page	
Given Admin is on dashboard page after Login
When Admin clicks "assignment" button on the navigation bar	
Then Admin should see search bar on the manage assignment page

Scenario: verify add new assignment button on manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks "assignment" button on the navigation bar	
Then Admin should see +Add New assignment button on the manage assignment page

Scenario: Verify data table on the Manage Assignment page
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Admin should see a data table on the Manage Assignment page with the following column headers: 
      | Checkbox Symbol | Assignment name | Assignment description | Assignment Date | Assignment Grade | Edit | Delete |

Scenario: Verify Edit icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Edit Icon in each row of the data table should only appear when entries are available

Scenario: Verify Edit icon when no data in the table
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Edit Icon should not be present in the data table

Scenario: Verify delete icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Delete Icon in each row of the data table should only appear when entries are available

Scenario: Verify delete icon when no data in the table
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Delete Icon should not be present in the data table

Scenario: Verify sort icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Admin should see sort icons near the column headers except for Edit and Delete

Scenario: Verify check box in the data table
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Admin should see a check box in all rows of the data table when entries are available

Scenario: Validate the number of entries displaying
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Above the footer, Admin should see the text as "Showing x to y of z entries" below the table
   
      
Scenario: Verify Pagination control below the data table
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Admin should see pagination controls under the data table

Scenario: Validate footer text
Given Admin is on dashboard page after Login
When Admin clicks the "assignment" button on the navigation bar
Then Admin should see the text with the total number of assignments in the data table: "In total, there are number of assignments"

Scenario: Validate search box function by assignment name
When Admin is on the Manage Assignment page
And Admin enters Assignment Name into the search box
|assignmentName|
|Jun23-Apidaggers-SDET-SQL-002|
Then Admin should see Displays entries with that assignment name in the data table  
   
Scenario: Validate search box function by non-existing assignment name
When Admin is on the Manage Assignment page
And Admin enters non-existing Assignment Name into the search box
|nonExistingAssignmentName|
|Jun23-hsgdags|
Then Displays empty fields in the data table

Scenario: Validate search box function by assignment description
When Admin is on the Manage Assignment page
And Admin enters Assignment description into the search box
|assignmentDescription|
|sql assignment|
Then Displays entries with that assignment description
   
Scenario: Validate search box function by non-existing assignment description
When Admin is on the Manage Assignment page
And Admin enters non-existing Assignment description into the search box
|nonExistentAssignmentDescription|
|sql assignment|
Then Displays empty fields in the datatable

Scenario: Validate search box function by  assignment duedate
When Admin is on the Manage Assignment page
And Admin enters Assignment description into the search box
|assignmentDueDate|
|06-10-2020|
Then Displays entries with that assignment due date

   
Scenario: Validate search box function by non-existing assignment duedate
When Admin is on the Manage Assignment page
And Admin enters non-existing Assignment duedate into the search box
|nonExistingAssignmentDueDate|
|07-05-2023|
Then Displays empty fields in the datatable


Scenario: Validate search box function by grade value
When Admin is on the Manage Assignment page
And Admin enters grade Value into the search box
|gradeValue|
|1|
Then Displays entries with that assignment grade  

Scenario: Validate search box function by non-existing grade value
When Admin is on the Manage Assignment page
And Admin enters non-existing grade Value into the search box
|nonExistingGradeValue|
|10|
Then Displays empty details in the data table 
   

  