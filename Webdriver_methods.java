package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver site = new ChromeDriver();
		site.get("https://www.facebook.com/");
		String current = site.getCurrentUrl();
		System.out.println(current);
		String title = site.getTitle();
		System.out.println(title);
	}

}
