Feature: Navigation function validation from manage assignment page to other pages  

Background: Admin is Manage assignment page after logged in
Given Admin is on the Manage Assignment page

@AssignNavigation_1
Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Student" button in the navigation bar
Then Admin should able to land on student page

@AssignNavigation_2
Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " program" button in the navigation bar
Then Admin should able to land on program page

@AssignNavigation_3
Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Batch" button in the navigation bar
Then Admin should able to land on batch page

@AssignNavigation_4
Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " user" button in the navigation bar
Then Admin should able to land on user page

@AssignNavigation_5
Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Class" button in the navigation bar
Then Admin should able to land on class page

@AssignNavigation_6
Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Attendance" button in the navigation bar
Then Admin should able to land on attendance page

@AssignNavigation_7
Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks "Logout" button in the navigation bar
Then Admin should able to land on Login page
   