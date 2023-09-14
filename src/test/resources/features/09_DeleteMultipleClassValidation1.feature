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
@class
Feature: Delete multiple class validation_1

Background: Admin logged into LMS portal and clicks class button on the navigation bar 

  @TC_class_73
  Scenario: Verify delete multiple class  button is enabled
  
    Given Admin is in Manage class page
    When Admin clicks single  row level check box in the data table
    Then Admin should see delete icon below the header is enabled
    
    @TC_class_74
  Scenario: verify tick mark is visible after clicking on check box
  
    Given Admin is in Manage class page
    When Admin clicks single  row level check box in the data table
    Then Admin should see tick mark in check box 
    
    @TC_class_75
  Scenario: verify admin able to click multiple check box
  
    Given Admin is in Manage class page
    When Admin clicks multiple row level check box in the data table
    Then Admin should see tick mark in check box  of the selected rows
    