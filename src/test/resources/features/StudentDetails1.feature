Feature: Student Page Verification

Background: Logged on the LMS portal as Admin 

@StudentDetails_1
Scenario: Validate the title of the page

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see the Student Details Page Title

@StudentDetails_2
Scenario: Validate the broken lin

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should receive an HTTP response >= 400, indicating that the link is broken

@StudentDetails_3
Scenario: Verify LMS title**

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see LMS - Learning Management System as the title

@StudentDetails_4
Scenario: Validate search bar in select student name dropdown

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see a search box inside the student name dropdown

@StudentDetails_5
Scenario: Validate search bar in select batch id dropdown

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see a search box inside the batch id dropdown

@StudentDetails_6
Scenario: Validate text spelling student name

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see the correct spelling of "select student name"

@StudentDetails_7
Scenario: Validate text spelling select batch id

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see the correct spelling of "select batch id" text

@StudentDetails_8
Scenario: Validate only numbers inside select batch id

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see only numbers inside the batch id dropdown

@StudentDetails_9
Scenario: Validate the first dropdown label is "select student name"

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see "select student name" as the first dropdown label

@StudentDetails_10
Scenario: Validate the second dropdown label is "select batch id"

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see "select batch id" as the second dropdown label

@StudentDetails_11
Scenario: Validate scroll down inside student name dropdown

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should be able to scroll down to select a name

@StudentDetails_12
Scenario: Validate scroll down inside batch id dropdown

 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should be able to scroll down to select a batch 