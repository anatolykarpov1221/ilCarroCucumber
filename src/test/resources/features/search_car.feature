Feature: Search for a car by date

  @searchData
  Scenario: Search for a car in Tel Aviv on a specific date
    Given User navigates to "https://ilcarro.web.app/search"
    When User selects the city
    And User chooses a specific date
    And User clicks the Search button
    Then User see the cars available on the selected date
