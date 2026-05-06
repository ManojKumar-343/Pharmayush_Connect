
Feature: Login_Cucumber

  Scenario: Sucessful login using valid credentials
    Given user is in main page
    And User is in login page
    When User enters "<Username>" and "<Password>"
    And User is in related page
    Then Driver is closed


    Examples: 
      |     Username     |    Password   | Status |
      | manoj@gmail.com  |   manoj@1234  |  Fail  |
      | manoj1@gmail.com |   manoj@123   |  Fail  |
      | manoj2@gmail.com |   manoj@1234  |  Fail  |
      | manoj@gmail.com  |   manoj@123   | Sucess |
