package com.testng.basics;

import org.testng.annotations.Test;

public class DependendsOnMethod {
	
	@Test
	public void setUpBrowser() {
		System.out.println(" ------ Setup Browser -------");
	}
	
	@Test(dependsOnMethods="setUpBrowser")
	public void loginToFaceBook() {
		System.out.println(" ------ Login To FaceBook -------");
	}
	
	@Test(dependsOnMethods="loginToFaceBook")
	public void closeBrowser() {
		System.out.println(" ------ Close Browser -------");
	}
	

}
