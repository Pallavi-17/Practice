package com.testng.basics;

import org.testng.annotations.Test;

public class ExecutionOrderByAlphabet {

	 @Test
	  public void cMethod() {
		  
		  System.out.println("Method C");
	  }
	 
	 @Test
	  public void bMethod() {
		  
		  System.out.println("Method B");
	  }
	 
	 @Test
	  public void aMethod() {
		  
		  System.out.println("Method A");
	  }
	 
	 @Test
	  public void AMethod() {
		  
		  System.out.println("Method A Capital");
	  }
	 
	 @Test
	  public void methoda() {
		  
		  System.out.println("Method a small");
	  }
	
	
}
