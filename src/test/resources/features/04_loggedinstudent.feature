Feature: Student Page Verification and Navigation

Background:Admin is logged in and on the student Details page


Scenario: Validate select student name is fading
 Given Admin is on the student details page
 When Admin selects a student name from the dropdown
 Then Admin shouldn't see the "select student name" text

Scenario: Validate select batch id is fading
 Given Admin is on the student details page
 When Admin selects a batch id from the dropdown
 Then Admin shouldn't see the "select batch id" text

Scenario: Validate select student name using search box
 Given Admin is on the student details page
 When Admin clicks the select student name dropdown and enters "x" alphabet in the search box
 Then Admin should see student names starting with "x" listed below

Scenario: Validate select batch id using search box
 Given Admin is on the student details page
 When Admin clicks the select batch id dropdown and enters "x" number in the search box
 Then Admin should see batch IDs starting with "x" listed below

Scenario: Validate selecting only student name will not display any details
 Given Admin is on the student details page
 When Admin selects only the student name
 Then Student details shouldn't be displayed

Scenario: Validate selecting only batch id will not display any details
 Given Admin is on the student details page
 When Admin selects only the batch id
 Then Student details shouldn't be displayed

Scenario: Validate selecting student name and batch id
 Given Admin is on the student details page
 When Admin selects both student name and batch id
 Then Particular student information should be displayed



Scenario: Program link on the navigation bar
 Given Admin is on the student details page
 When Admin clicks on the program link on the student page
 Then Admin is redirected to the Program page

Scenario: Batch link on the navigation bar
 Given Admin is on the student details page
 When Admin clicks on the Batch link on the student page
 Then Admin is redirected to the Batch page

Scenario: Class link on the navigation bar
 Given Admin is on the student details page
 When Admin clicks on the Class link on the student page
 Then Admin is redirected to the Class page

Scenario: User link on the navigation bar
 Given Admin is on the student details page
 When Admin clicks on the User link on the student page
 Then Admin is redirected to the User page

Scenario: Assignment link on the navigation bar
 Given Admin is on the student details page
 When Admin clicks on the Assignment link on the student page
 Then Admin is redirected to the Assignment page

Scenario: Attendance link on the navigation bar
 Given Admin is on the student details page
 When Admin clicks on the Attendance link on the student page
 Then Admin is redirected to the Attendance page

Scenario: Logout link on the navigation bar
 Given Admin is on the student details page
 When Admin clicks on the Logout link on the student page
 Then Admin is redirected to the Login page