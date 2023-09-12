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
Feature: Navigation function validation from manage class page to other pages  

Background: Admin is manage class page after logged in

  @TC_class_92
  Scenario: Verify admin is able to navigate from manage class to student page
  
    Given Admin is in Manage class page
    When Admin clicks " Student" button in the navigation bar
    Then Admin should be able to land on student page
    
    @TC_class_93
  Scenario: Verify admin is able to navigate from manage class to program page
  
    Given Admin is in Manage class page
    When Admin clicks " Program" button in the navigation bar
    Then Admin should be able to land on program page
    
    @TC_class_94
  Scenario: Verify admin is able to navigate from manage class to batch page
  
    Given Admin is in Manage class page
    When Admin clicks "Batch" button in the navigation bar
    Then Admin should be able to land on batch page
    
    @TC_class_95
  Scenario: Verify admin is able to navigate from manage class to user page
  
    Given Admin is in Manage class page
    When Admin clicks "User" button in the navigation bar
    Then Admin should be able to land on user page
    
    @TC_class_96
  Scenario: Verify admin is able to navigate from manage class to assignment page
  
    Given Admin is in Manage class page
    When Admin clicks "Assignment" button in the navigation bar
    Then Admin should be able to land on assignment page
    
    @TC_class_97
  Scenario: Verify admin is able to navigate from manage class to attendance page
  
    Given Admin is in Manage class page
    When Admin clicks "Attendance" button in the navigation bar
    Then Admin should be able to land on attendance page
    
    @TC_class_98
  Scenario: Verify admin should be able to do logout function from manage class
  
    Given Admin is in Manage class page
    When Admin clicks "Logout" button in the navigation bar
    Then Admin should be able to land on login page
    
    
    
    
    
    
    
    
    
    
    