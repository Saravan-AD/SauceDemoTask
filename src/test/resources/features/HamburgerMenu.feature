Feature: Hamburger menu verifications

  Background:
    Given user open website
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page

  Scenario: Verify hamburger menu is working
    And user click on hamburger menu
    Then verify the hamburger menu is opened

  Scenario: Verify app reset option
    When user clicks add to cart of product 1
    And user click on hamburger menu
    And user click on reset app button
    Then verify cart icon shows no quantity
    And verify add to cart button of product 1 is displayed