package com.Test.KumarGauravJain.runTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/com/Sample/cucumber/feature/",
		tags = { "@Assessment" }, 
		glue = { "com/Test/KumarGauravJain/stepdefinition/" }, 
		format = { "json:target/cucumber.json", "junit:target/cucumber.xml","html:targetcmd/site/cucumber-pretty" })

public class RunTest {
}
