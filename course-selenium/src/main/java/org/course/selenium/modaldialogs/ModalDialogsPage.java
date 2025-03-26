package org.course.selenium.modaldialogs;

import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.scroolToElementJs;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class ModalDialogsPage extends HomePage{
	
	private By modalDialogsItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
	
	public PraticeModalDialogs clickOnModalDialogsItem() {
		scroolToElementJs(modalDialogsItem);
		clickElement(modalDialogsItem);
		return new PraticeModalDialogs();
	}

}
