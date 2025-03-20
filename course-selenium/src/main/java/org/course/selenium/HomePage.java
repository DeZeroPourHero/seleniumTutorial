package org.course.selenium;

import static org.course.selenium.basePage.demoqa.javascript.JavaScriptUtility.*;

import org.course.selenium.basePage.BasePage;
import org.course.selenium.element.ElementsPage;
import org.course.selenium.form.FormPage;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
	private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
	
	private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
	
	
	public FormPage goToFormsPage() {
		scroolToElementJs(formsCard);
		clickElement(formsCard);
		return new FormPage();
	}
	
	public ElementsPage goToElementsPage() {
		scroolToElementJs(formsCard);
		clickElement(elementsCard);
		return new ElementsPage();
	}
	
}
