Feature: User performs login operations

  Background:
    Given user open website

  Scenario: User login with valid credentials
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page

  Scenario: User login with invalid credentials
    When user enters username "login.name" and password "invalid.login.password"
    And clicks login button
    Then verify error message is displayed

  Scenario: Verify user can successfully logout
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user click on hamburger menu
    And clicks Logout button
    Then verify user is on login page