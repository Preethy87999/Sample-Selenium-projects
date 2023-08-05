package com.simplilearn.SeleniumDemos;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScreenshot {
            ChromeDriver driver;
            @Test
	public void runScreen() throws Exception{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.simplilearn.com/");
		
		ScreenShotControl control = new ScreenShotControl(driver);
		String file_name = "original.png";
        File file = new File(file_name);
        System.out.println(file.getCanonicalPath());
		//control.captureAndSaveScreenshot("/home/vspreethi823gmail/Pictures/testScreen.png");
		driver.close();
	}
}
