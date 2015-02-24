package edu;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * User: Yamit Cárdenas
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","html:build/cucumber"},
        features = "src/test/resources"
)
public class BDDRunnerTest {}
