package org.course.selenium.modaldialogsAlert;

import org.openqa.selenium.By;

public class PraticeModalDialogs extends ModalDialogsAlertPage{
	private By smallModalButton = By.id("showSmallModal");
	private By popupSmallModalButton = By.xpath("//div[contains(text(),'small modal')]");
	private By closeSmallModalButton = By.id("closeSmallModal");
	
	public void clickOnSmallModalButton() {
		clickElement(smallModalButton);
	}
	
	public String getMessageOnSmallModalButton() {
		return getMessageByLocator(popupSmallModalButton);
	}
	
	public void clickOncloseSmallModalButton() {
		clickElement(closeSmallModalButton);
	}

}
