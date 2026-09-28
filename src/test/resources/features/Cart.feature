Feature: Cart functionality

  @Cart @regression
  Scenario: Add product to cart

    When User enters "standard_user" and "secret_sauce"
    And User clicks on login button
    When User adds backpack to cart
    And User opens the cart
    Then Backpack should be displayed in the cart