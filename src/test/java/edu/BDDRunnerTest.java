package edu;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * User: Yamit Cárdenas
 */


@RunWith(Cucumber.class)
@Cucumber.Options(
        format = {"pretty","html:target/cucumber"},
        features = "src/test/resources"
)
public class BDDRunnerTest {}
