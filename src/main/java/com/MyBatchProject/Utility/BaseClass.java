package com.MyBatchProject.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static ConfigDataProvider config;
    public static ExcelDataProvider excel;
	@BeforeSuite
	public void setUp() throws IOException {
		 config=new ConfigDataProvider();
	excel=new ExcelDataProvider();
	}

	@Parameters("Browser")
	@BeforeMethod
	public void launchBrowser(String Browser) {
		// open browser code

		if (Browser.equalsIgnoreCase(config.getBrowserName())) {
			WebDriverManager.chromedriver().setup(); //setup driver as per driver version 
			driver=new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase(config.getBrowserNameFireFox())) {
			WebDriverManager.edgedriver().setup(); //setup driver as per driver version 
			driver=new EdgeDriver();
		}
		
		
		driver.get(config.getURL());
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
