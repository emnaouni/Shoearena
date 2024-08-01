package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature" ,
glue = "StepsDefinition",
plugin = {"pretty", "html:target\\cucumber\\report.html"
},
  tags =("@Login") )
public class TestRunner {
}