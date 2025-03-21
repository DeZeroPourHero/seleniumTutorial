package org.course.selenium.elements;

import static org.testng.Assert.assertTrue;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.element.LinksPage;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest{
	
	@Test
	public void badRequestStatus() {
		String badRequestLink = "bad-request";
		LinksPage linksPage = homePage.goToElementsPage().clickLinksPage();
		linksPage.clickOnlink(badRequestLink);
	    String actualResponseMessage = linksPage.getLinkResponse();
		assertTrue(actualResponseMessage.contains("400") && actualResponseMessage.contains("Bad Request"));
	}

}
