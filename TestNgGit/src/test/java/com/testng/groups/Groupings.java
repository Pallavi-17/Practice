package com.testng.groups;

import org.testng.annotations.Test;

public class Groupings {
	
	 @Test(groups="Login")
	  public void cMethod() {
		  
		  System.out.println("Method C");
	  }
	 
	 @Test(groups="Registration")
	  public void bMethod() {
		  
		  System.out.println("Method B");
	  }
	 
	 @Test(groups="forgotPassword")
	  public void aMethod() {
		  
		  System.out.println("Method A");
	  }
	 
	 @Test(groups="forgotPassword")
	  public void dMethod() {
		  
		  System.out.println("Method D");
	  }
	 
	 @Test(groups="Login")
	  public void eMethod() {
		  
		  System.out.println("Method E");
	  }
	 
	 @Test(groups="forgotPassword")
	  public void fMethod() {
		  
		  System.out.println("Method F");
	  }
	 
	 
	 @Test(groups= {"Login","forgotPassword"})
	 public void testMethod() {
		 System.out.println("Method Test");
	 }
	 

}
