package com.mercurytour;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.mercurytour"}, 
features = "src/test/java/",
//format = { "html:target/cucumber-htmlreport", "json:target/cucumber-report.json" }, 
//plugin = { "html:target/cucumber-htmlreport", "json:target/cucumber-report.json","com.cucumber.listener.ExtentCucumberFormatter" },
tags = {"@loginlogout"}, monochrome = true)
public class MercuryTourRunner extends AbstractTestNGCucumberTests {

	/*@BeforeClass
    public static void setup() {
    // Initiates the extent report and generates the output in the output/Run_<unique timestamp>/report.html file by default.
    ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    // Loads the extent config xml to customize on the report.
    ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
    }*/
}
