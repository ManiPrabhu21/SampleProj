package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prabhu\\eclipse-workspace\\MAVEN\\src\\test\\resources\\features\\CancelBooking.feature",glue= {"com.stepdefinition"},monochrome=true,plugin= {"pretty",
		"json:C:\\Users\\prabhu\\eclipse-workspace\\MAVEN\\src\\test\\resources\\report\\output.json"},dryRun=false)
	
	
	public class TestRunner{

	@AfterClass
	public static void afterClass() {
		String path = System.getProperty("user.dir");
		Reporting.jvmReports(path+"\\src\\test\\resources\\report\\cancel.json");

	}
		

	}


