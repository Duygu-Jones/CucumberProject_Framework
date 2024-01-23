package management_on_school.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:TestOutput/reports/CucumberReport.html",
        features = "src/test/resources",
        glue = {"management_on_school/stepDefinitions", "management_on_school/hooks"},
        tags = "@UI_US05",
        dryRun = false
)
public class Runner {

}
