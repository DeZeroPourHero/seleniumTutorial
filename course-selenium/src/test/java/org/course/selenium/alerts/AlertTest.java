package org.course.selenium.alerts;

import static org.course.selenium.basePage.demoqa.javascript.utility.SwitchToUtility.*;
import static org.testng.Assert.assertEquals;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.modaldialogsAlert.PraticeAlert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest{
	
	@Test
	public void messageAlertTest() {
	  PraticeAlert pratice = homePage.goToModalAlertDialogsPage().clickOnAlertItem();
	  pratice.clickAlertButton();
	  String messageAlertActual = getAlertText();
	  acceptAlert();
	  String messageAlertExpected = "You clicked a button";
	  assertEquals(messageAlertActual, messageAlertExpected, "\n actual and expected messages do not  match \n");
	}

}
