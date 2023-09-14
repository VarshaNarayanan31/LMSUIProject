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
Feature: Manage Class Page Verification_1

Background: Logged on the LMS portal as Admin

@TC_class_01
  
  Scenario: Verify landing in class page

    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see URL with "Manage Class"
    

  @TC_class_02
  Scenario: Capture the response time to navigate to manage class page
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Get the response time for navigation from dashboard page to manage class page
    
    @TC_class_03
  Scenario: Verify Manage Class Page Header
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see header with "Manage Class"
    
    @TC_class_04
  Scenario: Validate text in manage class page
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar and get all text from the portal page
    Then Admin should see correct spelling for the all the fields

    @TC_class_05
  Scenario: Verify delete icon below the header
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see disabled delete icon below the "Manage Class"
    
    @TC_class_06
  Scenario: Verify search bar on the class page
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see search bar on the class page
    
    @TC_class_07
  Scenario: Verify add new class button on class page
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see +Add New Class button on the class page
    
    @TC_class_08
  Scenario: Verify data table on the class page
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see data table on the Manage Class Page With following column headers. (Check box symbol,Batch Id, Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete)
    
    @TC_class_09
  Scenario: Verify Edit icon in the data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Edit Icon in each row of data table only  when entries are available
    
    @TC_class_10
  Scenario: Verify Edit icon when no data in the table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Edit Icon will not be present in data table
    
    @TC_class_11
  Scenario: Verify delete icon in the data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Delete Icon in each row of data table only  when entries are available
    
    
    @TC_class_12
  Scenario: Verify delete icon when no data in the table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin cant see delete  Icon in data table
    
    @TC_class_13
  Scenario: Verify sort icon in the data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see sort icon near the column headers except for Edit and Delete
    
    
    @TC_class_14
  Scenario: Verify check box in the data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see check box in the all rows of data table 
    
    @TC_class_15
  Scenario: Validate the number of entries displaying
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table. 
    
    @TC_class_16
  Scenario: Verify Pagination control below the data table
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see the pagination controls under the data table
    
    @TC_class_17
  Scenario: Validate footer  text
  
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see the text with total number classes in the data table.
    
    
    
    
    
    
    
    
    
    
    