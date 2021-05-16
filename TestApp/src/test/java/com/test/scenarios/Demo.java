package com.test.scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.test.utils.ProjectUtils;

public class Demo extends ProjectUtils {

	@Test(description = "launch google and search")
	public void googleSearch() {

		getDriver().findElement(By.name("q")).sendKeys("oneplus 6T");
		getDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);

		System.out.println();
	}

}
