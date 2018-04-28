Feature: Generate the schedules
  Scenario: Generate the schedule for a new event
    Given a new event
    When ask for the next schedule
    Then it should be today

  Scenario: Generate the second schedule if the first schedule is today
    Given a new event with the first schedule is today
    When ask for the next schedule
    Then it should be tomorrow
