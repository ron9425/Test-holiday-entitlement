Feature: As user I want to Check the Functionality of the site


  Scenario: User should calculate holiday entitlement per days worked per week
    Given I am on homepage
    When I click on Accept Cookies
    Then I click on StartButton
    And I click on Days Worked Per Week and click continue
    And I click on Full Leave Year and click continue
    And I Enter Days Worked Per Week and click continue
    And The user should see the entitlement holidays


  Scenario: User should calculate holiday entitlement per hours worked per week
    Given I am on homepage
    When I click on Accept Cookies
    Then I click on StartButton
    And I click on Hours Worked Per Week and click continue
    And I click on Leave For Year and click continue
    And I Enter Hours Worked Per Week and click continue
    And The user should see the entitlement holidays















