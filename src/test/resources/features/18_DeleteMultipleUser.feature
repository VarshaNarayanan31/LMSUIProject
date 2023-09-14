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
Feature: Delete multiple user

 Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks "User" from navigation bar

@tag16
    Scenario: Validate the delete icon below the header
		Given None of the checkboxes in data table are selected
		Then The delete icon under the "Manage User" header should be disabled
		
@tag17
    Scenario: Check for single row delete
		Given One of the checkbox/ row is selected
		When Click delete icon below "Manage User" header
		Then The respective row in the data table is deleted
		
@tag18
    Scenario: Check for multi row delete
		Given Two or more checkboxes/row is selected
		When Click delete icon below "Manage User" header
		Then The respective row in the data table is deleted