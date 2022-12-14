@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
  Given the user open login page
    And user enter valid email
    And user enter valid password
    And user click on login button
    Then user login successfully