package com.testng.listener.screenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" Test FAILED Take a screen shot  ");
		failed(result.getMethod().getMethodName());
		System.out.println("Class Name - "+ result.getTestClass().getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
	
	

}
