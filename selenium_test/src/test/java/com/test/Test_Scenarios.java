package com.test;

import org.junit.Test;

public class Test_Scenarios {

	@Test
	private void sampleTest() {
		// TODO Auto-generated method stub

		System.out.println("added this for test");

		for (int i = 0; i < 5; i++) {

			System.out.println("hello world!");
		}

	}
	
	// added test comments

	@Test
	public void simpleAddMethod() {

		addition(10, 20);
	}

	public int addition(int a, int b) {

		int c = a + b;

		return c;

	}

	public int substraction(int a, int b) {

		int c = a - b;
		return c;
	}

	public int mutliply(int a, int b) {

		int c = a * b;

		return c;
	}
	
	public int division(int a, int b) {

		int c = a / b;

		return c;
	}
}
