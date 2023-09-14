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
Feature: Delete class validation_2

Background: Admin clicks row level delete button after landing to manage class page

  @TC_class_71
  Scenario: Validate accept in alert
  
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Success message and validate particular class details are deleted from the data table
    
    @TC_class_72
  Scenario: Validate reject in alert
  
    Given Admin is in delete alert
    When Admin clicks no button
    Then Admin should land on manage class page and validate particular class details are not deleted from the data table