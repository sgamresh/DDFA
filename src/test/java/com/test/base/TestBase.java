package com.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	
	
	@BeforeSuite
	public void setUp() throws IOException {
		
		if(driver==null) {
			fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/properties/config.properties");
			config.load(fis);
			fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/properties/or.properties");
			or.load(fis);
 		}
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-site-isolation-trials");
		options.addArguments("--start-maximized");
//		disable the microphone popup
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("profile.default_content_setting_values.media_stream_mic", 2);
		options.setExperimentalOption("prefs", prefs);

//		options.addArguments("--headless");
//		options.addArguments("--window-size=1920,1080");
		driver = new ChromeDriver(options);
		 
		
		
		
		
		

	}

	@AfterSuite
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}

	}

}
