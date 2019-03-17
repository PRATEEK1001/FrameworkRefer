package com.demo.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demo.action.BaseClass;

public class FlightFinderLocator extends BaseClass {

	@FindBy(xpath="//img[contains(@src,'flightfinder')]")
	public WebElement FltFinderHeader;
	
	@FindBy(xpath="//input[@name='findFlights']")
	public WebElement btnFindFlight;
	
	
	public FlightFinderLocator() {
		
		PageFactory.initElements(driver, this);
	}
	
}
