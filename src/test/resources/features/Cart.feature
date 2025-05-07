Feature: Cart feature

  Background:
    Given user open website

  Scenario: Verify user can add a product to cart
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    Then verify cart icon shows quantity 1

  Scenario: Verify user can add multiple product to cart
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    And user clicks add to cart of product 2
    Then verify cart icon shows quantity 2

  Scenario: Removing product from cart from product page
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    Then verify cart icon shows quantity 1
    When user clicks remove button of product 1
    Then verify cart icon shows no quantity
    And verify add to cart button of product 1 is displayed

  Scenario: Removing product from cart from cart page
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    And user clicks cart icon
    Then verify cart page is displayed
    And verify if product 1 is added to cart
    When user clicks remove button of product 1 in cart page
    Then verify cart page does not have product 1

  Scenario: Verify continue shopping function
    When user enters username "login.name" and password "login.password"
    And clicks login button
    Then verify user is on inventory page
    When user clicks add to cart of product 1
    And user clicks cart icon
    Then verify cart page is displayed
    When user clicks continue shopping button
    Then verify user is on inventory page