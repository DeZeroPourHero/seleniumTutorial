package org.course.selenium.basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	public static WebDriver driver; 
	
	public void setWebdriver(WebDriver driver) {
		BasePage.driver = driver;
	}
	
	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}
	
	protected void fillElement(By locator, String text) {
		WebElement element = find(locator);
		element.clear();
		element.sendKeys(text);
	}
	
	
	protected void clickElement(By locator) {
		find(locator).click();
	}
	
	public static void delay(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
