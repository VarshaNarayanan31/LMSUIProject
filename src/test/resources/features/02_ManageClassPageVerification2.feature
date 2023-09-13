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
  Scenario: Validate search box function when admin enters the batch id 
  
    Given Admin is on Manage Class Page
    When Admin enters batch id "batch id" into search box  
     |searchField|searchValue|
     |Batch ID|7576|
     |Batch ID|8365|
     |Batch ID|1255|     
    Then Displays entries with that batch Id
    
    
    
    @TC_class_19
  Scenario: Validate search box function when admin enters the batch id which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters batch id "batch id" which is not existing in the table into search box 
    |searchField|searchValue|
		|Batch ID|7576|		
    Then Displays empty details in the data table
    
    @TC_class_20
  Scenario: Validate search box function when admin enters the class no 
  
    Given Admin is on Manage Class Page
    When Admin enters class no "class no" into search box  
     |searchField|searchValue|
     |Class No|1|
     |Class No|2|
     |Class No|3|
    Then Displays entries with that class no
    
   
    
    @TC_class_21
  Scenario: Validate search box function when admin enters the class no which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters class no "class no" which is not existing in the table into search box  
    |searchField|searchValue|
		|Class No|123589|
    Then Displays empty details in the data table
    
    @TC_class_22
  Scenario: Validate search box function when admin enters the class topic 
  
    Given Admin is on Manage Class Page
    When Admin enters class topic "class topic" into search box  
     |searchField|searchValue|
     |Class Topic|Python|
     |Class Topic|Java Applets|
     |Class Topic|Java|
    Then Displays entries with that class topic
    
    
    @TC_class_23
  Scenario: Validate search box function when admin enters the class topic which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters class topic "class topic" which is not existing in the table into search box  
    |searchField|searchValue|
    |Class Topic|English|
    Then Displays empty details in the data table
    
    @TC_class_24
  Scenario: Validate search box function when admin enters the staff id 
  
    Given Admin is on Manage Class Page
    When Admin enters staff id "staff id" into search box
     |searchField|searchValue|
     |Staff Id|U01|
     |Staff Id|U02|
     |Staff Id|U03| 
    Then Displays entries with that staff id
    
   
    @TC_class_25
  Scenario: Validate search box function when admin enters the staff id which is not existing in the table
  
    Given Admin is on Manage Class Page
    When Admin enters staff id "staff id" which is not existing in the table into search box 
     |searchField|searchValue|
     |Staff Id|123456|
    Then Displays empty details in the data table
    
    @TC_class_26
  Scenario: Validate search box function when admin enters the class date 
  
    Given Admin is on Manage Class Page
    When Admin enters class date "class date" into search box
     |searchField|searchValue|
     |Class Date|12/22/22|
     |Class Date|3/5/23|
     |Class Date|3/9/23|
    Then Displays entries with that class date
    
    
    
    @TC_class_27
  Scenario: Validate search box function when admin enters invalid class date into search box  
  
    Given Admin is on Manage Class Page
    When Admin enters invalid class date "class date" into search box
     |searchField|searchValue|
     |Class Date|14/5/23|  
    Then Displays empty details in the data table
    
    
    
    
    
    
    
    
    
    
    
    
    