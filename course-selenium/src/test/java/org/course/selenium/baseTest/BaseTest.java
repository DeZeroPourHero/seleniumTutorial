package org.course.selenium.baseTest;

import static org.course.selenium.basePage.BasePage.*;
import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.io.FileHandler;

import org.course.selenium.HomePage;
import org.course.selenium.basePage.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
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
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@BeforeMethod
	public void loadApplication() {
		driver.get(URL);
		BasePage basePage = new BasePage();
		basePage.setWebdriver(driver);
		setUtilityDriver();
		homePage = new HomePage();
	}

	@AfterMethod
	public void takeFailedResultScreenshot(ITestResult testResult) {
		if (ITestResult.FAILURE == testResult.getStatus()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File destination = new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/("+ 
			                             java.time.LocalDate.now()+ testResult.getName()+ ".png");
			try {
				  FileHandler.copy(source, destination);
			}catch (IOException e) {
				throw new RuntimeException();
			}
		}
		
	}

	@AfterClass
	public void tearDown() {
		delay(2000);
		driver.quit();
	}
}
