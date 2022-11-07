package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.facebook.com/login/");
		web.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) web; // Narrowing type casting
		File start = ts.getScreenshotAs(OutputType.FILE);
		File last = new File("C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Screenshot\\img.png"); // the last img.png
																									// is file format
		FileUtils.copyFile(start, last);

		web.quit();

	}
}
