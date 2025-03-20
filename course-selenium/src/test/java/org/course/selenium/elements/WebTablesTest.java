package org.course.selenium.elements;

import org.course.selenium.baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest{
	
	@Test
	public void updateAgeOnWebTables() {
		var email = "alden@example.com";
		var actualAge = "39";
		var webTablesPage =  homePage.goToElementsPage().clickWebTables();
		webTablesPage.clickEdit(email);
		webTablesPage.setAge(actualAge);
		webTablesPage.submitWebTablesPage();
		webTablesPage.getAge(email);
		String expectedAge = actualAge;
		Assert.assertEquals(actualAge, expectedAge, "Actual age and expectedAge do not match");
	}

}
