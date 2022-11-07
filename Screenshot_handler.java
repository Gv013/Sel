package com.selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_handler {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.facebook.com/login/");
		web.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) web;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Screenshot\\img.png");
		org.openqa.selenium.io.FileHandler.copy(from, to);

	}

}
