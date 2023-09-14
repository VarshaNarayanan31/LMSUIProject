@forget/password2

Feature: Reset password Verification for home page still not login

  Background: Admin Clicks forgot username and password after reaching login page

    Given Admin is in forgot username and password page

 Scenario: Validate email sent for forgot password

   When Admin enters valid email id and clicks send link button

   Then Admin should receive link in mail for reset username / password


  Scenario: Validate email sent for forgot password with invalid email if

    When Admin enters invalid email id and clicks send link button

    Then Admin should not receive link in mail for reset username / password
