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
Feature: Pagination in manage class_1

Background: Logged on the LMS portal as Admin

  @TC_class_82
  Scenario: Verify sheet one is displayed on default in data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Data table should display 1 page  when entries available
    
    @TC_class_83
  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Right arrow should be enabled in page one  when entries are more than 5 available
    
    @TC_class_84
  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Left arrow should be disabled in page one  
    
    @TC_class_85
  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Right arrow should be enabled in page two when entries are more than 10 available
    
     @TC_class_86
  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Left arrow should be enabled in page two 
    
    @TC_class_87
  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Left arrow should be enabled in page two 
    
    @TC_class_88
  Scenario: Verify pagination controls enabled
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then When entries are more than 5 in data table pagination controls enabled
    
    @TC_class_89
  Scenario: Verify pagination controls disabled
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then When entries are less than 5 in data table pagination controls disabled
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    