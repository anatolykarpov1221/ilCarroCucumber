Feature: Login

  @validData
  Scenario:Login with valid data
    Given User launches Chrome
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Succes Message is displayed
    And User quites browser