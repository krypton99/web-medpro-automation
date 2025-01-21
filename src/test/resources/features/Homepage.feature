Feature: Homepage
  Label is used to determine all homepage features

  Background: 
  	Given Set browser to "fullscreen"
  	And Set environment "prod"
    And User open Medpro

  @verify_homepage_ui
  Scenario: Assert homepage attribute
    Then User should see booking by doctor feature
    And User should click on call video with doctor

