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
Feature: Delete user
 Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks "User" from navigation bar
@tag13
    Scenario: Validate row level delete icon
		Given The delete icon on row level in data table is enabled
		When Admin clicks the delete icon
		Then Alert appears with yes and No option
@tag14
    Scenario: Validate accept alert
		Given Admin clicks the delete icon
		When Admin click yes option
		Then User deleted alert pops and user is no more available in data table
@tag15
    Scenario: Validate reject alert
		Given Admin clicks the delete icon
		When Admin click No option
		Then User is still listed in data table
		