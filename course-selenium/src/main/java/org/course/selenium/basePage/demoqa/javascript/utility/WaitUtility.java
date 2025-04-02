package org.course.selenium.basePage.demoqa.javascript.utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility extends Utility{
	
	public static void explicitWaitUntilVisible(By locator, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void fluentWaitUntilVisible(By locator, int seconds) {
		FluentWait fluentWait = new FluentWait(driver).withTimeout(Duration.ofSeconds(seconds)).pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class,StaleElementReferenceException.class);
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));		
	}
}
