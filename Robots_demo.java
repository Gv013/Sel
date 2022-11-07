package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robots_demo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vasan\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_19f32o2up6_e&adgrpid=64607481971&hvpone=&hvptwo=&hvadid=486382369863&hvpos=&hvnetw=g&hvrand=2704165227587933072&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302586&hvtargid=kwd-297775402051&hydadcr=5650_2175716&gclid=Cj0KCQjw1vSZBhDuARIsAKZlijQnlhzcYKeMN6dCxg1EVeHVnye-hwyZFHvTQBMJiun6UWeQYkoQBWoaAq4IEALw_wcB");
		driver.manage().window().maximize();
		Actions m = new Actions(driver);
		Robot r = new Robot();
		WebElement mobile = driver
				.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
		m.contextClick(mobile).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement books = driver
				.findElement(By.xpath("//a[@href='/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books']"));
		m.contextClick(books).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement electronics = driver
				.findElement(By.xpath("//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']"));
		m.contextClick(electronics).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement fashion = driver
				.findElement(By.xpath("//a[@href='/gp/browse.html?node=6648217031&ref_=nav_cs_fashion']"));
		m.contextClick(fashion).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		String pw = driver.getWindowHandle();
		System.out.println(pw);

	}

}
