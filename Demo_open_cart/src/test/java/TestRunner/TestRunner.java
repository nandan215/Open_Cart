package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E://Demo_OpenCart//Features",
		glue="StepDefination",
		tags="@smoke",
		dryRun=false,
		monochrome=true,
		plugin={"pretty","html:target//cucumberreport"})
public class TestRunner {

}
