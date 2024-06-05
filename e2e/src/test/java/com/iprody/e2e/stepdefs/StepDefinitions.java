package com.iprody.e2e.stepdefs;

import io.cucumber.java.en.Given;

public class StepDefinitions {

    @Given("cucumber test")
    public void cucumberTest() {
        System.out.println("IT WORKS!");
    }
}
