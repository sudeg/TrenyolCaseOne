Feature: brandCheckFeature
  Third mission is verifying every image belonging to the product

  Scenario: Check image load on specific product
    Given Go to the website
    And Select a random category
    And Select a brand
    Then Check brand images are loaded