package org.course.selenium.basePage.demoqa.javascript.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility{
	
	public static void scroolToElementJs(By locator) {	
		WebElement element = driver.findElement(locator);
		String jsScript = "arguments[0].scrollIntoView();";
		((JavascriptExecutor)driver).executeScript(jsScript, element);	
	}
	
	public static void clickJsElement(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}
}
