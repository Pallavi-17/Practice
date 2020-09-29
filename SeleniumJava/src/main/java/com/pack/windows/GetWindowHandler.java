package com.pack.windows;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/");
		
		WebElement popWindowElement = driver.findElement(By.xpath("//a[text()='Come & Go Test']"));
		popWindowElement.click();
		
		Set<String> windowsSet = driver.getWindowHandles();
		Iterator<String> itr = windowsSet.iterator();
		
//		while(itr.hasNext()) {
//			String tab = (String)itr.next();
//			System.out.println(tab);
//			
//		}
		// 2543112163521B078933B138BEC2B8D8
		String parentWindow = itr.next();
		System.out.println("Parent window ID  "+ parentWindow);
				
		String childWindow = itr.next();
		System.out.println("Parent window ID  "+ childWindow);
		
		driver.switchTo().window(childWindow);
		System.out.println(" Child Window Title  " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindow);
		System.out.println(" Parent Window Title  " + driver.getTitle());
		driver.close();
		
		
		
		
		
	}//m
			
}//e
