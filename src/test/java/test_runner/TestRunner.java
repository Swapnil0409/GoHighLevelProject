package test_runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//feature/featureFile.feature", glue = "step_definations",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner {
}
