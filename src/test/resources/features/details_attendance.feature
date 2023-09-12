
Feature: Attendance details popup window  verification

  Background: Admin is Manage attendance page after login

    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button

  Scenario: Verify all label text
    Then Admin should see correct spellings in the label

  Scenario: Verify dropdown box is present
    Then Four dropdown should be present

  Scenario: Verify close button in attendance details popup window
    Then Admin should see  close button on the attendance details popup window

  Scenario: Verify the alignment of the close button
    Then Close button should on the top right corner

  Scenario: Verify the text on first dropdown select a program name
    Then First dropdown box "select a program name" text  should be present

  Scenario: Verify the text on second dropdown select class  name
    Then Second dropdown box "select class name" text  should be present

  Scenario: Verify the text on third dropdown select students
    Then Third dropdown box "select students" text  should be present

  Scenario: Verify the text on fourth dropdown select attendance
    Then Fourth dropdown box "select attendance" text  should be present

  Scenario: Verify all the text inside the dropdown box is gray color
    Then Admin  should text in gray color

  Scenario: Verify save button is present
    Then Admin should see  save button in the class detail popup window

  Scenario: Verify cancel button is present
    Then Admin should see  cancel button in the class detail popup window

  Scenario: Verify order of the label in attendance details page
    Then Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.

