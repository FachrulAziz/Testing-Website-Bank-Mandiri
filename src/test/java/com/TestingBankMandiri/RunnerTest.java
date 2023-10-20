package com.TestingBankMandiri;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features =  "src/main/resources/features",
//        {"src/main/resources/features/01GoToWebsite.feature",
//        "src/main/resources/features/02KPRSimulasiPenghasilan.feature"},
        glue = "com.TestingBankMandiri",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
