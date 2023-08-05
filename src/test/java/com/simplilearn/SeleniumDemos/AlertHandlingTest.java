package com.simplilearn.SeleniumDemos;

import org.testng.annotations.Test;

public class AlertHandlingTest {

	@Test
	public void verifyAlerts() {
		FrameAndAlertHandling fa = new FrameAndAlertHandling();
		fa.openBrowser();
		fa.clickTryItButton();
		//fa.closeBrowser();
	}
}
