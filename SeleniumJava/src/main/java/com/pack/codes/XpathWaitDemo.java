package com.pack.codes;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathWaitDemo {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
		WebElement loginLink = driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']"));
		loginLink.click();
		
		WebElement userNameTxtbox = driver.findElement(By.name("email"));
		WebElement pwdTxtbox  = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		userNameTxtbox.sendKeys("here.pallavi17@gmail.com");
		pwdTxtbox.sendKeys("learnFast@123");
		loginBtn.click();
		
		WebElement contactsLink = driver.findElement(By.linkText("Contacts"));
		contactsLink.click();
		String xpathString1 = "//td[text()='Mitul Ranjan']//preceding-sibling::td//input[@name='id']";
		String xpathString2 = "//td[text()='Riitul Sharma']//preceding-sibling::td//input[@name='id']";
		WebElement ele = driver.findElement(By.xpath(xpathString1));
		clickElementByJS(ele, driver);
		ele = driver.findElement(By.xpath(xpathString2));
		clickElementByJS(ele, driver);
		//clickElementByJS(contactsLink, driver);
		//Thread.sleep(5000);
	
//edit		
//td[text()='mitstest@gmail.com']//following-sibling::td[@class='right aligned collapsing options-buttons-container']//a/button//i[@class="edit icon"]
		
		
		
	}//m
	
	public static void clickElementByJS(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].click();", element);
    	//js.executeScript("return arguments[0].childNodes[0].nodeValue;", element);
    	
	}
	
}
