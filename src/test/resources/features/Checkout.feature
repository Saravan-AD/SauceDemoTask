Feature: Verify checkout functionalities

  Background:
    Given user open website

  Scenario: Submit valid checkout info
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    And user clicks cart icon
    And user clicks checkout button
    Then verify if your information page is displayed
    When user enter first name as "first.name"
    And user enters last name as "last.name"
    And user enter zip code as "zip.code"
    And user clicks continue button
    Then verify review page is displayed

  Scenario: Submit checkout info without providing zip code
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    And user clicks cart icon
    And user clicks checkout button
    Then verify if your information page is displayed
    When user enter first name as "first.name"
    And user enters last name as "last.name"
    And user clicks continue button
    Then verify postal code error message is displayed

  Scenario: Verify user can place an order and completely checkout
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    And user clicks cart icon
    And user clicks checkout button
    Then verify if your information page is displayed
    When user enter first name as "first.name"
    And user enters last name as "last.name"
    And user enter zip code as "zip.code"
    And user clicks continue button
    And user clicks finish button
    Then verify the confirmation message is displayed

  Scenario: Verify user cannot place an order with empty cart
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks cart icon
    And user clicks checkout button
    Then verify that it is not redirected to your information page
