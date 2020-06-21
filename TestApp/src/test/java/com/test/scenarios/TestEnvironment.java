package com.test.scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestEnvironment {

	private static WebDriver driver = null;

	public static String browser = "chrome";

	public WebDriver getDriver() {

		if (driver == null)
			initDriver();

		return driver;

	}

	private void initDriver() {

		try {
			if (System.getProperty("os.name").contains("Mac OS X")) {

				if (browser.equalsIgnoreCase("CHROME")) {

					System.setProperty("webdriver.chrome.driver", System.getProperty("user.home")
							+ "/.m2/repository/org/seleniumhq/selenium/chromedriver/77.0.3865.40/chromedriver-77.0.3865.40-mac64.bin");

					driver = new ChromeDriver();

				} else if (browser.equalsIgnoreCase("IE")) {

					System.setProperty("webdriver.chrome.driver", "./drivers/mac/chromedriver");

					driver = new InternetExplorerDriver();

				} else if (browser.equalsIgnoreCase("SAFARI")) {

					System.setProperty("webdriver.chrome.driver", "./drivers/mac/chromedrivermac64.bin");

					driver = new SafariDriver();

				} else {

					throw new Exception(browser + " browser not Found");
				}

			} else if (System.getProperty("os.name").contains("Widows")) {

				System.setProperty("webdriver.chrome.driver", "./drivers/mac/chromedriver.exe");

			} else if (System.getProperty("os.name").contains("Linux")) {

				System.setProperty("webdriver.chrome.driver", "./drivers/mac/chromedriver");

			} else {

				throw new Exception("Driver cannot be instantiated");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot be instantiated");
		}

	}

}
