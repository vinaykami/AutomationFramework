package com.test;

import org.testng.annotations.Test;

public class LoginPage {

	@Test(groups = { "smoke" })
	public void testMeth2() {

		System.out.println("Smoke test : User logged in successfully");
	}

	@Test(groups = { "regression" })
	public void regTest() {
		System.out.println("Regression test: User logged in successfully");
	}
}
