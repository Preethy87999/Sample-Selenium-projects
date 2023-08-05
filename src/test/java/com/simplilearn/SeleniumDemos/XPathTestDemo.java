package com.simplilearn.SeleniumDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathTestDemo {

	@Test
public void testCheckBoxByXPath() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		driver.get("https://test.qatechhub.com/form-elements/");
		driver.findElement(By.xpath("//*[@id=\"wpforms-49-field_3_2\"]")).click();
        */
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
		
		String expUrl="https://www.amazon.in/events/greatsummersale/?ref_=nav_cs_gb";
		String actUrl= driver.getCurrentUrl();
		
		Assert.assertEquals(actUrl, expUrl);
		//driver.quit();
	
	}
}
