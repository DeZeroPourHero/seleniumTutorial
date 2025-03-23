package org.course.selenium.screenshot;

import static org.testng.Assert.assertTrue;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.form.PraticeFormPage;
import org.testng.annotations.Test;

public class ScreenshotTest extends BaseTest{
	
	@Test
	public void testClickingFemaleRadioButtonWhithoutScrool() {
		PraticeFormPage praticeFormPage =  homePage.goToFormsPage().clickPraticeForm();
		praticeFormPage.clickFemaleRadioButtonForScreenshot();
		assertTrue(praticeFormPage.isFemaleRadioButton());
	}
}
