package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		WebElement findelement= driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s = new Select(findelement);
		s.selectByValue("5");
		Thread.sleep(3000);
		s.selectByVisibleText("Apr");
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		driver.quit();
		
	}

}
