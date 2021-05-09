package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/featureFiles/LoginRun.feature",
		glue="StepDefinitions",
		publish=true
		)
public class TestRunner {

}
