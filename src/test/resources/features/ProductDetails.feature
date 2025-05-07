Feature: Verify product details page functions

  Background:
    Given user open website

  Scenario: Submit valid checkout info
    When user enters username "login.name" and password "login.password"
    And clicks login button
    When user clicks on the product "product.name"
    Then verify if the "product.name" details page is displayed