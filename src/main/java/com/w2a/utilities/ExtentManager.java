package com.w2a.utilities;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentSparkReporter htmlReporter;
	private static ExtentReports extent;
		
	public static ExtentReports getInstance() {
		
		String fileName=System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\extent.html";
		
		if(extent==null) {
			
			
			htmlReporter=new ExtentSparkReporter(fileName);
			  
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        //htmlReporter.config().setDocumentTitle(fileName);
	        htmlReporter.config().setReportName("Automation Test Reults");
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName(fileName);
			
			
			htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\extentconfig\\ReportsConfig.xml"));
			
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Automation Tester", "Deepshikha Gupta");
	        extent.setSystemInfo("Organization", "IBM");
	        extent.setSystemInfo("Build no", "W2A-1234");
			
			
		}
		
		
		return extent;
	}
	

}
