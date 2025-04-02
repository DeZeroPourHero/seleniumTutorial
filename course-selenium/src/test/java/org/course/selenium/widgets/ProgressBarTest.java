package org.course.selenium.widgets;

import static org.testng.Assert.assertEquals;

import org.course.selenium.baseTest.BaseTest;
import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{
	
	@Test
	public void testProgressBar() {
	  ProgressBarPage progressBarPage = homePage.goToWidgetsPage().clickOnProgressBarMenu();
	  String expectedPourcentage = "100%";
	  progressBarPage.clickOnStartButton();
	  String actualPourcentage = progressBarPage.getProgressValue("100", 30);
	  assertEquals(actualPourcentage, expectedPourcentage,"\n Value is Not  100% \n");
	}
}
