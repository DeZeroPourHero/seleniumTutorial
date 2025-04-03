package org.course.selenium.basePage.demoqa.javascript.utility;

import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.scroolToElementJs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility{
	
	private static WebDriver.TargetLocator switchTo(){
	  return driver.switchTo();
	}
	
	public static String getAlertText() {
		return switchTo().alert().getText();
	}
	
	public static void acceptAlert() {
		switchTo().alert().accept();
	}
	
	public static void refusedAlert() {
		switchTo().alert().dismiss();
	}
	
	public static void fillAlert(String message) {
		switchTo().alert().sendKeys(message);
	}
	
	public static void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchToFrameByWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void switchToFrameByName(String name) {
		driver.switchTo().frame(name);
	}
	
	public static void switchToDefaultContent() {
		switchTo().defaultContent();
	}
	
	public static void switchToHandle(String handle) {
		driver.switchTo().window(handle);
	}
}
