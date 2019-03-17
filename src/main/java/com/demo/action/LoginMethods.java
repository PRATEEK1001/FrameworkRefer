package com.demo.action;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.demo.locators.LoginLocators;
import com.demo.utility.RaadJson;

public class LoginMethods extends BaseClass{

	LoginLocators login =new LoginLocators();
	
	public void LoginProcess(String User,String Passwrd) throws IOException {
		
				login.lnkHome.click();
				//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
				Assert.assertTrue(login.edtUserName.isDisplayed());
				
				String user=RaadJson.getJsonValue("$.LoginCredentials.username");
				String Pass=RaadJson.getJsonValue("$.LoginCredentials.password");
				System.out.println("JASON USERNAME IS"+user);
				System.out.println("JASON PASSWORD IS"+Pass);
				
				login.edtUserName.sendKeys(User);
				login.edtPasswd.sendKeys(Passwrd);
				login.btnLogin.click();
				
	}
}
