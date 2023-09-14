Feature: Navigation function validation from manage attendance page to other pages

 Background: Logged on the LMS portal as Admin
  	Given Admin is on dashboard page after Login
		When Admin clicks Attendance on the navigation bar


  Scenario: Verify admin is able to navigate from manage attendance to student page
  When Admin clicks "Student" button in the navigation bar in manage attendance page
  Then Admin should able to land on student page from manage attendance


  Scenario: Verify admin is able to navigate from manage attendance to program page
  When Admin clicks "Program" button in the navigation bar in manage attendance page
  Then Admin should able to land on program page from manage attendance


  Scenario: Verify admin is able to navigate from manage attendance to batch page
  When Admin clicks "Batch" button in the navigation bar in manage attendance page
  Then Admin should able to land on batch page from manage attendance


  Scenario: Verify admin is able to navigate from manage attendance to user page
  When Admin clicks "User" button in the navigation bar in manage attendance page
  Then Admin should able to land on user page from manage attendance


  Scenario: Verify admin is able to navigate from manage attendance to attendance page
  When Admin clicks "Class" button in the navigation bar in manage attendance page
  Then Admin should able to land on class page from manage attendance

  Scenario: Verify admin is able to navigate from manage attendance to attendance page
  When Admin clicks "Assignment" button in the navigation bar in manage attendance page
  Then Admin should able to land on Attendance page from manage attendance


  Scenario: Verify admin should able to do logout function from manage attendance
  When Admin clicks "Logout" button in the navigation bar in manage attendance page
  Then Admin should able to land on login page from manage attendance

