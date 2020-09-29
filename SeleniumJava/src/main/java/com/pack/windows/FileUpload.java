package com.pack.windows;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// input type=File then it will work very important
		driver.findElement(By.name("fileupload")).sendKeys("D:/GIT_Session/xpath_Strings.txt");
		
	}

}
