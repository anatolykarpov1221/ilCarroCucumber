Feature: Search for a car by date

  @searchData
  Scenario: Search for a car in Tel Aviv on a specific date
    Given User launches Chrome
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on OK button
    And User selects the city
    And User chooses a specific date
    And User clicks the Yalla button
    Then User see the cars available on the selected date
