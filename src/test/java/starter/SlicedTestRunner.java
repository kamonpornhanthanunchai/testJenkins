package starter;

import org.junit.runner.RunWith;

import io.cucumber.java.Before;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.cucumber.suiteslicing.SerenityTags;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources/features",
//glue = "src/test/java/starter/stepdefinitions",
glue = "starter.stepdefinitions"
//,tags = "@runme"
)

public class SlicedTestRunner {

}
