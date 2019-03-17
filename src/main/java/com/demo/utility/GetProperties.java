package com.demo.utility;

import org.testng.annotations.Test;

import com.demo.action.StartUpInitialise;

import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class GetProperties {
	
	public String getProperties(String key) {
		Properties prop = new Properties();
		String value = null;
		//StartUpInitialise filread= new StartUpInitialise();

		try {		
			String path = System.getProperty("user.dir")+"\\src\\test\\resources\\EnvProp\\"+StartUpInitialise.getEnvName()+".properties";
			System.out.println(path);			
			File f = new File(path);
			FileReader reader=new FileReader(f);		    
			prop.load(reader);
			System.out.println(prop.getProperty(key));
			value = prop.getProperty(key);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return value;
	}

}
