package com.test;

import org.testng.annotations.Test;

public class RegistrationPage {

	@Test(groups = { "smoke" })
	public void registration() {

		System.out.println("Smoke test: User registered successfully");
	}

	@Test(groups = { "regression" })
	public void regTest() {

		System.out.println("Regression test: user registered successfully");
	}
}
