package Runner;


import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class) -- jUNIT
@CucumberOptions(features = {"src/test/java/Feature"},format = {"json:target/cucumber.json","html:target/site/cucumber-report-html"},glue = "Steps")
public class   TestRunner extends AbstractTestNGCucumberTests {
}
