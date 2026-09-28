Feature: Checkout functionality
 @regression
  Scenario: Complete checkout information

    When User enters "standard_user" and "secret_sauce"
    And User clicks on login button
    And User adds backpack to cart
    And User opens the cart
    And User clicks on checkout
    And User enters checkout information
    Then User should be on checkout overview page