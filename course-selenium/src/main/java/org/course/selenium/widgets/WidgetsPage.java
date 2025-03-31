package org.course.selenium.widgets;

import static org.course.selenium.basePage.demoqa.javascript.utility.SwitchToUtility.*;

import org.course.selenium.HomePage;
import org.course.selenium.modaldialogsAlert.FramesMenuPage;
import org.openqa.selenium.By;

public class WidgetsPage extends HomePage{
	private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
	private By datePikerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");

	
	public SelectMenuPage clickOnSelectMenu() {
		clickItemMenu(selectMenuItem);
		return new SelectMenuPage();
	}
	
	public DatePikerMenuPage clickOnDatePikerMenu() {
		clickItemMenu(datePikerMenuItem);
		return new DatePikerMenuPage();
	}
}
