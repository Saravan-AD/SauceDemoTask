Feature: Verify various sort functionalities

  Background:
    Given user open website
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page

  Scenario: Sort products by price(low to high)
    When user select price(low to high) sort
    Then verify the products are sorted in ascending order by price

  Scenario: Sort products by name(Z to A)
    When user select name(Z to A) sort
    Then verify the products are sorted in descending order by name
