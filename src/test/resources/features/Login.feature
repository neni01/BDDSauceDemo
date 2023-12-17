@Login
Feature: login
  User want to login to website sauce demo

  @TC1
  Scenario: user login with valid credential
    Given User already on login page
    When User input "standard_user" as username
    And User input "secret_sauce" as password
    And User click button login






  @TC3
  Scenario Outline: user login with invalid credential
    Given User already on login page
    When User input "<username>" as userName and "<password>" as password
    Then User see "<errorMassage>" as error massage
    Examples:
      | username      | password     | errorMassage                                                              |
      | standard_user |              | Epic sadface: Password is required                                        |
      |               | secret_sauce | Epic sadface: Username is required                                        |
      |               |              | Epic sadface: Username is required                                        |
      | admin         | admin123     | Epic sadface: Username and password do not match any user in this service |
