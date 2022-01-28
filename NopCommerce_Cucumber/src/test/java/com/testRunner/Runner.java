package com.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Login.feature",
glue = "com.stepDefinitions", 
dryRun = false,
monochrome = true,
tags= "@sanity"
)
public class Runner {

}
