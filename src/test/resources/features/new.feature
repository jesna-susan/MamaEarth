Feature: Verify Order Placing Functionality

  Scenario: Verify user can place order and checkout
    Given user opens the website
    Then verify user is on home page
    When user search for product "desired.product"
    Then verify user is on product listing page
    When user select first product with keyword "keyword"