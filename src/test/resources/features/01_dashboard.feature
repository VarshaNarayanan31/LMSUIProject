Feature: Dashboard Page

Background: Admin clicks Login butter after giving correct URL

Scenario: Verify after login admin lands on manage program as dashboard page
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "Manage Program" as the header

Scenario: Verify the response time
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should wait for a maximum navigation time in milliseconds, which defaults to 30 seconds

Scenario: Verify broken link
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should receive an HTTP response >= 400, indicating that the link is broken

Scenario: Verify LMS title
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "LMS - Learning Management System" as the title

Scenario: Verify LMS title alignment
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then LMS title should be on the top left corner of the page

Scenario: Validate navigation bar text
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see correct spelling in the navigation bar text

Scenario: Validate LMS title has correct spelling and space
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see correct spelling and space in the LMS title

Scenario: Validate alignment for navigation bar
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see the navigation bar text on the top right side

Scenario: Validate navigation bar order 1st Student
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "student" in the 1st place

Scenario: Validate navigation bar order 2nd Program
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "program" in the 2nd place

Scenario: Validate navigation bar order 3rd Batch
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "batch" in the 3rd place

Scenario: Validate navigation bar order 4th Class
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "class" in the 4th place

Scenario: Validate navigation bar order 5th User
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "student" in the 5th place

Scenario: Validate navigation bar order 6th Assignment
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "assignment" in the 6th place

Scenario: Validate navigation bar order 7th Attendance
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "attendance" in the 7th place

Scenario: Validate navigation bar order 8th Logout
 Given Admin is in the login page
 When Admin enters valid credentials and clicks the login button
 Then Admin should see "logout" in the 8th place
 