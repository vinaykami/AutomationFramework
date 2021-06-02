package com.test;

import org.testng.annotations.Test;

public class RegistrationPage {

	@Test(groups={"smoke"})
	public void testSample() {

		System.out.println("This is smoke test from Sample Test class");
	}
	
	@Test(groups={"smoke"})
	public void registration(){
		
		System.out.println("User registered successfully");
	}
}
