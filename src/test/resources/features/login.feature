Feature: Login Feature

  Scenario: Successful Login
    Given User is on login page
    When User enters valid credentials
    Then User is navigated to the home page
