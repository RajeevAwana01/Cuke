package cuke.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/cucumber","json:target/cucumber/cucumber.json"} ,
                 features = "./src/test/java/features",
                 glue = {"cuke.steps"},
                 tags = {}//,@web"}
		         )
public class RunCukeTest
{
	
}