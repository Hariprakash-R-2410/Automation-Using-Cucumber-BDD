package com.omrbranch.runner;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "",stepNotifications = true, snippets = SnippetType.CAMELCASE, publish = true, monochrome = true, dryRun = false, plugin = {
		"pretty", "json:target\\Output.json" }, features = "src/test/resources", glue = "com.omrbranch.stepdefinition")



public class TestRunnerClass extends BaseClass {

	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJvmReport(getProjectPath() +getPropertyFileValue("jsonPath"));

	}


	

}
