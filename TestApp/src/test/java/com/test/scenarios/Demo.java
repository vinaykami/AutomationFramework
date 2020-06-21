package com.test.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Demo extends BaseClass {

	@Test(description = "launch google and search")
	public void googleSearch() {

		getDriver().get("https://www.google.com");
		getDriver().findElement(By.name("q")).sendKeys("oneplus 6T");
		getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
		getDriver().close();

	}

	@AfterClass
	public void tearDown() {

		getDriver().quit();
	}

	@Test
	public void dispay() {

		System.out.println("This is display method");
	}

}
