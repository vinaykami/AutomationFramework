package com.test.scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.test.utils.ProjectUtils;

public class Demo extends ProjectUtils {

	@Test(description = "launch google and search")
	public void googleSearch() {

		getDriver().get("https://www.bing.com");

		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		List<WebElement> links = getDriver().findElements(By.tagName("a"));

		System.out.println("No of links present in bing is: " + links.size());

	}

	@Test
	public void amazonTest() {

		getDriver().get("https://www.amazon.in/");

		getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerators");

		getDriver().findElement(By.xpath("//*[@id='nav-search-submit-text']/following-sibling::input")).click();

		WebDriverWait wait = new WebDriverWait(getDriver(), 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'refrigerator')]")));
		// click on the compose button as soon as the "compose" button is visible
		getDriver().findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();

	}

	@Test
	public void flipkartTest() {

		getDriver().get("https://www.amazon.in/");
		getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerators");
		getDriver().findElement(By.xpath("//*[@id='nav-search-submit-text']/following-sibling::input")).click();
	}

	@Test

	@AfterClass
	public void tearDown() {

		getDriver().quit();
	}

}
