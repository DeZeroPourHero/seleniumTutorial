package org.course.selenium.baseTest.javascript.forms;

import static org.testng.Assert.assertTrue;

import org.course.selenium.baseTest.BaseTest;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{
	
	@Test
	public void testRadioButton() {
		var formsPage = homePage.goToFormsPage().clickPraticeForm();
		formsPage.clickFemaleRadioButton();
		boolean isFemaleRadioButtonSelected = formsPage.isFemaleRadioButton();
		assertTrue(isFemaleRadioButtonSelected);
	}

}
