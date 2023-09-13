   Feature: Pagination in manage assignment2
   
Background: Admin click +Add New assignment button after reaching to Manage assignment page
 Given: Admin click +Add new assignmnet button
 
 @Assignpagination_9
  Scenario: Verify next page is enabled in assignment page
    Given Admin is in assignment details popup window
    When Admin creates 6 new assignment
    Then  When total assignment entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)
    
@AssignPagination_10
  Scenario: Verify next page is disabled in assignment page
    Given Admin is in assignment details popup window
    When Admin creates less than or equal to 5 new assignment
    Then When total assignment entries  5 or below next page is disabled