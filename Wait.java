package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		for (WebElement data : findElements) {
			System.out.println(data.getText());
		}
	//Implicit
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MICROSECONDS);
	//Explicit
		@SuppressWarnings("unused")
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
	}
}
