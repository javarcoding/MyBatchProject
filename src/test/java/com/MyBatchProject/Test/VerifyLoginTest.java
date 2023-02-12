package com.MyBatchProject.Test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.MyBatchProject.PageObject.Loginpom;
import com.MyBatchProject.Utility.BaseClass;
import com.MyBatchProject.Utility.LibraryUDF;


public class VerifyLoginTest  extends BaseClass {

	@Test
	public void VerifyLoginPage_TC001() {
		
		 //2.Email-id 3.pass 4.login 5.Assert Actual Expected
  	  Loginpom login=PageFactory.initElements(driver, Loginpom.class);
  	  LibraryUDF.custom_SendKeys(login.getemailid_txt(), excel.getStringData("LoginPageTestData", 1, 0));
  	  LibraryUDF.custom_SendKeys(login.getPassword_txt(), excel.getStringData("LoginPageTestData", 1, 1));
  	  LibraryUDF.custom_Click(login.Login_btn());
  	  
  	  String titlepage=driver.getTitle();
  	  String ExpectedTitle="abcd";
  	  Assert.assertEquals(titlepage, ExpectedTitle);
	}
	

	

}
