Feature: Testing OrangeHRM Application
  This is an example of Tests using Gherkin, Cucumber, TestNG, Java, Maven

  Scenario: Login into OrangeHRM Admin Page
    Given I login OrangeHRM Application with "Admin" and "admin123"
    When I click on Admin Tab
    Then I logout of Application

  Scenario Outline: Login into OrangeHRM Leave Page
    Given I login OrangeHRM Application with "<username>" and "<password>"
    When I click on Leave Tab
    Then I logout of Application
    Examples:
      | username | password |
      | Admin    | admin123 |

  Scenario Outline: Login into OrangeHRM with Invalid credentials
    Given I login OrangeHRM Application with "<username>" and "<password>"
    Then I should see Invalid credentials message
    Examples:
      | username | password  |
      | Admin123 | admin123  |
      | Admin    | admin1234 |

