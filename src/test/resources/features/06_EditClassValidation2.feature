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
Feature: Edit class Validation_2

Background: Admin clicks Edit button in manage class after reaching manage class page

  @TC_class_57
  Scenario: Validate admin able to update class with valid data in mandatory fields
  
    Given Admin is in  Edit class detail popup window
    When Admin enters all mandatory field values with valid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then Admin should see particular class details is updated in the data table
    
    @TC_class_58
  Scenario: Validate admin able to  update class with invalid data in mandatory fields
  
    Given Admin is in  Edit class detail popup window
    When Admin enters all mandatory field values with invalid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, )
    Then Error message should appear in alert
    
    @TC_class_59
  Scenario: Validate admin able to  update class with valid data  in all fields
  
    Given Admin is in  Edit class detail popup window
    When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    Then Admin should see particular class details is updated in the data table
    
     @TC_class_60
  Scenario: Validate admin able to  update  class with invalid data  in all fields
  
    Given Admin is in  Edit class detail popup window
    When Admin enters values in all fields with invalid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    Then Error message should appear in alert
    
    @TC_class_61
  Scenario: Validate admin able to update class missing Batch Id
  
    Given Admin is in  Edit class detail popup window
    When Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id)
    Then Batch Id is missing alert message should appear
    
    @TC_class_62
  Scenario: Validate admin able to update class missing No of Class
  
    Given Admin is in  Edit class detail popup window
    When Admin enters  data missing value in No of Class and clicks save button (Batch ID, Class Date, Staff Id)
    Then No of Class is missing alert message should appear
    
    @TC_class_63
  Scenario: Validate admin able to update class missing Class Date
  
    Given Admin is in  Edit class detail popup window
    When Admin enters  data missing value in Class Date and clicks save button (Batch ID, No of class, Staff Id)
    Then Class Date is missing alert message should appear
    
    @TC_class_64
  Scenario: Validate admin able to update class missing staff id
  
    Given Admin is in  Edit class detail popup window
    When Admin enters  data missing value in staff id and clicks save button (Batch ID, No of class, Class Date)
    Then Staff id is missing alert message should appear
    
    @TC_class_65
  Scenario: Validate  admin able to update class passing past date 
  
    Given Admin is in  Edit class detail popup window
    When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
    Then class cannot be updated for the passed date alert message should appear
    
    @TC_class_66
  Scenario: Validate cancel button function in Edit class details popup window
  
    Given Admin is in  Edit class detail popup window
    When Admin clicks Cancel button without entering values in the fields
    Then Admin should land on Manage Class page
    
    @TC_class_67
  Scenario: Validate cancel button function in Edit class details popup window with values in field
  
    Given Admin is in  Edit class detail popup window
    When Admin clicks Cancel button entering values in the fields
    Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    