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
Feature: Manage Class Page Verification_2

Background: Admin logged into LMS portal and clicks class button on the navigation bar 

@TC_class_18
  Scenario Outline: Validate search box function when admin enters the batch id "<option>"
  
    Given Admin is on Manage Class Page
    When Admin enters batch id "<option>" into search box  
    Then Displays entries with that batch Id
    
    Examples: 
      | option |
      | 7576   |
      | 8365   |
      | 1255   |
     
    
    @TC_class_19
  Scenario: Validate search box function when admin enters the batch id which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters "batch id" which is not existing in the table into search box 
    | batch id|
		| 123589  | 
    Then Displays empty details in the data table
    
    @TC_class_20
  Scenario Outline: Validate search box function when admin enters the class no "<option>"
  
    Given Admin is on Manage Class Page
    When Admin enters class no "<option>" into search box   
    Then Displays entries with that class no
    
    Examples: 
      | option |
      | 1      |
      | 2      |
      | 3      |
    
    @TC_class_21
  Scenario: Validate search box function when admin enters the class no which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters "class no" which is not existing in the table into search box  
    | class no|
		| 123589  | 
    Then Displays empty details in the data table
    
    @TC_class_22
  Scenario Outline: Validate search box function when admin enters the class topic "<option>"
  
    Given Admin is on Manage Class Page
    When Admin enters class topic "<option>" into search box   
    Then Displays entries with that class topic
    
    Examples: 
      | option      |
      | Python      |
      | Java Applets|
      | Java 22     |
    
    @TC_class_23
  Scenario: Validate search box function when admin enters the class topic which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters "class topic" which is not existing in the table into search box  
    | class topic|
		| English    | 
    Then Displays empty details in the data table
    
    @TC_class_24
  Scenario Outline: Validate search box function when admin enters the staff id "<option>"
  
    Given Admin is on Manage Class Page
    When Admin enters staff id "<option>" into search box   
    Then Displays entries with that staff id
    
    Examples: 
      | option   |
      | U01      |
      | U02      |
      | U03      |
    
    @TC_class_25
  Scenario: Validate search box function when admin enters the staff id which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters "staff id" which is not existing in the table into search box 
    | staff id|
		| 12356   |  
    Then Displays empty details in the data table
    
    @TC_class_26
  Scenario Outline: Validate search box function when admin enters the class date "<option>"
  
    Given Admin is on Manage Class Page
    When Admin enters class date "<option>" into search box   
    Then Displays entries with that class date
    
    Examples: 
      | option   |
      | 12/22/22 |
      | 3/5/23   |
      | 3/9/23   |
    
    @TC_class_27
  Scenario: Validate search box function when admin enters invalid class date into search box  
  
    Given Admin is on Manage Class Page
    When Admin enters invalid "class date" into search box 
     | class date|
		 | 14/5/23   |  
    Then Displays empty details in the data table
    
    
    
    
    
    
    
    
    
    
    
    
    