package com.testng.basics;

import org.testng.annotations.Test;

public class ExceptionAccept {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void infiniteLoop() {
		String str = "5" ;
	    int num = 10/0;
	}

}
