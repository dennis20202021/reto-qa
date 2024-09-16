package org.demo.qa.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = { "src/test/resources/features" },
        plugin = {
                "io.cucumber.core.plugin.SerenityReporterParallel",
                "pretty",
                "timeline:build/test-results/timeline"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = { "org.demo.qa.stepdefinitions" }
)
public class RunTestSuite {}
