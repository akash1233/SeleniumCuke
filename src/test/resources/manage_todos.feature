Feature: Todos can be managed

  Background:
    Given User is on todo page

  Scenario: New todo can be added
    Given There are no todos
    When User adds clean-up to todos
    Then Items count is 1