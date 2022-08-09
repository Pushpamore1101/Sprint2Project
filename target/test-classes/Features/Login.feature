Feature: To verify the login functionality of flipkart

  Scenario: user enters valid credentials to login
    Given user is on the flipkart page
    When user logins with valid username and password
    Then user must be directed to homepage

  