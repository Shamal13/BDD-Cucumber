package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "hooks_cases.feature" },

		glue = { "hooks_cases.java" },

		dryRun = false,

		monochrome = true

)

public class TestRunner {
}

