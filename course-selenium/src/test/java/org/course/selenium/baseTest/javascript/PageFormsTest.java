package org.course.selenium.baseTest.javascript;

import static org.testng.Assert.assertTrue;

import org.course.selenium.FormPage;
import org.course.selenium.baseTest.BaseTest;
import org.testng.annotations.Test;

public class PageFormsTest extends BaseTest{
	

	@Test
	public void testPageFormsTitle() {
		FormPage formsPage = homePage.goToFormsPage();
		assertTrue(formsPage.getFormsTitle().contains("Form"));
	}

}
