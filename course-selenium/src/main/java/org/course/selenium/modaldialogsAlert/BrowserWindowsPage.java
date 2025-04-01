package org.course.selenium.modaldialogsAlert;

import static org.course.selenium.basePage.demoqa.javascript.utility.GetUtility.getWindowsHandle;
import static org.course.selenium.basePage.demoqa.javascript.utility.GetUtility.getWindowsHandles;
import static org.course.selenium.basePage.demoqa.javascript.utility.SwitchToUtility.switchToHandle;

import java.util.Set;

import org.openqa.selenium.By;

public class BrowserWindowsPage extends ModalDialogsAlertPage {
	private By newWindowButton = By.id("windowButton");
	private By newTabButton = By.id("tabButton");

	public NewTabpage clickOnNewTabButton() {
		clickElement(newTabButton);
		return new NewTabpage();
	}

	public void clickOnNewWindowButton() {
		clickElement(newWindowButton);
	}

	public void switchToWindow() {
		String currentHandle = getWindowsHandle();
		Set<String> allHandles = getWindowsHandles();
		allHandles.forEach(handle -> {
			if (!currentHandle.equals(handle)) {
				switchToHandle(handle);
			}
		});

	}
}
