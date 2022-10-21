@FindFlight
Feature: searching a specific flight
  As a user i want to enter inforamtion (goingto,check in date , check out date) so that i find flight
  answering to my criterias 

  @FlightSearch
  Scenario: do a search about one flight
    Given I want to get the url website
    When I fill the goingto field with "Tunis (TUN - Tunis-Carthage Intl.)"
    And I select check-in date an check-out date from calender
    And I click on the button done
    And I click on the button search
    Then I check a new label is displayed contain "Tunis (TUN-Tunis - Carthage Intl.)"
   