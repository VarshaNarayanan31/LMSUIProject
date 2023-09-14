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
Feature: Add New Class 

Background: Admin click +Add New Class button after reaching to Manage class page 

  @TC_class_37
  Scenario: Validate all batch id is reflecting in the dropdown
  
    Given Admin is in  class detail popup window
    When Admin clicks  Batch ID dropdown
    Then Batch id in the drop down should match with Batch id in the manage batch page table
    
    @TC_class_38
  Scenario Outline: Validate admin able to add new class with valid data in mandatory fields
  
    Given Admin is in  class detail popup window
    When Admin enters all mandatory field values with valid data from "<Sheetname>" and <RowNumber> and clicks save button 
    Then Admin should see new class details is added in the data table
    
    Examples:
   |Sheetname      |RowNumber|
   |data_class     |1        |
    
    
    @TC_class_39
  Scenario Outline: Validate admin able to add new class with invalid data in mandatory fields
  
    Given Admin is in  class detail popup window
    When Admin enters all mandatory field values with invalid data from "<Sheetname>" and <RowNumber> and clicks save button 
    Then Error message should appear in alert
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |2        |
    
    @TC_class_40
  Scenario Outline: Validate admin able to add new class with valid data  in all fields
  
    Given Admin is in  class detail popup window
    When Admin enters values in all fields with valid data from "<Sheetname>" and <RowNumber> and clicks save button 
    Then Admin should see new class details is added in the data table
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |3        |
    
    @TC_class_41
  Scenario Outline: Validate admin able to add new class with invalid data  in optional fields
  
    Given Admin is in  class detail popup window
    When Admin enters with invalid data from "<Sheetname>" and <RowNumber> in optional fields and clicks save button 
    Then Error message should appear in alert
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |4        |
    
    @TC_class_42
  Scenario Outline: Validate admin able to add new class missing Batch Id
  
    Given Admin is in  class detail popup window
    When Admin enters  data from "<Sheetname>" and <RowNumber> missing value in Batch ID and clicks save button 
    Then Batch Id is missing alert message should appear
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |5        |
    
    @TC_class_43
  Scenario Outline: Validate admin able to add new class missing No of Class
  
    Given Admin is in  class detail popup window
    When Admin enters data from "<Sheetname>" and <RowNumber> missing value in No of class and clicks save button 
    Then No of classes is missing alert message should appear
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |6        |
    
    @TC_class_44
  Scenario Outline: Validate admin able to add new class missing Class Date
  
    Given Admin is in  class detail popup window
    When Admin enters data from "<Sheetname>" and <RowNumber> missing value in  class date and clicks save button 
    Then Class date is missing alert message should appear
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |7        |
    
    @TC_class_45
  Scenario Outline: Validate admin able to add new class missing Staff id
  
    Given Admin is in  class detail popup window
    When Admin enters data from "<Sheetname>" and <RowNumber> missing value in staff id and clicks save button 
    Then staff id is missing alert message should appear
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |8        |
    
     @TC_class_46
  Scenario Outline: Validate  admin able to add new class passing past date 
  
    Given Admin is in  class detail popup window
    When Admin enters passed date from "<Sheetname>" and <RowNumber> in the class date field and clicks save button 
    Then class cannot be  created for the passed date alert message should appear
    
     Examples:
   |Sheetname      |RowNumber|
   |data_class     |9        |
    
    @TC_class_47
  Scenario: Validate date picker
  
    Given Admin is in  class detail popup window
    When Admin clicks date from date picker
    Then selected date should be there in class date text box
    
    @TC_class_48
  Scenario: validate date picker should be correct format
  
    Given Admin is in  class detail popup window
    When Admin clicks date from date picker
    Then selected date should be in  mm/dd/yyyy format
    
    @TC_class_49
  Scenario: Validate right arrow in date picker to navigate to next month
  
    Given Admin is in  class detail popup window
    When Admin clicks right arrow in the date picker near month
    Then Next month calender should be visible
    
    @TC_class_50
  Scenario: Validate left arrow in date picker to navigate to previous month
  
    Given Admin is in  class detail popup window
    When Admin clicks left arrow in the date picker near month
    Then previous month calender should be visible
    
    @TC_class_51
  Scenario: Validate current date is highlighted in the date picker
  
    Given Admin is in  class detail popup window
    When Admin clicks date picker button
    Then Admin should see current date is highlighted in the date picker
    
    @TC_class_52
  Scenario: Validate selected date is highlighted in the date picker
  
    Given Admin is in  class detail popup window
    When Admin clicks date picker button and selects future date
    Then Admin should see selected date is highlighted in the date picker
    
    @TC_class_53
  Scenario: Validate cancel button function in class details popup window
  
    Given Admin is in  class detail popup window
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on Manage Class page
    
    @TC_class_54
  Scenario: Validate cancel button function in class details popup window with values in field
  
    Given Admin is in  class detail popup window
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on Manage Class Page and validate new class is not created in the data table
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    