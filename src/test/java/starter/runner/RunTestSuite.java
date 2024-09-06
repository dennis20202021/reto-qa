package starter.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = { "src/test/resources/features" }, 
    plugin = {
        "io.cucumber.core.plugin.SerenityReporterParallel",
        "pretty",
        "timeline:build/test-results/timeline"
    }, 
    snippets = CucumberOptions.SnippetType.CAMELCASE, 
    glue = { "starter.stepdefinitions" }, 
    tags = "@green" // Specify your tags here
)
public class RunTestSuite {
}
