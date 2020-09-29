package com.testng.basics;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setupTest() {
		System.setProperty("webdriver.chrome.driver", "d:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.orangehrm.com/orangehrm-30-day-trial/");
		
	}
	
	@Test(enabled=false)
	public void orangeHrmTitleTest() {
		System.out.println(" Title test  Orange HRM ");
		String title = "Free Human Resource Management Software | 30 Day Trial Creation";
		Assert.assertEquals(driver.getTitle(), title, "Title is verified");
	}
	
	@Test(enabled=false)
	public void orangeHrmLogoDisplayedTest() {
		WebElement logo = driver.findElement(By.xpath("//img[@class='nav-logo']"));
		Assert.assertTrue(logo.isDisplayed());
	}
	
	@Test
	public void contactSalesLinkDisplayedTest()throws InterruptedException {
		WebElement contactSalesLink = driver.findElement(By.xpath("//a[text()='Contact Sales']"));
		assertTrue(contactSalesLink.isDisplayed());
	}
	
	
	@AfterMethod
	public void quitTest() {
		System.out.println(" Close driver ");
	}
	
}
