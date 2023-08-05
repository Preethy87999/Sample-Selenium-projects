package com.simplilearn.SeleniumDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsIdentifiers {

	@Test
	public void testLocators() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("John@example.com");
		driver.findElement(By.name("email")).sendKeys("John@example.com");
		
		//driver.findElement(By.id("pass")).sendKeys("john123");
		driver.findElement(By.name("pass")).sendKeys("john123");
		
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.tagName("button")).click();
		
		//driver.quit();
		
	}
	
	@Test
	public void testLinks() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Mobiles")).click();
		//driver.findElement(By.partialLinkText("Cust")).click();
		
		driver.quit();
		
	}
}
