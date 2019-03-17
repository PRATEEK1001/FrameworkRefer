package com.demo.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.jayway.jsonpath.JsonPath;

public class RaadJson {
	
	public static String getJsonValue(String jsonPath) throws IOException{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\TestData.JSON";
		String jsonString = new String(Files.readAllBytes(Paths.get(path)));
		String value = JsonPath.read(jsonString, jsonPath);		
		return value;	
	}

}
