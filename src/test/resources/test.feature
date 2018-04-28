Feature: Generate the schedules
  Scenario: Generate the schedule for a new event
    Given a new event
    When ask for the next schedule
    Then it should be today
