package com.pack.codes;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorConceptTwo {
	
	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.freecrm.com");
		WebElement loginLink = driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']"));
		WebElement bottomText = driver.findElement(By.xpath("//h6[text()='Free CRM for every business']"));
		drawBorder(loginLink, driver);
		Thread.sleep(10000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("D:/sql_workspace/SeleniumJava/element.png"));
		generateAlert("There is an issue check database", driver);
		Alert alert = driver.switchTo().alert();
		alert.accept();//alert.dismiss(); alert.getText();
		//alert.sendKeys("Hello");
		Thread.sleep(2000);
		//clickElementByJS(loginLink, driver);
		System.out.println(getTitle(driver));
		System.out.println(getPageInnerText(driver));
		//scrollIntoView(bottomText, driver);
		scrollPageDown(driver);
		
		
	}//m
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid green'", element);
	}
	
	 public static void generateAlert(String message, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("alert('"+message+"')");

	 }
	 
	 public static void clickElementByJS(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].click();", element);
	    	
	 }

	 public static void refreshBrowser(WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("history.go(0)");
	 }
	 
	 public static String getTitle(WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 String title = js.executeScript("return document.title;").toString();
		 return title;
	 }
	 
	 
	 public static String getPageInnerText(WebDriver driver) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 String pageInnerText = js.executeScript("return document.documentElement.innerText;").toString();
		 return pageInnerText;
	 }
	 
	 public static void scrollPageDown(WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    }
	    
	    public static void scrollIntoView(WebElement element, WebDriver driver){
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	    	js.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	 
}
