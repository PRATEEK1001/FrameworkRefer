package com.demo.action;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.demo.locators.RegisterLocators;
import com.relevantcodes.extentreports.LogStatus;

public class RegisterMethod extends BaseClass {

	RegisterLocators Reg=new RegisterLocators();
	
	public void RegisterProcess(String UN,String PW) {
		
		Reg.lnkRegister.click();
		//Thread.sleep(3000);
		
		Assert.assertTrue(Reg.edtFirstName.isDisplayed());
		if(Reg.edtFirstName.isDisplayed()) {
			logger.log(LogStatus.PASS, "FirstName editbox is displayed");	
		}else{
			logger.log(LogStatus.FAIL, "FirstName editbox is not displayed");	
			
		}
		Reg.edtFirstName.sendKeys("Ankur");
		Reg.edtLastName.sendKeys("Gupta");
		Reg.edtEmail.sendKeys("Prateekgupta@gmail.com");
		Reg.edtAddress.sendKeys("Hinjewadii");
		Reg.edtCity.sendKeys("Pune");
		Select oSelect=new Select(Reg.edtCountry);
		oSelect.selectByVisibleText("INDIA");
		Reg.edtUserName.sendKeys(UN);
		Reg.edtPassword.sendKeys(PW);
		Reg.edtConfirmPass.sendKeys(PW);
		Reg.btnSubmit.click();
		/*if(Reg.btnSubmit.isDisplayed()) {
			Reg.btnSubmit.click();
		}
		*/
		logger.log(LogStatus.INFO, "Registration Process id done");
	}
}
