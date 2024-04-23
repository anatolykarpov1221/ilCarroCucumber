Feature: Home Page

  @navigate
  Scenario: Verify HomePage title is displayed
    Given User launches Chrome
    When User opens ilCarro HomePage
    Then User verifies HomePage title is displayed
    And User quites browser
