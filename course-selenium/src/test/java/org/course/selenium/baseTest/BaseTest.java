package org.course.selenium.baseTest;


import static org.course.selenium.basePage.demoqa.javascript.JavaScriptUtility.*;
import static org.course.selenium.basePage.BasePage.*;

import org.course.selenium.HomePage;
import org.course.selenium.basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
	private WebDriver driver;
	protected BasePage basePage;
	protected HomePage homePage;
	private static final String URL = "https://demoqa.com/";
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@BeforeMethod
	public void loadApplication() {
		driver.get(URL);
		BasePage basePage = new BasePage();
		basePage.setWebdriver(driver);
		setUtilityDriver();
		homePage = new HomePage();
	}

	@AfterClass
	public void tearDown() {
		delay(2000);
		driver.quit();
	}
}
