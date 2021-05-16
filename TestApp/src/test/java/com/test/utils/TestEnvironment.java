package com.test.utils;

import java.io.FileReader;
import java.util.Properties;

public class TestEnvironment {

	public String browser;

	public String baseURL;

	public TestEnvironment() {

	}

	public static String getProperty(String propertyKey) {
		String returnVal = null;

		FileReader reader;
		try {
			reader = new FileReader("./config.properties");
			Properties p = new Properties();
			p.load(reader);
			returnVal = p.getProperty(propertyKey);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

		return returnVal;
	}

}
