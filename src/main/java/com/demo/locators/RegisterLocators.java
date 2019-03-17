package com.demo.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

//import FlightBase.FlightBaseClass;

public class RegisterLocators extends BaseClass {

	
		@FindBy(xpath="//*[text()='REGISTER']")
		public WebElement lnkRegister;
		
		@FindBy(xpath="//*[@name='firstName']")
		
		public WebElement edtFirstName;
		
		@FindBy(xpath="//*[@name='lastName']")
		public WebElement edtLastName;
		
		@FindBy(xpath="//*[@name='userName']")
		public WebElement edtEmail;
		
		@FindBy(xpath="//*[@name='address1']")
		public WebElement edtAddress;
		
		@FindBy(xpath="//*[@name='city']")
		public WebElement edtCity;
		
		@FindBy(xpath="//*[@name='country']")
		public WebElement edtCountry;
		
		@FindBy(xpath="//*[@name='email']")
		public WebElement edtUserName;
		
		@FindBy(xpath="//*[@name='password']")
		public WebElement edtPassword;
		
		@FindBy(xpath="//*[@name='confirmPassword']")
		public WebElement edtConfirmPass;
		
		@FindBy(xpath="//input[@name='register']")
		public WebElement btnSubmit;
		
		public RegisterLocators() {
			
			PageFactory.initElements(driver, this);
		}
			
}
