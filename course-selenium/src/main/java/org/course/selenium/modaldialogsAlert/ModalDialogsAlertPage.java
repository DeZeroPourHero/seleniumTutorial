package org.course.selenium.modaldialogsAlert;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class ModalDialogsAlertPage extends HomePage{
	
	private By modalDialogsItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
	private By alertItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
	private By frameMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
	private By browserWindows = By.xpath("//li[@id='item-0']//span[text()='Browser Windows']");
	
	public PraticeModalDialogs clickOnModalDialogsItem() {
		clickItemMenuScrool(modalDialogsItem);
		return new PraticeModalDialogs();
	}
	
	public PraticeAlert clickOnAlertItem() {
		clickItemMenuScrool(alertItem);
		return new PraticeAlert();
	}
	
	public FramesMenuPage clickOnFramesItem() {
		clickItemMenuScrool(frameMenuItem);
		return new FramesMenuPage();
	}
	
	public BrowserWindowsPage clickOnWindowsPage() {
		clickItemMenuScrool(browserWindows);
		return new BrowserWindowsPage();
	}

}
