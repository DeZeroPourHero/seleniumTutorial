package org.course.selenium.element;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage{
	
	private By registerFormsAge = By.id("age");
	private By registerFormSubmit = By.id("submit");
	
	public void clickEdit(String email) {
		By edit = By.xpath("//div[text()='"+email+"']//following::span[@title='Edit']");
		clickElement(edit);
	}
	
	public void setAge(String age) {
		fillElement(registerFormsAge, age);
	}
	
	public String getAge(String email) {
		By webTableAge = By.xpath("//div[text()='"+email+"']//preceding::div[1]");
		return getMessageByLocator(webTableAge);
	}
	
	public void submitWebTablesPage() {
		clickElement(registerFormSubmit);
	}
}
