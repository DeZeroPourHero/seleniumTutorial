package org.course.selenium.widgets;

import org.openqa.selenium.By;
import static org.course.selenium.basePage.demoqa.javascript.utility.WaitUtility.*;

public class ProgressBarPage extends WidgetsPage {
	
	private By startButton = By.id("startStopButton");
	
	public void clickOnStartButton() {
		clickElement(startButton);
	}
	
	public String getProgressValue(String pourcentage,int secondes) {		
		By progressBar = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='"+pourcentage+"']");
		fluentWaitUntilVisible(progressBar,secondes);
		return getMessageByLocator(progressBar);
	}

}
