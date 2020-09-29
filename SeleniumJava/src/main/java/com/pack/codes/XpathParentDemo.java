package com.pack.codes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathParentDemo {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		WebElement loginLink = driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']"));
		Thread.sleep(5000);
		loginLink.click();
		WebElement userNameTxtbox = driver.findElement(By.name("email"));
		WebElement pwdTxtbox  = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		userNameTxtbox.sendKeys("here.pallavi17@gmail.com");
		pwdTxtbox.sendKeys("learnFast@123");
		loginBtn.click();
		Thread.sleep(5000);
		WebElement contactsLink = driver.findElement(By.linkText("Contacts"));
		contactsLink.click();
		Thread.sleep(5000);
		//previous sibling		
		String xpathString = "//td[text()='Mitul Ranjan']//preceding-sibling::td//input[@name='id']";
		String xpathString2 = "//td[text()='Riitul Sharma']//preceding-sibling::td//input[@name='id']";
		String xpathString3 = "//td[text()='Shiva Trikaal']//preceding-sibling::td//input[@name='id']";
		WebElement ele = driver.findElement(By.xpath(xpathString));
		clickElementByJS(ele, driver);
		WebElement ele2 = driver.findElement(By.xpath(xpathString2));
		clickElementByJS(ele2, driver);
		//WebElement rid = sendKeys(xpathString, driver, 60, "");
		//rid.click();
		//after sibling 
		// //td[text()='Mitul Ranjan']//following-sibling::td//a	
		
		WebElement text3 = driver.findElement(By.xpath(xpathString3));
		Actions actions = new Actions(driver);
		actions.moveToElement(text3).click().build().perform(); 

		
		
				
	}//m
	
	public static WebElement sendKeys(String xpathString, WebDriver driver, int timeout, String value) {
		return new WebDriverWait(driver, timeout)
		.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpathString))));
				
	}
	
	 public static void clickElementByJS(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].click();", element);
	    	
	 }
	

}//e
