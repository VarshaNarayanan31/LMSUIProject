
Feature: Delete attendance validation - Single

  Background: Logged on the LMS portal as Admin
    Given Admin is on dashboard page after Login
    When Admin clicks Attendance on the navigation bar


  Scenario: Verify Delete attendance alert
    When Admin clicks delete button in data table row level for Attendance module
    Then Admin should see Delete alert for Attendance module

  Scenario: Verify  accept enabled in alert
    When Admin clicks delete button in data table row level for Attendance module
    Then Alert should have yes button to accept for Attendance module

  Scenario: Verify reject enabled in alert
    When Admin clicks delete button in data table row level for Attendance module
    Then Alert should have no button to reject for Attendance module

  Scenario: Validate accept in alert for single
    When Admin clicks delete button in data table row level for Attendance module
    Then Admin clicks yes button for Attendance module
    Then Success message and selected attendance details are deleted from the data table

  Scenario: Validate reject in alert for single
    When Admin clicks delete button in data table row level for Attendance module
    When Admin clicks no button for Attendance module
    Then Redirected attendance page and selected attendance details are not deleted from the data table

