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
	
	@Test
	public void acceptConfirmationMessageTest() {
	  PraticeAlert pratice = homePage.goToModalAlertDialogsPage().clickOnAlertItem();
	  pratice.clickConfirmButton();
	  acceptAlert();
	  String messageConfirmationAlertActual = pratice.getMessageConfirmation();
	  String messageConfirmationAlertExpected = "You selected Ok";
	  assertEquals(messageConfirmationAlertActual, messageConfirmationAlertExpected, "\n actual and expected messages do not  match \n");
	}
	
	@Test
	public void refusedConfirmationMessageTest() {
	  PraticeAlert pratice = homePage.goToModalAlertDialogsPage().clickOnAlertItem();
	  pratice.clickConfirmButton();
	  refusedAlert();
	  String messageRefusedAlertActual = pratice.getMessageConfirmation();
	  String messageRefusedAlertExpected = "You selected Cancel";
	  assertEquals(messageRefusedAlertActual, messageRefusedAlertExpected, "\n actual and expected messages do not  match \n");
	}
	
	@Test
	public void acceptedConfirmationPromptAlertTest() {
	  PraticeAlert pratice = homePage.goToModalAlertDialogsPage().clickOnAlertItem();
	  pratice.clickPromptAlert();
	  fillAlert("steve");
	  acceptAlert();
	  String messageAcceptedPromptAlertActual = pratice.getMessagePromptAlert();
	  String messageAcceptedPromptAlertExpected = "You entered steve";
	  assertEquals(messageAcceptedPromptAlertActual, messageAcceptedPromptAlertExpected, "\n actual and expected messages do not  match \n");
	}

}
