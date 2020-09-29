package com.testng.basics;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=10000, invocationTimeOut=1000)
	public void runLoop() {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

}
