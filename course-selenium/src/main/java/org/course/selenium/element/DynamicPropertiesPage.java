package org.course.selenium.element;

import org.openqa.selenium.By;
import static org.course.selenium.basePage.demoqa.javascript.utility.WaitUtility.*;

public class DynamicPropertiesPage extends ElementsPage{
	
	private By enableAfterButton = By.id("enableAfter");
	
	
	public String getMessageEnableAfterButton() {
		 explicitWaitUntilVisible(enableAfterButton, 5);
		return getMessageByLocator(enableAfterButton);
	}

}
