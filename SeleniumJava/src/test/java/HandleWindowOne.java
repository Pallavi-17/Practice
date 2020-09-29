
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleWindowOne {
 static WebDriver driver;

 @Test
 public void test_CloseAllWindowsExceptMainWindow() {
  driver = new FirefoxDriver();
  // It will open Naukri website with multiple windows
  driver.get("http://www.naukri.com/");
  
  // To get the main window handle
  String windowTitle= getCurrentWindowTitle();
  String mainWindow = getMainWindowHandle(driver);
  Assert.assertTrue(closeAllOtherWindows(mainWindow));
  Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"), "Main window title is not matching");
 }
  
 public String getMainWindowHandle(WebDriver driver) {
  return driver.getWindowHandle();
 }

 public String getCurrentWindowTitle() {
  String windowTitle = driver.getTitle();
  return windowTitle;
 }
 
 //To close all the other windows except the main window.
 public static boolean closeAllOtherWindows(String openWindowHandle) {
  Set allWindowHandles = driver.getWindowHandles();
  Iterator itr = allWindowHandles.iterator();
  
  while(itr.hasNext()) {
	  String currentWindowHandle = ((String)itr.next());
	  if (!currentWindowHandle.equals(openWindowHandle)) {
		    driver.switchTo().window(currentWindowHandle);
		    driver.close();
	  }	  
	  
  }
 
  
  
  driver.switchTo().window(openWindowHandle);
  if (driver.getWindowHandles().size() == 1)
   return true;
  else
   return false;
 }
}
