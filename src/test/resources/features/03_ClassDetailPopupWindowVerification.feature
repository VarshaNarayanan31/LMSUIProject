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
Feature: Class detail Popup window verification

Background: Admin logged into LMS portal and clicks class button on the navigation bar 

  @TC_class_28
  Scenario: Verify class details popup window
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see a popup  with  heading "class details"
    
    @TC_class_29
  Scenario: Verify input fields in class details popup window
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see input fields Text (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    
    
     @TC_class_30
  Scenario: Verify text box present in class details popup window
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then 6 textbox should be  present in Class details popup window
    
    @TC_class_31
  Scenario: Verify drop down in Batch Id  in class details popup window
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see  dropdown option for Batch ID
    
    
    @TC_class_32
  Scenario: Verify drop down in Staff Id  in class details popup window
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see  dropdown option for Staff Id
    
    @TC_class_33
  Scenario: Verify calendar icon in class date  in class details popup window
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see  calendar icon for class date
    
    @TC_class_34
  Scenario: Verify save button is present
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see  save button in the class detail popup window
    
    @TC_class_35
  Scenario: Verify cancel button is present
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see cancel button in the class detail popup window
    
    @TC_class_36
  Scenario: Verify close button in class details popup window
  
    Given Admin is on Manage Class Page
    When Admin click +Add New Class button
    Then Admin should see close button on the class details popup window
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    