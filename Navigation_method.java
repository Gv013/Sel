package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_method {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://www.facebook.com/login/");
		web.manage().window().maximize();
		Thread.sleep(3000);
		web.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		web.navigate().back();
		Thread.sleep(3000);
		web.navigate().refresh();
		Thread.sleep(3000);
		web.navigate().forward();
		Thread.sleep(3000);
		web.navigate().to("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fwelcome");
		Thread.sleep(3000);
		web.navigate().to("https://youtube.com");
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) web; // Narrowing type casting
		File start = ts.getScreenshotAs(OutputType.FILE);
		File last = new File("C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Screenshot\\img.png"); // the last img.png
																									// is file format
		FileUtils.copyFile(start, last);
		web.navigate().back();
		Thread.sleep(3000);

		web.quit();

	}

}
