Feature: Testing Contact List App

  Background: Navigating to Signup page
    Given User is on the Loginpage
    When User clicks on the signup button

  Scenario: Scenario1
    Then User enters fname and lname
    And User clicks on submitButton

  Scenario: Scenario2
    Then User enters email and password
    And User clicks on cancel button
