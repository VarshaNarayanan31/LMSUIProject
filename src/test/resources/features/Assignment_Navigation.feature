Feature: Navigation function validation from manage assignment page to other pages  

Background: Admin is Manage assignment page after logged in

Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Student" button in the navigation bar
Then Admin should able to land on student page

Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " program" button in the navigation bar
Then Admin should able to land on program page

Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Batch" button in the navigation bar
Then Admin should able to land on batch page

Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " user" button in the navigation bar
Then Admin should able to land on user page

Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Class" button in the navigation bar
Then Admin should able to land on class page

Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks " Attendance" button in the navigation bar
Then Admin should able to land on attendance page

Scenario: Verify admin is able to navigate from manage assignment to student page
Given Admin is on the Manage Assignment page
When Admin clicks "Logout" button in the navigation bar
Then Admin should able to land on Login page
   