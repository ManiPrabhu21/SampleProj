package com.reporting;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Reporting {

	public static void jvmReports(String json) {

		File file = new File("C:\\Users\\prabhu\\eclipse-workspace\\MAVEN\\src\\test\\resources\\report");
		
		Configuration configuration = new Configuration(file, "Adactin Hotel Page");
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("Author Name", "Prabhu");
		configuration.addClassifications("Batch", "4pm Cucumber");
		
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add(json);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
		
	}
}
