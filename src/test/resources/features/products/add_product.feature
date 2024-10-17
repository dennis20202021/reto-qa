@regression
Feature: Add products to the shopping cart

  Background:
    Given Daniel navigates to the San Angel website
    Then Validate the page title is "Floristerias en Medellin - Flores a domicilio Medellín | San Angel"

  @scenario_one
  Scenario: Add one product with two quantities to the shopping cart in San Angel website
    When Add 1 product with 2 quantities to the shopping cart

