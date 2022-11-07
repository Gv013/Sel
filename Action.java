package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	driver.manage().window().maximize();
	//WebElement findElement= driver.findElement(By.xpath("//a[@data-pid='2']"));
	Actions a = new Actions(driver);
	//a.click(findElement).build().perform();
	//a.contextClick(findElement).build().perform();
	
	WebElement drag= driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement drop = driver.findElement(By.id("droppable"));
	a.dragAndDrop(drag, drop).build().perform();
	
	
	
}
}
