package com.test.utils;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getDriver() {

		if (driver != null) {
			return driver;
		} else {
			return new TestEnvironment().getDriver();
		}
	}

}
