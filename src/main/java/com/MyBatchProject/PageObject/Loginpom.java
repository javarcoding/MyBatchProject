package com.MyBatchProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {


	WebDriver driver;
	@FindBy(how=How.XPATH, using="//input[@id='email']")
	private WebElement emailid_txt;
	
	@FindBy(how=How.XPATH, using="//input[@id='pass']")
	private WebElement Password_txt;
	
	@FindBy(how=How.XPATH, using="//input[@id='login']")
	private WebElement Login_btn;
	
	public Loginpom(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getPassword_txt() {
		return Password_txt;
	}
	
	public WebElement getemailid_txt() {
		return emailid_txt;
	}
	
	public WebElement Login_btn() {
		return Login_btn;
	}
}
