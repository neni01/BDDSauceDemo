@Order
Feature: Order product
  User want to order product to website sauce demo

  Scenario: user login with valid credential and do select on inventory page
    Given User already on login page
    When User input "standard_user" as userName and "secret_sauce" as password
    Then User already on inventory page
    When User sort product by "Price (low to high)"
    And User click product "Sauce Labs Onesie"
    And User click product "Sauce Labs Bike Light"
    And User click icon cart
    Then User already on your cart page
    When User click button remove product
    And User click button checkout product
    Then User already on your information checkout page
    And User input "Neni" as first name and "Nurhaeni" as last name and "45521" as postal code
    Then User already on checkout overview page
    When Verify the price of product "Sauce Labs Onesie" should be equal to the total price
    And Verify the tax value should be equal to 8% of the total price
    And Verify total payment should be equal to total product price plus tax
    And User click button finish
    And Checkout complete