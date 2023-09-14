Feature: Attendance details popup window verification pagination part

  Background: Logged on the LMS portal as Admin

    Given Admin is on dashboard page after Login

    When Admin clicks Attendance on the navigation bar


  Scenario: Verify sheet one is displayed on default in data table
    Then Data table should display 1 page  when entries available for Attendance

  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
    Then Right arrow should be enabled in page one  when entries are more than 5 available for Attendance

  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
    Then Left arrow should be disabled in page one  when entries are more than 5 available for Attendance

  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
    Then Right arrow should be enabled in page two when entries are more than 10 available for Attendance

  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
    Then Left arrow should be enabled in page two for Attendance

  Scenario: Verify pagination controls enabled
    Then When entries are more than 5 in data table pagination controls enabled for Attendance

  Scenario: Verify pagination controls disabled
    Then When entries are less than 5 in data table pagination controls disabled for Attendance

