package starter;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty" }, features = "src/test/resources/features", 
//glue = "src/test/java/starter/stepdefinitions",
tags = "@firsttest"
)

public class CucumberTestSuite {

}
