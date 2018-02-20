Feature: Exercise 7
  Scenario: Another window focus
    Given i am at example page
    And click on another window
    And change the focus to the new tab
    Then the focus is at the new page