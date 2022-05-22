package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue = {"StepDefinition"}, monochrome=true, 
               plugin = {"pretty","html:target/index.html",
            		     "pretty","json:target/index.json",
            		     "pretty","junit:target/index.xml"}
		)

public class TestRunner {

}
