Feature: Health Facility Register Feature
  Label is used to determine all Health Facility features

  Background: 
    Given Set browser to "fullscreen"
    And Set environment "beta"
    And User open Health Facility Register Page

  @register
  Scenario Outline: Customer want to register their health facilities in Medpro platform
    Then Customer open "<fileName>" and get data from row "<row>"
    Then Customer click register button

    #Examples:
    #| fullname   | clinic   | phone   | subject   | email   | degree   | city   | district   | ward   | address   | intro   |
    #| <fullname> | <clinic> | <phone> | <subject> | <email> | <degree> | <city> | <district> | <ward> | <address> | <intro> |
    Examples: 
      | fileName | row |
      | data.xlsx     | 1 |
      | data.xlsx     | 2 |
