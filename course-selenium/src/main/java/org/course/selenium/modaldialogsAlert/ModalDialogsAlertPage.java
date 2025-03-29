package org.course.selenium.modaldialogsAlert;

import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.scroolToElementJs;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class ModalDialogsAlertPage extends HomePage{
	
	private By modalDialogsItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
	private By alertItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
	
	public PraticeModalDialogs clickOnModalDialogsItem() {
		scroolToElementJs(modalDialogsItem);
		clickElement(modalDialogsItem);
		return new PraticeModalDialogs();
	}
	
	public PraticeAlert clickOnAlertItem() {
		scroolToElementJs(alertItem);
		clickElement(alertItem);
		return new PraticeAlert();
	}

}
