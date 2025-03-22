package org.course.selenium.widgets;

import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.scroolToElementJs;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class WidgetsPage extends HomePage{
	private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
	
	public SelectMenuPage clickOnSelectMenu() {
		scroolToElementJs(selectMenuItem);
		clickElement(selectMenuItem);
		return new SelectMenuPage();
	}
}
