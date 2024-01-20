package management_on_school.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed/failed_scenario.txt"},

        features = "@TestOutput/failed/failed_scenario.txt",
        glue = {"stepDefinitions"},
        dryRun = false,
        monochrome = true

)
public class FailedRunner {
    }
