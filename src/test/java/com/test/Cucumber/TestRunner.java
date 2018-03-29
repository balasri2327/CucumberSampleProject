package com.test.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java"},glue = { "com.test.Cucumber" } ,plugin = { "pretty",
		"html:target/cucumber-html-report" })
 
public class TestRunner {
	
}