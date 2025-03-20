package org.course.selenium;

import org.openqa.selenium.By;
import static org.course.selenium.basePage.demoqa.javascript.JavaScriptUtility.*;

public class FormPage extends HomePage{
	
	private By praticeFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");
	
	
	public String getFormsTitle() {
		return find(praticeFormMenuItem).getText();
	}
	
	
	public PraticeFormPage clickPraticeForm(){
		scroolToElementJs(praticeFormMenuItem);
		clickElement(praticeFormMenuItem);
		return new PraticeFormPage();
	}

}
