package com.simplilearn.SeleniumDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAndAlertHandling {

	ChromeDriver driver;
	
public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
}
	
	public void clickTryItButton() {
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		System.out.println("Title is : "+driver.getTitle());
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert Text: "+ alertText);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		alert.accept();
		
		driver.switchTo().defaultContent();
		System.out.println("Title : "+driver.getTitle());
		System.out.println("URL : "+driver.getCurrentUrl());
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}


}
