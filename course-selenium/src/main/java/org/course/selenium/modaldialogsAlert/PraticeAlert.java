package org.course.selenium.modaldialogsAlert;

import org.openqa.selenium.By;

public class PraticeAlert extends ModalDialogsAlertPage {
	
	private By alertButton = By.id("alertButton");
	
	public void clickAlertButton() {
		clickElement(alertButton);
	}

}
