@loginpage
Feature: Login Page Verification

  Background: Admin gives the correct LMS portal URL

    Given Admin is in home page
  Scenario: Verify the login page

    When Admin clicks Login button

    Then Admin should land on the login page
    
  Scenario: Verify for broken link

    When Admin clicks Login button
    Then HTTP response >= 400. Then the link is broken

  Scenario: Verify tht header of the login page
    When Admin clicks Login button

    Then Admin should see "Please login to LMS application" in the header

  Scenario: Verify the text spelling in login page
    When Admin clicks Login button

    Then Admin should see correct spellings in all fields


  Scenario: Verify text field is present
    When Admin clicks Login button

    Then Admin should see two text field


  Scenario: Verify text on the first text field
    When Admin clicks Login button

    Then Admin should "user" in the first text field

  Scenario: Verify text on the second text field
    When Admin clicks Login button

    Then Admin should "password" in the second text field


  Scenario: Verify the alignment input field for the login
    When Admin clicks Login button

    Then Admin should see input field on the centre of the page

  Scenario:Verify the alignment of the login button
    When Admin clicks Login button

    Then Admin should see login button on the centre of the page

  Scenario:Verify forgot username or password link
    When Admin clicks Login button

    Then Admin should see forgot username or password link

  Scenario:Verify for the Reset password link
    When Admin clicks Login button

    Then Admin should see reset password link

  Scenario:Verify input descriptive test in user field
    When Admin clicks Login button

    Then Admin should see user in gray color


  Scenario:Verify input descriptive test in password field
    When Admin clicks Login button

    Then Admin should see password in gray color
