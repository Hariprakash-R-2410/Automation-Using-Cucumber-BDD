package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	@Before
	public void beforeExecution() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();

	}

	@After
	public void afterExecution(Scenario scenario) {
	
			String scenarioname = scenario.getName();			
			scenario.attach(takeScreenShot(), "image/png", scenarioname);

		
		closeBrowser();

	}

}
