package org.course.selenium.elements;

import static org.testng.Assert.assertTrue;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.element.TextBoxPage;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest{
	
	@Test
	public void setWholeFIeldsTextBoxPageTest() {
	 TextBoxPage textBoxPage = homePage.goToElementsPage().clickOnTextBoxMenuItem();
	 textBoxPage.setFullName("Steve Tegue");
	 textBoxPage.setUserEmail("dezeropourhero@gmail.com");
	 textBoxPage.setCurrentAdress("9 rue");
	 textBoxPage.setCurrentAdress("chaponon");
	 textBoxPage.setCurrentAdress("Bron");
	 textBoxPage.clickSubmitButton();
	 String actualAdress = textBoxPage.getCurrentAdress();
	 String actualFullName = textBoxPage.getFullname();
	 assertTrue(actualFullName.contains("Tegue"));
	 assertTrue(actualAdress.contains("Bron"));
	}

}
