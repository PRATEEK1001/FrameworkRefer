package com.demo.action;

import org.openqa.selenium.WebDriver;

public class StartUpInitialise extends BaseClass{

	private static WebDriver driver;
	private static String EnvName;
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(WebDriver driver) {
		StartUpInitialise.driver = driver;
	}
	
	
	
	public static void setEnvName(String envName) {
		EnvName = envName;
	}
	
	public static String getEnvName() {
		return EnvName;
	}
	
	
	
	
}
