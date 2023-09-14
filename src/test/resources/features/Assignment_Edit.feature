Feature: Edit assignment validation

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

@AssignEdit_1
Scenario: Verify Edit assignment popup window

Given Admin is in manage assignment page	
When Admin clicks Edit button in data table 	
Then Edit popup window appears with heading Assignment Details

@AssignEdit_2
Scenario: Verify values in popup window

Given Admin is in manage assignment page	
When Admin clicks Edit button from one of the row in data table 
Then Edit popup window appears with same row values in the all fields

@AssignEdit_3
Scenario: Validate cancel button function in assignment details popup window

Given Admin is in  Edit assignment detail popup window	
When Admin clicks Cancel button without entering values in the fields	
Then Admin should land on manage assignment page

@AssignEdit_4
Scenario: Validate cancel button function in assignment details popup window with values in field

Given Admin is in  Edit assignment detail popup window	
When Admin clicks Cancel button entering values in the fields	
Then Admin should land on manage assignment Page and validate new assignment is not created in the data table