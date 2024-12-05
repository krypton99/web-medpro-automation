Feature: Homepage
  Label is used to determine all homepage features

  Background: 
    Given User open Medpro

  @verify_homepage_ui
  Scenario: Assert homepage attribute
    Then User should see booking by doctor feature

