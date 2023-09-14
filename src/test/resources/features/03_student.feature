Feature: Student Page Verification


Background: Logged on the LMS portal as Admin 


Scenario: Validate the title of the page
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see the Student Details Page Title

Scenario: Validate response time from dashboard page to student page
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should wait for a maximum navigation time in milliseconds, which defaults to 30 seconds

Scenario: Validate the broken lin
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should receive an HTTP response >= 400, indicating that the link is broken

Scenario: Verify LMS title**
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see "LMS - Learning Management System" as the title

Scenario: Verify the alignment of the Student detail title
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Student Detail title should be in the center of the page

Scenario: Validate drop down is present on the page
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then 2 dropdowns should be present on the page

Scenario: Validate search bar in select student name dropdown
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see a search box inside the student name dropdown

Scenario: Validate search bar in select batch id dropdown
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see a search box inside the batch id dropdown

Scenario: Validate text spelling student name
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see the correct spelling of "select student name"

Scenario: Validate text spelling select batch id
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see the correct spelling of "select batch id" text

Scenario: Validate only numbers inside select batch id
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see only numbers inside the batch id dropdown

Scenario: Validate gray color in student name dropdown
 Given Admin is on the dashboard page after Login
When Admin clicks "Student" on the navigation bar
 Then Admin should see "select student name" in gray color

Scenario: Validate gray color in batch id dropdown
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see "select batch ID" in gray color

Scenario: Validate the first dropdown label is "select student name"
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see "select student name" as the first dropdown label

Scenario: Validate the second dropdown label is "select batch id"
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should see "select batch id" as the second dropdown label

Scenario: Validate scroll down inside student name dropdown
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should be able to scroll down to select a name

Scenario: Validate scroll down inside batch id dropdown
 Given Admin is on the dashboard page after Login
 When Admin clicks "Student" on the navigation bar
 Then Admin should be able to scroll down to select a batch 