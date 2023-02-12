package com.MyBatchProject.Utility;

import org.openqa.selenium.WebElement;




public class LibraryUDF {

public static void custom_SendKeys(WebElement element, String ValuseToBeSent) {
		
		try {
			element.sendKeys(ValuseToBeSent);
			
		} catch (Exception e) {
			System.out.println("unable to send value"+e);
		}
		
	}
	
	public static void custom_Click(WebElement element) {
		
		try {
			element.click();

		} catch (Exception e) {
			System.out.println("unable to click"+ e);
		}
	}
}
