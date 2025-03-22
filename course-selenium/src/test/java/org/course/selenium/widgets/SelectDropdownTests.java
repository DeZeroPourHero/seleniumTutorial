package org.course.selenium.widgets;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.course.selenium.baseTest.BaseTest;
import org.testng.annotations.Test;

public class SelectDropdownTests extends BaseTest{
	
	@Test
	public void testMultiSelectDropDown() {
		var selectMenuPage = homePage.goToWidgetsPage().clickOnSelectMenu();
		selectMenuPage.selectStandardMulti("Volvo");
		selectMenuPage.selectStandardMulti(1);
		selectMenuPage.selectStandardMulti(3);
		selectMenuPage.deselectStandardMulti("saab");
		List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
		assertTrue(actualSelectedOptions.contains("Volvo") && actualSelectedOptions.contains("Audi"));
		assertFalse(actualSelectedOptions.contains("saab"));
			
	}
}
