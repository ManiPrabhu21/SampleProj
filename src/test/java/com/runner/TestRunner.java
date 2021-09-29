package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/adactinfields2.feature",glue={"com.adactinfields2.feature"}, monochrome=true, plugin = {"pretty","json:src/test/resources/report/result.json"})
public class TestRunner {
	
	//@AfterClass
	//public static void afterClass() {
		//Reporting.jvmReports("C:\\Users\\prabhu\\eclipse-workspace\\MAVEN\\src\\test\\resources\\report\\result.json");

	}


