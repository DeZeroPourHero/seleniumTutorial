package org.course.selenium.basePage.demoqa.javascript;

import org.course.selenium.basePage.BasePage;
import org.openqa.selenium.WebDriver;


public class Utility {
	public static WebDriver driver;
	
	public static void  setUtilityDriver() {
		driver = BasePage.driver;
	}
}
