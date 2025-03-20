package org.course.selenium.baseTest.javascript.forms;

import static org.testng.Assert.assertTrue;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.form.PraticeFormPage;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest{
	
	@Test
	public void testCheckboxSportsIsSelected() {
		PraticeFormPage praticeFormPage=  homePage.goToFormsPage().clickPraticeForm();
		praticeFormPage.clickCheckboxSport();
		boolean isCheckboxSport = praticeFormPage.isCheckboxSports();
		assertTrue(isCheckboxSport);
	}

}
