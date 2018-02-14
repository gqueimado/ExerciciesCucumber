Feature: Login

  @Test
  Scenario: Do the Login Process
    Given I navigate to the login page
    And I click on login button
    And I enter the following for login
      | username | password      |
      | admin    | adminpassword |


  Scenario Outline: Do the Login Process using Scenario outline
    Given I navigate to the login page
    And I click on login button
    And I enter <username> and <password>

    Examples:
      | username | password   |
      | execute  | automation |
      | testing  | qa         |