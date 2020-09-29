package com.testng.listener.screenshot;

import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

@Listeners(CustomListener.class)
public class TestOrangeHrm extends Base{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	// purposely failing to capture screen shot in screenshots directory
	@Test
	public void verifyTitle() {
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void verifyCompanyLogo() {
		Assert.assertEquals(false, true);
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close(); if not close its not runing second test case ...driver is null
	}

}
