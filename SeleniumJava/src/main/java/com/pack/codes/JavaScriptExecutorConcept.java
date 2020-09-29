package com.pack.codes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorConcept {
	
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D:/drivers/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.freecrm.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement loginLink = driver.findElement(By.xpath("//span[text()='Log In']"));
		WebElement loginLink = driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']"));
		//loginLink.click();		
		//flash(loginLink, driver); // highlight element
		drawBorder(loginLink, driver);
		System.out.println(" The link text is ----" + loginLink.getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebElement link = driver.findElement(By.linkText("Log In"));  ????
		//System.out.println(" The link text now ----  " + link.getText());
		//loginLink.click();		

	}//m
	
	public static void flash(WebElement element, WebDriver driver ) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println("BGColor  "+ bgcolor);
		for(int i=0; i<100; i++) {
			changeColor("rgb(152, 46, 158)", element, driver);
			changeColor(bgcolor, element, driver);
		}
		
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
	}
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid green'", element);
	}
	

}









