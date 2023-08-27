package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources",
        dryRun = false,
        tags = "@MainClass",
        plugin = "json:target/cucumber-report/cucumber.json"
)
public class RunCukeTest extends AbstractTestNGCucumberTests {
    // a json report is generated as target/cucumber-report
    //open maven tab and click 'execute maven goal'
    //enter 'cluecumber-report:reporting' and click ok to build
    //report will generated in target folder as generated-report
    //to run from intellij

}
