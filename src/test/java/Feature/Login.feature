Feature: Login

  @Test
  Scenario: Do the Login Process
    Given I navigate to the login page
    And I enter the following for login
      | username | password      |
      | admin    | adminpassword |
    And click on loggin button
    Then i am redirect to logged page

  #Scenario Outline: Do the Login Process using Scenario outline
   # Given I navigate to the login page
   # And I enter <username> and <password>

    #Examples:
    #  | username | password   |
    #  | execute  | automation |
    #  | testing  | qa         |