package com.pack.codes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xpathListLinksDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");
		System.out.println(driver.getTitle());
		
		// click on the CRM TAB to view sub menu options
		WebElement subMenuOptions = driver.findElement(By.xpath("//a[text()='CRM']"));
		//Actions action = new Actions(driver);
		//action.moveToElement(subMenuOptions).click().build().perform();
		// //a[text()='CRM']//parent::li//ul//li/descendant::a
		String subMenuCRMString = "//a[text()='CRM']//parent::li//ul//li";
		String subMenuAppsString = "//a[text()='Apps']//parent::li//following-sibling::li//ul[@class='rd-navbar-dropdown rd-navbar-open-right']//li";
		// "//a[text()='CRM']//parent::li//ul//li/a";
		List<WebElement> subMenuCRM = driver.findElements(By.xpath(subMenuAppsString));
		System.out.println("The size of the list CRM is  --- "+subMenuCRM.size());
		Iterator< WebElement> itr = subMenuCRM.iterator();
		while(itr.hasNext()) {			
			//System.out.println(itr.next().getTagName());
			//System.out.println(itr.next().getText());
			getChildInnerText(itr.next(), driver);
			
		}				
		
	}//m
	
	public static void getChildInnerText(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = (String)js.executeScript("return arguments[0].firstChild.textContent;", element);
		// Below method returning null ...not working
		//String str = (String)js.executeScript("return arguments[0].childNodes[0].nodeValue;", element);
		System.out.println(str);
	}

}//e
