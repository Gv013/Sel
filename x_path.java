package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class x_path {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/Login");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@data-uia='login-field']"));
		email.sendKeys("vasanth");
		WebElement password = driver.findElement(By.xpath("//input[@autocomplete='password']"));
		password.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();

	}

}
