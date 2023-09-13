Feature: Pagination in manage Assignment

Background: Logged on the LMS portal as Admin

  @AssignPagination_1
  
  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on dashboard page after Login
    When Admin clicks  button on the navigation bar
    Then Data table should display 1 page  when entries available
 
  @AssignPagination_2
  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Right arrow should be enabled in page one  when entries are more than 5 available
    
  @AssignPagination_3
  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Left arrow should be disabled in page one
   
 @AssignPagination_4
  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Right arrow should be enabled in page two when entries are more than 10 available
     
 @AssignPagination_5
  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Left arrow should be enabled in page two
  
 @AssignPagination_6 
  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Left arrow should be enabled in page two
    
  @AssignPagination_7
  Scenario: Verify pagination controls enabled
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then When entries are more than 5 in data table pagination controls enabled
   
  @AssignPagintaion_8
  Scenario: Verify pagination controls disabled
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then When entries are less than 5 in data table pagination controls disabled
    