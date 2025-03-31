package org.course.selenium.modaldialogsAlert;

import static org.course.selenium.basePage.demoqa.javascript.utility.SwitchToUtility.*;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class ModalDialogsAlertPage extends HomePage{
	
	private By modalDialogsItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
	private By alertItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
	private By frameMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
	
	public PraticeModalDialogs clickOnModalDialogsItem() {
		clickItemMenu(modalDialogsItem);
		return new PraticeModalDialogs();
	}
	
	public PraticeAlert clickOnAlertItem() {
		clickItemMenu(alertItem);
		return new PraticeAlert();
	}
	
	public FramesMenuPage clickOnFramesItem() {
		clickItemMenu(frameMenuItem);
		return new FramesMenuPage();
	}

}
