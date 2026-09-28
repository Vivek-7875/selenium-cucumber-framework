Feature: login functionality
@smoke
   Scenario Outline: Successful login

    When User enters "<username>" and "<password>"
    And User clicks on login button
    Then User should be logged in successfully

    Examples:
        | username      | password     |
        | standard_user | secret_sauce |




