package com.MyBatchProject.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener  {

	ExtentReports extent=ExtentReporterNG.ExtentReportNG();

	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		ObjectRepo.test=extent.createTest(result.getTestClass().getName()+ "==" +result.getMethod().getMethodName());
		extenttest.set(ObjectRepo.test);
	}

	public void onTestSuccess(ITestResult result) {
		ObjectRepo.test.log(Status.PASS, "Test Case Pass......");
	}

	public void onTestFailure(ITestResult result) {
		ObjectRepo.test.log(Status.FAIL, "Test Case Fail......");
		extenttest.get().addScreenCaptureFromPath(getScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		ObjectRepo.test.log(Status.SKIP, "Test Case Skip......");
	}

	public void onFinish(ITestContext context) {

		extent.flush();
	}
	
	public String getScreenshot() {
		String src=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return src;
	}
}
