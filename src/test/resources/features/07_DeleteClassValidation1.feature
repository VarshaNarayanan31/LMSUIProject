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
Feature: Delete class validation_1

Background: Admin logged into LMS portal and clicks class button on the navigation bar 

  @TC_class_68
  Scenario: Verify Delete class alert
  
    Given Admin is in Manage class page
    When Admin clicks delete button in data table row level 
    Then Admin should see alert 
    
     @TC_class_69
  Scenario: Verify  accept enabled in alert
  
    Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Alert should have "yes" button to accept 
    
    @TC_class_70
  Scenario: Verify reject enabled in alert
  
    Given Admin is in Manage class page
    When Admin clicks delete button in data table row level
    Then Alert should have "No" button to reject
    
    
    