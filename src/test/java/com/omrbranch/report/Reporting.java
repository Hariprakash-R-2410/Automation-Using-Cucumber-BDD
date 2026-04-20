package com.omrbranch.report;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class Reporting extends BaseClass {

	public static void generateJvmReport(String jsonFileReport) throws FileNotFoundException, IOException  {
		File file = new File(getProjectPath()+ getPropertyFileValue("jvmPath"));

		Configuration configuration = new Configuration(file, "OMR Branch Hotel Booking Project");

		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Browser Version", "102");
		configuration.addClassifications("OS", "WIN11");

		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(jsonFileReport);
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

		builder.generateReports();

	}



}
