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
Feature: Delete multiple class validation_3

Background: Admin clicks delete button under header after selecting the multiple check box in the data table

  @TC_class_78
  Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
  
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Admin should land on manage class page and validate particular class details are deleted from the data table
    
    @TC_class_79
  Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
  
    Given Admin is in delete alert
    When Admin clicks no button
    Then Admin should land on manage class page and validate particular class details are not deleted from the data table