package com.demo.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class LoginLocators extends BaseClass {

	@FindBy(xpath="//*[text()='Home']")
	public WebElement lnkHome;
	
	@FindBy(xpath="//*[@name='userName']")
	public WebElement edtUserName;
	
	@FindBy(xpath="//*[@name='password']")
	public WebElement edtPasswd;
	
	@FindBy(xpath="//*[@name='login']")
	public WebElement btnLogin;
	
	public LoginLocators() {
		
		PageFactory.initElements(driver, this);
	}
	
}
