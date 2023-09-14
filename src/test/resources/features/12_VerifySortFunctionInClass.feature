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
Feature: Verify sort function in manage class page

Background: Admin is in manage class page after logged in

  @TC_class_80
  Scenario: Verify sort function in data table for descending order
  
    Given Admin is in Manage class page
    When Admin click on Batch id column header to sort 
    Then Admin should see data table sorted in descending order
    
    @TC_class_81
  Scenario: Verify sort function in data table for ascending order
  
    Given Admin is in Manage class page
    When Admin double click on Batch id column header to sort 
    Then Admin should see data table sorted in ascending  order
    