@reset1
Feature: Reset password Verification

  Background: Admin in login page after clicking login button in home page
    Given Admin is in home page

  Scenario: verify text box is in enabled in new password field

    When Admin clicks Login button

    Then Admin should land on the login page