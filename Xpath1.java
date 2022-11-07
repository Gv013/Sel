package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath1 {

	public static void browser_launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://myntra.com");

		driver.manage().window().maximize();

		WebElement men = driver.findElement(By.linkText("Men"));

		Actions hover = new Actions(driver);

		hover.moveToElement(men).build().perform();

		WebElement Tshirt = driver.findElement(By.linkText("T-Shirts"));

		Tshirt.click();

		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='product-price']"));

		System.out.println(findElements.size());

		for (WebElement list1 : findElements) {

			System.out.println("Number of tshirts" + list1.getText());

		}
	}

	public static void main(String[] args) {

		browser_launch();

	}

}
