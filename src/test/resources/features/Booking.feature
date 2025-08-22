Feature: Booking
  Label is used to determine all booking features

  Background: 
  	Given Set browser to "fullscreen"
  	And Set environment "prod"
    And User open Medpro

  @booking
  Scenario: User want to make a reservation for medical services
    Then User should choose "Đặt khám tại cơ sở" medical feature
    Then User should type "Đại học Y Dược" and filter "" in search box
    Then User should see result facility match the name "Đại học Y Dược"
    Then User should click on book now "Đại học Y Dược"
    Then User should choose booking type "Đặt khám theo Bác sĩ"
