package org.course.selenium.basePage.demoqa.javascript.utility;

import java.util.Set;

import org.openqa.selenium.By;

public class GetUtility extends Utility {

	public static String getWindowsHandle() {
		return driver.getWindowHandle();
	}

	public static Set<String> getWindowsHandles() {
		return driver.getWindowHandles();
	}

	public static String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public static String getAttribute(By locator, String value) {
		return driver.findElement(locator).getAttribute(value);
	}
}
