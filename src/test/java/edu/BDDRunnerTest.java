package edu;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * User: Yamit Cárdenas
 */


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        format = { "pretty","html: cucumber-html-reports",
                "json: cucumber-html-reports/cucumber.json" },
        dryRun = false,
        glue = "edu" )
public class BDDRunnerTest {}
