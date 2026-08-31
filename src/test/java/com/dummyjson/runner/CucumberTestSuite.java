package com.dummyjson.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.dummyjson.stepdefinitions"},
        tags = "@addproduct",
        plugin = {
                "pretty",
                //"html:target/cucumber-reports/cucumber.html",
               //"json:target/cucumber-reports/cucumber.json",
               // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"

        },
        monochrome = true
)
public class CucumberTestSuite {
}

