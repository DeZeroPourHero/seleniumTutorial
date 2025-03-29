package org.course.selenium;

import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.*;

import org.course.selenium.basePage.BasePage;
import org.course.selenium.element.ElementsPage;
import org.course.selenium.form.FormPage;
import org.course.selenium.modaldialogsAlert.ModalDialogsAlertPage;
import org.course.selenium.widgets.WidgetsPage;
import org.openqa.selenium.By;

public class HomePage extends BasePage{
	private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
	
	private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
	
	private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
	
	private By alertCard = By.xpath("//div[@id='app']//h5[contains(text(),'Alerts')]");
	
	
	public FormPage goToFormsPage() {
		scroolToElementJs(formsCard);
		clickElement(formsCard);
		return new FormPage();
	}
	
	public ElementsPage goToElementsPage() {
		scroolToElementJs(elementsCard);
		clickElement(elementsCard);
		return new ElementsPage();
	}
	
	public WidgetsPage goToWidgetsPage() {
		scroolToElementJs(widgetsCard);
		clickElement(widgetsCard);
		return new WidgetsPage();
	}
	
	public ModalDialogsAlertPage goToModalAlertDialogsPage() {
		scroolToElementJs(alertCard);
		clickElement(alertCard);
		return new ModalDialogsAlertPage();
	}
	
	
}
