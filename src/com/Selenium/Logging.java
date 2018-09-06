package com.Selenium;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Logging {
 
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest test;
	public void ReportInit()
	{
		 
		htmlreporter= new ExtentHtmlReporter("D:\\SeleniumWorkSpace\\Reports\\ExtentReport.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("User Name", "Jogi");
		
		htmlreporter.config().setDocumentTitle("Automation Project");
		htmlreporter.config().setReportName("Extent Report");
		
		 extent.loadConfig(new File("D:\\SeleniumWorkSpace\\extent\\extent-config.xml"));
	}

}
