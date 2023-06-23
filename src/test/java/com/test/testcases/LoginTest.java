package com.test.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.test.base.TestBase;

public class LoginTest extends TestBase{
	
	
	@Test
	public void logintotheWebsite() throws InterruptedException
	{
		driver.get(config.getProperty("testsiteurl"));
		Thread.sleep(10000);
		String xpath=or.getProperty("signupButton");

		Thread.sleep(10000);
	}

}
