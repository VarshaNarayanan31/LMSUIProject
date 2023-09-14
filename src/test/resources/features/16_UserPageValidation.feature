#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@user
Feature: User page validation
 Background:  Logged on the LMS portal
  @tag1
  Scenario: Validate landing in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the URL
  @tag2
  Scenario: Validate header in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the "Manage User" in the header
  @tag3
    Scenario: Validate pagination in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should see the pagination controls under the data table
    @tag4
    Scenario: Validate data table headers in the User Page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin Should see the data table with headers Id, Name, location, Phone Number, Edit/Delete
    @tag5
    Scenario: Validate Delete button in User Page
    Given  Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "Delete" icon button that is disabled
    @tag6
    Scenario: Validate "+ A New user" button in User Page
    Given  Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "+ A New User" button
    @tag7
    Scenario: Validate "+ Assign staff"  button in User page
    Given  Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the "+ Assign staff" button
    @tag8
    Scenario: V Validate search box in User page
    Given Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Admin should be able to see the search text box
     @tag9
    Scenario: Validate data rows
    Given  Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then  Each row in the data table should have a checkbox
     @tag10
    Scenario: validate data rows
    Given  Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Each row in the data table should have a edit icon that is enabled
     @tag11
    Scenario: validate data rows
    Given  Admin is on dashboard page after Login
    When Admin clicks "User" from navigation bar
    Then Each row in the data table should have a delete icon that is enabled
    @tag12
    Scenario: Validate pop up for adding user
    Given Admin is on dashboard page after Login and Admin clicks "User" from navigation bar
    When Admin clicks "+ A New User" button
    Then A new pop up with User details appears