package org.course.selenium.form;

import org.openqa.selenium.By;

import static org.course.selenium.basePage.demoqa.javascript.utility.SwitchToUtility.*;

import org.course.selenium.HomePage;

public class FormPage extends HomePage{
	
	private By praticeFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
	
	
	public String getFormsTitle() {
		return find(praticeFormMenuItem).getText();
	}
	
	
	public PraticeFormPage clickPraticeForm(){
		clickItemMenu(praticeFormMenuItem);
		return new PraticeFormPage();
	}

}
