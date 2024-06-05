package com.iprody.e2e.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        glue = { "com.iprody.e2e.stepdefs", "com.iprody.e2e.config" })
public class CucumberRunnerTest {

}

