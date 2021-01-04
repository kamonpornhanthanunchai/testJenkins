
Feature: Search by keyword
@runme
  Scenario: Searching for a term
    Given Ham is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"
@runme
  Scenario: Google Search
    Given Ham is researching things on Google
    When he search for "Allianz"
    Then he should get information about "Allianz"
