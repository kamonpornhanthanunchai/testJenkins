@runmeeemm
Feature: Test rest assured

  Scenario: Getting employee details
    Given Ham is getting employee details
    When he requests for details of employee "1"
    Then he should get employee details
