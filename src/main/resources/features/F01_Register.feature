@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter first name "Abdelrahman"
    And user enter last name "Mahmoud"
    And user enter date of birthday
    And user enter email "test@example.com" field
    And user fills Password fields
    And user fills confirm Password fields
    And user clicks on register button
    Then user register successfully