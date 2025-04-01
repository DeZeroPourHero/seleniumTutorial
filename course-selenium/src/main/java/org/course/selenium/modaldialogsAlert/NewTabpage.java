package org.course.selenium.modaldialogsAlert;

import org.openqa.selenium.By;

public class NewTabpage extends BrowserWindowsPage{
	private By messageOnNewTabPage = By.id("sampleHeading");
	
	public String getMessageOnNewTabPage() {
		return getMessageByLocator(messageOnNewTabPage);
	}

}
