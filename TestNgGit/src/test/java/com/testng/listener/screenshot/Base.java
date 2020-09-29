package com.testng.listener.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "d:/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.orangehrm.com/orangehrm-30-day-trial/");
	}
	
	public void failed(String methodName) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String fPath = "D:/sql_workspace/TestNgSession/src/test/java/com/testng/listener/screenshots/testFailure.jpg";
		String fPath = "D:/sql_workspace/TestNgSession/src/test/java/com/testng/listener/screenshots/"
		+ methodName +
		".jpg";
		try {
			 FileUtils.copyFile(srcFile, new File(fPath));
		} catch(IOException ioex) {
			ioex.printStackTrace();
		}
	}

}
