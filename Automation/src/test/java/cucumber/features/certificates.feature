Feature: Certificate page
  As a user,
  I want to open the Certificate page and do smth

  Scenario Outline: find number of certificate
    Given I am on Certificate page
    When I <input> Certificate number
    Then I receive <result> the Certificate number
    Examples:
      | input |result|
      |335    |false |
      |2552   |false |
      |52621  |false |
      |823236 |false  |