package com.test;

import org.testng.annotations.Test;

public class LoginPage {
	@Test
	public void testMeth1() {

		System.out.println("this should not get executed");
	}

	@Test(groups={"smoke"})
	public void testMeth2() {

		System.out.println("User logged in successfully");
	}

	public void normalMethod(){
		
		System.out.println("this is normal method");
	}
}
