package com.MyBatchProject.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {

	public static ExtentReports extent;
	
	public static ExtentReports ExtentReportNG() {
		
		String pathReport=System.getProperty("user dir")+"\\TestReport"; 
		ExtentSparkReporter reporter=new ExtentSparkReporter(pathReport);
		reporter.config().setDocumentTitle("Automation Test Result");
		reporter.config().setReportName("MayBatchProject Test");
		reporter.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("System", "MayBatchProject");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
		
	}

}
