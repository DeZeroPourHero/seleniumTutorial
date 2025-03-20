package org.course.selenium;

import static org.course.selenium.basePage.demoqa.javascript.JavaScriptUtility.*;

import org.course.selenium.basePage.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
	private By forms = By.xpath("//div[@id='app']//h5[text()='Forms']");
	
	
	public FormPage goToFormsPage() {
		scroolToElementJs(forms);
		clickElement(forms);
		return new FormPage();
	}
	
}
