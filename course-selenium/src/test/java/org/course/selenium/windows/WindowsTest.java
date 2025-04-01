package org.course.selenium.windows;

import static org.course.selenium.basePage.demoqa.javascript.utility.GetUtility.getUrl;
import static org.testng.Assert.assertEquals;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.modaldialogsAlert.BrowserWindowsPage;
import org.course.selenium.modaldialogsAlert.NewTabpage;
import org.testng.annotations.Test;

public class WindowsTest extends BaseTest {
	
	@Test
	public void getNewTabMessage() {
		String expectedMessage = "This is a sample page";
		BrowserWindowsPage browserWindowsPage =  homePage.goToModalAlertDialogsPage().clickOnWindowsPage();
		NewTabpage newTabPage =  browserWindowsPage.clickOnNewTabButton();
		browserWindowsPage.switchToWindow();
		String actualMessage = newTabPage.getMessageOnNewTabPage();
		assertEquals(actualMessage, expectedMessage, "\n actual and expected message do not match \n");
	}
	
	@Test
	public void getNewWindowsUrlTest() {
		String expectedUrl = "https://demoqa.com/sample";
		BrowserWindowsPage browserWindowsPage = homePage.goToModalAlertDialogsPage().clickOnWindowsPage();
		browserWindowsPage.clickOnNewWindowButton();
		browserWindowsPage.switchToWindow();
		String actualUrl = getUrl();
		assertEquals(actualUrl, expectedUrl, "\n actual and expected message do not match \n");
	}
}
