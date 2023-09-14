
Feature: Home Page Verification

  Background:
  Given Admin launch the browser
@tag1
  Scenario: Verify admin is able to land on home page
    When Admin gives the correct LMS portal URL
    Then Admin lands on the home page
@tag2
  Scenario: Verify admin is able to land on home page with invalid URL
    When Admin gives the invalid LMS portal URL
    Then Admin receives 404 page not found error
@tag3
  Scenario: Verify for broken link
    When Admin gives the correct LMS portal URL
    Then HTTP response >= 400. Then the link is broken

@tag4
  Scenario Outline: Verify the text spelling in the page
    When Admin gives the correct LMS portal URL
    Then Admin should see the <fields> with text <text>

    Examples:
      | fields | text    |
      | L     | LEARNING   |
      | M     | MANAGEMENT |
      | S     | SYSTEM     |
@tag5
  Scenario: Verify the logo of the LMS
    When Admin gives the correct LMS portal URL
    Then Admin see correct logo of the LMS
@tag6
  Scenario: Verify the alignment of LMS logo
    When Admin gives the correct LMS portal URL
    Then Admin should see logo is properly aligned
@tag7
  Scenario: Verify the presence of login button
    When Admin gives the correct LMS portal URL
    Then Admin should see login button
@tag8
  Scenario: Verify login button is clickable
    When Admin gives the correct LMS portal URL
    Then Admin should able to click the Login button

