Feature: Batch Page Validation

  BackGround: Logged on the LMS portal
  @manageBatch1
  Scenario: Validate landing in Batch page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin should see the "Manage Batch" in the URL
   @manageBatch2
  Scenario: Validate header in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin should see the "Manage Batch" in the header
   @manageBatch3
  Scenario: Validate pagination in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin should see the pagination controls under the data table
 @manageBatch4
  Scenario: Validate data table headers in the Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete
 @manageBatch5
  Scenario: Validate Delete button in Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin should be able to see the "Delete" icon button that is disabled
 @manageBatch6
  Scenario: Validate "+ A New batch" in Batch Page
  Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Admin should be able to see the "+ A New batch" button
 @manageBatch7
  Scenario: Validate data rows
 Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Each row in the data table should have a checkbox
 @manageBatch8
  Scenario: Validate data rows
 Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Each row in the data table should have a edit icon that is enabled
 @manageBatch9
  Scenario: Validate data rows
 Given Admin is on dashboard page after Login
  When Admin clicks "Batch" from navigation bar
  Then Each row in the data table should have a delete icon that is enabled
 @manageBatch10
  Scenario: Validate pop up for adding batch
 Given Admin is on dashboard page after Login
  When AAdmin clicks "+ A New Batch" button
  Then A new pop up with Batch details appears
