package com.testng.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationOne {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url", "browser"})
	public void setupTest(String url, String browser) {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "d:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "d:/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.get(url);
	}
	
	

}
