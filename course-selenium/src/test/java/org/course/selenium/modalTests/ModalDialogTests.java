package org.course.selenium.modalTests;

import static org.testng.Assert.assertTrue;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.modaldialogs.PraticeModalDialogs;
import org.testng.annotations.Test;

import junit.framework.Assert;
public class ModalDialogTests extends BaseTest{
	
	@Test
	public void messageSmallModalTest() {
	 PraticeModalDialogs praticeModalDialogs = homePage.goToModalDialogsPage().clickOnModalDialogsItem();
	 praticeModalDialogs.clickOnSmallModalButton();
	 String actualMessageOnSmallModal = praticeModalDialogs.getMessageOnSmallModalButton();
	 String expectedMessage = "small modal";
	 praticeModalDialogs.clickOncloseSmallModalButton();
	 assertTrue(actualMessageOnSmallModal.contains(expectedMessage), "the two messages don't match");
	}

}
