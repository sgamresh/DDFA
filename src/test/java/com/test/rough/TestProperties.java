package com.test.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		FileInputStream fis;

		Properties config = new Properties();
		Properties or = new Properties();

		fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/properties/config.properties");
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		
		fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/properties/or.properties");
		or.load(fis);
		System.out.println(or.getProperty("signupButton"));
		
		
		
		
		

	}

}
