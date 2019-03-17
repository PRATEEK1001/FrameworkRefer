package com.demo.action;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

//import org.jsoup.Connection.Method;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.demo.utility.GetProperties;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	public static  WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static String UN;
	public static String PW;
	
	@BeforeSuite
	public void InitialiseSuitRepo() {
		reports=new ExtentReports(System.getProperty("user.dir")+"//Report//Report.html");
	}
	
	@BeforeMethod
	@Parameters({"Browser","EnvName"})
	public static void Initialise(String BrowserName,String EnvNam,Method method) {

		logger= reports.startTest(method.getName());
		//System.out.println(method.getName());
		System.out.println(BrowserName);
		System.out.println("Hi");
		//
		InvokeBrowser(BrowserName);
		StartUpInitialise.setDriver(driver);
		StartUpInitialise.setEnvName(EnvNam);
		GetProperties readProp = new GetProperties();	
		String URLReq=readProp.getProperties("URL");	
		 UN=readProp.getProperties("Username");
		 PW=readProp.getProperties("Password");
		 System.out.println(UN);
	
		driver.get(URLReq);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void InvokeBrowser(String BrowserName) {
		
		String DriverPath=System.getProperty("user.dir")+"\\Driver\\";
		System.out.println(DriverPath);
		
		switch(BrowserName) {
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", DriverPath+"chromedriver.exe");
			 driver = new ChromeDriver();
			 break;
			 
		default : 
			System.out.println("Invalid Broser name");
		}
	}
	
	@AfterMethod
	public void AfterMethodProcess() throws InterruptedException {
		Thread.sleep(2000);
		reports.endTest(logger);
		//driver.quit();
	}
	
	@AfterSuite
	public void CleanupSuuits() {
		reports.flush();
	}

}
