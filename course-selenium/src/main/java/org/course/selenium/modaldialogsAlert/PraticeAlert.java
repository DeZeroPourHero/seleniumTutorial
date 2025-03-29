package org.course.selenium.modaldialogsAlert;

import org.openqa.selenium.By;

public class PraticeAlert extends ModalDialogsAlertPage {
	
	private By alertButton = By.id("alertButton");
	private By confirmButton = By.id("confirmButton");
	private By confirmationResult = By.id("confirmResult");
	private By promptAlert = By.id("promtButton");
	private By promptResult = By.id("promptResult");
	
	public void clickAlertButton() {
		clickElement(alertButton);
	}
	
	public void clickConfirmButton() {
		clickElement(confirmButton);
	}
	
	public String getMessageConfirmation() {
		return getMessageByLocator(confirmationResult);
	}

	public void clickPromptAlert() {
		 clickElement(promptAlert);
	}
	
	public String getMessagePromptAlert() {
		return getMessageByLocator(promptResult);
	}

}
