package org.course.selenium.widgets;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class WidgetsPage extends HomePage{
	private By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
	private By datePikerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
	private By progressBarMenuItem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");

	
	public SelectMenuPage clickOnSelectMenu() {
		clickItemMenuScrool(selectMenuItem);
		return new SelectMenuPage();
	}
	
	public DatePikerMenuPage clickOnDatePikerMenu() {
		clickItemMenuScrool(datePikerMenuItem);
		return new DatePikerMenuPage();
	}
	
	public ProgressBarPage clickOnProgressBarMenu() {
		clickElement(progressBarMenuItem);
		return new  ProgressBarPage();
	}
}
