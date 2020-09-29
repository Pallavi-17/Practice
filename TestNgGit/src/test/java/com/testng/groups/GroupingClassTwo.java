package com.testng.groups;

import org.testng.annotations.Test;

public class GroupingClassTwo {
	
	 @Test(groups="Registration")
	  public void xxxMethod() {
		  
		  System.out.println("Method xxx");
	  }
	 
	 @Test(groups="Login")
	  public void zzzMethod() {
		  
		  System.out.println("Method zzz");
	  }
	 
	 @Test(groups="forgotPassword")
	  public void yyyMethod() {
		  
		  System.out.println("Method yyy");
	  }

}
