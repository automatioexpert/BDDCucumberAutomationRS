package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",dryRun = false, glue = "steps", tags = "@RegTest",plugin = {"pretty","html:target/cucumber.xml"},
monochrome = true)
public class TestRunner {

}
