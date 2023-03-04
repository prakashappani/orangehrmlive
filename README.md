# orangehrmlive
### Sample Selenium Java Test cases automation for https://opensource-demo.orangehrmlive.com/

**This Repository has sample code for:**

**Selenium Framework**
* Xpath
* Reusable methods
* Test classification based on the pages
* Reading from an Excel file
* Implicit/Explicit wait
* Running tests in headless Browser mode
  * ```mvn -Dheadless=true test```

**Java**
* Inheritance from Base Test
* Java Classes
* Java Interfaces
* Overloading of methods

**TestNG Framework**
* Test Dependency
* Test Priority
* Data-Driven Testing
* TestNG XML file
* Annotations

**Cucumber/Gherkin Framework**
* Feature Files
* Step Definitions
* Test Runner (TestNGCucumberRunner)
* Feature
* Scenario / Scenario Outline
* Examples
* Parameters
* BeforeAll/AfterAll
* Running Tests from CMD line
  * ```mvn -Dheadless=true exec:java   -Dexec.classpathScope=test   -Dexec.mainClass=io.cucumber.core.cli.Main  -Dexec.args="src/test/resources/features --glue com/cucumber/stepDefinitions" ```

**Maven**
* pom file
* Dependency management
* Running tests in Browser mode
  * ```mvn test```
* Running tests in headless Browser mode
  * ```mvn -Dheadless=true test```

**GitLab**
* Gitlab Stages
* Using container
* Updating the required binaries
* running maven command
