@GetCEOname
Feature: Retrieve CEO name from OrangeHRM application

  Scenario Outline: Verify the CEO Name
    Given the user is logged in successfully and is on the home page
When the user clicks on the directory option from the menu bar
    And the user selects the job title as "CEO" from the dropdown
    And clicks on the search button
    Then the user should see the CEO name as "<CEO_Name>"

    Examples:
      | CEO_Name    |
      | John Smith  |
