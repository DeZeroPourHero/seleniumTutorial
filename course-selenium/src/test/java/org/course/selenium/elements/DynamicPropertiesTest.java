package org.course.selenium.elements;

import static org.testng.Assert.assertEquals;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.element.DynamicPropertiesPage;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BaseTest{
	
	@Test
	public void MessageEnableAfterButtonTest() {
	     String expectedMessageEnableAfterButton = "Will enable 5 seconds";
	     DynamicPropertiesPage dynamicPropertiesPage = homePage.goToElementsPage().clickDynamicPropertiesMenuItem();
	     String actualMessageEnableAfterButton = dynamicPropertiesPage.getMessageEnableAfterButton();
	     assertEquals(actualMessageEnableAfterButton, expectedMessageEnableAfterButton,"\n this two messages do not match");
	     
	}

}
