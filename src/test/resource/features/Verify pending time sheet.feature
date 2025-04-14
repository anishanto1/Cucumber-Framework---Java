@timesheets
Feature: Retrieve pending timesheets

  Scenario Outline: Verify pending timesheets
    Given the user is on the home page
    And the user enters the name as "John Smith"
    And clicks on the view option
    Then the user should see the message as "<message>"

    Examples:
      | message             |
      | No timesheets found |
