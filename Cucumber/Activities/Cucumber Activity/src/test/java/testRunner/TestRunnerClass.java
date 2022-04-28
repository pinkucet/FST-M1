package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features",
glue = {"stepdefination"},
tags = "@SmokeTest",
//plugin = {"html:test-reports/test.html"},
plugin = {"json:test-reports/test.json"},
monochrome = true
)

public class TestRunnerClass {


}
