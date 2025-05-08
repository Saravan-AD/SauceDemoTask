Feature: Verify product details page functions

  Background:
    Given user open website
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page

  Scenario: Navigate to Product details page
    When user clicks on the product "product.name"
    Then verify if the "product.name" details page is displayed

  Scenario: Navigate to inventory page from product details page
    When user clicks on the product "product.name"
    And clicks back to products button
    Then verify user is on inventory page