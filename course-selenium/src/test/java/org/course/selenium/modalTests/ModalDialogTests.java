package org.course.selenium.modalTests;

import static org.testng.Assert.assertTrue;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.modaldialogsAlert.PraticeModalDialogs;
import org.testng.annotations.Test;
public class ModalDialogTests extends BaseTest{
	
	@Test
	public void messageSmallModalTest() {
	 PraticeModalDialogs praticeModalDialogs = homePage.goToModalAlertDialogsPage().clickOnModalDialogsItem();
	 praticeModalDialogs.clickOnSmallModalButton();
	 String actualMessageOnSmallModal = praticeModalDialogs.getMessageOnSmallModalButton();
	 String expectedMessage = "small modal";
	 praticeModalDialogs.clickOncloseSmallModalButton();
	 assertTrue(actualMessageOnSmallModal.contains(expectedMessage), "the two messages don't match");
	}

}
