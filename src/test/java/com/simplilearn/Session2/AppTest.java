package com.simplilearn.Session2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	@Test
	public void learningWebDriverCommands() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.simplilearn.com/");
		String expectedTitle="Simplilearn | Online Courses - Bootcamp & Certification Platform";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.navigate().to("https://test.qatechhub.com/");
		driver.navigate().back();
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://www.simplilearn.com/");
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String currentUrlAfterRefresh = driver.getCurrentUrl();
		Assert.assertEquals(currentUrlAfterRefresh, "https://test.qatechhub.com/");
		//driver.quit();
		
	}
}
