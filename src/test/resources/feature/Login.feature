Feature: Verifying admin user can login onto admin UI.

  @Login @Smoke
  Scenario: This is a testing scenarios for circleci
    Given I am on the login page
    When I log in
    Then I should be redirected to the home page
