Feature:Login Action

  Scenario: Successful Login with Login Credentials

    Given User is on Home page
    When User navigate to login page
    And User enters username and password
    Then Message displayed login successfully