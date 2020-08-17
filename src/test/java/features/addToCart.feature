Feature: addToCartFeature
  Final mission is adding product to cart

  Scenario: add a product to cart
    Given User already logged in
    And User goes to brand page
    And Selects a product
    And Goes to product page and adds product to cart
    Then goes to cart page