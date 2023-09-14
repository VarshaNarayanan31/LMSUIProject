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
Feature: Pagination in manage class_2

Background: Admin click +Add New Class button after reaching to Manage class page

  @TC_class_90
  Scenario: Verify next page is enabled
  
    Given Admin is in add class details popup window
    When Admin creates 6 new class 
    Then When total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)
    
    @TC_class_91
  Scenario: Verify next page is disabled
  
    Given Admin is in add class details popup window
    When Admin creates less than or equal to 5 new class 
    Then When total class entries  5 or below next page is disabled