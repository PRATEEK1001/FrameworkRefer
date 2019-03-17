package com.demo.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.demo.action.BaseClass;
import com.demo.action.FlightFinderMethods;
import com.demo.action.LoginMethods;
import com.demo.action.RegisterMethod;

public class FlightBooking extends BaseClass {

	
	@Test(priority=1)
	public void SignUp() throws IOException {
		RegisterMethod objReg = new RegisterMethod();
		objReg.RegisterProcess(UN, PW);	
		
		LoginMethods objLogin = new LoginMethods();
		objLogin.LoginProcess(UN,PW);
		
		FlightFinderMethods objFlightFinder = new FlightFinderMethods();
		objFlightFinder.ValidateFlightFinderHeader();
		objFlightFinder.FlightFinderPRocess();
		
		
	}
	
	/*@Test(priority=2)
	public void Login() {
		LoginMethods objLogin = new LoginMethods();
		objLogin.LoginProcess(UN,PW);	
	}
	
	@Test(priority=3)
	public void FlightFInder() {
		FlightFinderMethods objFlightFinder = new FlightFinderMethods();
		objFlightFinder.ValidateFlightFinderHeader();
		objFlightFinder.FlightFinderPRocess();
	}*/
	
	
	
	
	
	
	
	
	
}
