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

  @invalidPassword
  Scenario Outline:Login with valid email and invalid password
    Given User launches Chrome
    When User opens ilCarro HomePage
    And User clicks on Login link
    And User enters valid email and invalid password
    |email|password|
    |<email>|<password>|
    And User clicks on Yalla button
    Then User verifies Error is displayed
    And User quites browser
    Examples:
      | email | password |
      | karpov1221@gmail.com |  Super1557 |
      | karpov1221@gmail.com |  S11111557! |
      | karpov1221@gmail.com |  super1557! |
      | karpov1221@gmail.com |  Super!!!!!! |