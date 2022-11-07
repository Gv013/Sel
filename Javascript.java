package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486382369863&hvpos=&hvnetw=g&hvrand=2704165227587933072&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302586&hvtargid=kwd-297775402051&hydadcr=5650_2175716&gclid=Cj0KCQjw1vSZBhDuARIsAKZlijQnlhzcYKeMN6dCxg1EVeHVnye-hwyZFHvTQBMJiun6UWeQYkoQBWoaAq4IEALw_wcB");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//exact scroll down syntax
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Instagram']"));
		js.executeScript("arguments[0].scrollIntoView();", findElement);
		//approximate scroll down
		js.executeScript("window.scrollBy(0, 4000);");
		
		 
	}

}
