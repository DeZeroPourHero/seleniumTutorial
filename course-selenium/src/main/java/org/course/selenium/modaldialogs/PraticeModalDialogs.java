package org.course.selenium.modaldialogs;

import org.openqa.selenium.By;

public class PraticeModalDialogs extends ModalDialogsPage{
	private By smallModalButton = By.id("showSmallModal");
	private By popupSmallModalButton = By.xpath("//div[contains(text(),'small modal')]");
	private By closeSmallModalButton = By.id("closeSmallModal");
	
	public void clickOnSmallModalButton() {
		clickElement(smallModalButton);
	}
	
	public String getMessageOnSmallModalButton() {
		return find(popupSmallModalButton).getText();
	}
	
	public void clickOncloseSmallModalButton() {
		clickElement(closeSmallModalButton);
	}

}
