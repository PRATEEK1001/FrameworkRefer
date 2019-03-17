package com.demo.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.demo.action.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class VerifySeleniumEasy extends BaseClass {

	
	@Test(priority=1)
	public void validateSeleniumEasy() {
		System.out.println("Test Executed");	
		String Name= "Prateek";
		
		//driver.findElement(By.xpath("//a[contains(text(),' Start Practising ')]"));
		logger.log(LogStatus.INFO, "Clicked on start Practising link");
		
		if(1==1) {
			logger.log(LogStatus.PASS, "1 is equal to 1");	
		}else {
			logger.log(LogStatus.FAIL, "1 is not equal to 1");	
		}
		
		if(Name.equalsIgnoreCase("PRATEEK")) {
			logger.log(LogStatus.PASS, "name is equal to Prateek");	
		}else {
			logger.log(LogStatus.FAIL, "name is not equal to Prateek");	
		}
		
		
	}
}
