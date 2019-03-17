package com.demo.action;

import com.demo.locators.FlightFinderLocator;
import com.relevantcodes.extentreports.LogStatus;

public class FlightFinderMethods extends BaseClass {

	FlightFinderLocator fltFind= new FlightFinderLocator();
	
	public void ValidateFlightFinderHeader() {
		
		if(fltFind.FltFinderHeader.isDisplayed()) {
			
			logger.log(LogStatus.PASS, "Flight Finder Header Displayed");	
		}else {
			logger.log(LogStatus.FAIL, "Flight Finder Header is not Displayed");
		}
	}
	
	public void FlightFinderPRocess() {
		fltFind.btnFindFlight.click();
		
		logger.log(LogStatus.INFO, "COntinue Button Clicked");
		
	}
}
