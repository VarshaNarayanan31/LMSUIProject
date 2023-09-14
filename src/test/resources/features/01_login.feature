@loginpage
Feature: Login Page Verification

  Background: Admin gives the correct LMS portal URL
    Given Admin is in home page
@tag9
  Scenario: Verify the login page

    When Admin clicks Login button

    Then Admin should land on the login page
@tag10
  Scenario : Verify for broken link

    When Admin clicks Login button
    Then HTTP response >= 400. Then the link is broken

@tag11
  Scenario: Verify tht header of the login page
    When Admin clicks Login button

    Then Admin should see "Please login to LMS application" in the header

  @tag12
  Scenario: Verify the text spelling in login page
    When Admin clicks Login button

    Then Admin should see correct spellings in all fields
@tag13

  Scenario: Verify text field is present
    When Admin clicks Login button

    Then Admin should see two text field
@tag14

  Scenario: Verify text on the first text field
    When Admin clicks Login button

    Then Admin should "user" in the first text field
@tag15
  Scenario: Verify asterik next to user text
    When Admin clicks Login button

    Then Admin should see * symbol next to user text
@tag16
  Scenario: Verify text on the second text field
    When Admin clicks Login button

    Then Admin should "password" in the second text field
@tag17
  Scenario: Verify asterik next to password text
    When Admin clicks Login button

    Then Admin should see * symbol next to password text
@tag10
  Scenario: Verify the alignment input field for the login
    When Admin clicks Login button

    Then Admin should see input field on the centre of the page
@tag18
  Scenario:Verify the alignment of the login button
    When Admin clicks Login button

    Then Admin should see login button on the centre of the page
@tag19
  Scenario:Verify forgot username or password link
    When Admin clicks Login button

    Then Admin should see forgot username or password link
@tag20
  Scenario:Verify for the Reset password link
    When Admin clicks Login button

    Then Admin should see reset password link
@tag21
  Scenario:Verify input descriptive test in user field
    When Admin clicks Login button

    Then Admin should see user in gray color

@tag22
  Scenario:Verify input descriptive test in password field
    When Admin clicks Login button

    Then Admin should see password in gray color
