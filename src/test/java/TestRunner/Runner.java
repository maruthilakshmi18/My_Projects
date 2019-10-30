package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(
plugin= {"pretty", "html:target/cucumber-reports"},
strict=true,
features = "src/test/java/Feature/Google.feature",
tags= {"@Test2"},
glue= {"seleniumartifact"},
monochrome=true,
dryRun=false


)

public class Runner {
	
	

}