Feature: User registration
  Scenario: Register multiple users
    Given the following user data:
      | name    | age | email               |
      | Scott  | 20  | scott@example.com   |
      | Martin     | 25 | martin@example.com     |
      | Karen | 30  | karen@example.com |
    When I process the user data
    Then I should have 3 users
    And all emails should contain "@"
    And all emails should contain "."
