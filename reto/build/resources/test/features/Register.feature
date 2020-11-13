Feature: create a user
  Scenario: register a user

    Given I must open the website

    When I must register a user
    |firstName |carlos              |
    |lastName  |escobar             |
    |email     |caaescof@gmail.com  |

    Then I must validate the text "Welcome to the world's"