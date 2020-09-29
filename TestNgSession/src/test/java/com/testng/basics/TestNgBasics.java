package com.testng.basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	//pre condition annotations -- starting with @Before
	
	
	@BeforeSuite
	public void method() {
		System.out.println("------ Before SUITE ------");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("------ BEFORE TEST ------");
	}
	
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("------ BEFORE CLASS ------");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("------ BEFORE METHOD ------");
	}
	
	@Test
	public void facebookTitleTest() {
		System.out.println("------ TEST 1 -----");
	}
	
	@Test
	public void facebookWallTest() {
		System.out.println("------ TEST 2 -----");
	}
	
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("------ AFTER METHOD ------");
	}
	
	@AfterClass
	public void afterClassTest() {
		System.out.println("------ AFETR CLASS ------");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("------ AFTER  TEST------");
	}
	
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("------ AFTER SUITE ------");
	}
	

}
