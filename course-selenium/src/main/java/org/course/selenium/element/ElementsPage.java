package org.course.selenium.element;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage{
		private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
		private By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
		private By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");
		private By textBoxPropertiesMenuItem = By.xpath("//li[@id='item-0']//span[text()='Text Box']");
		
		
		public WebTablesPage clickWebTablesMenuItem() {
			clickElement(webTablesMenuItem);
			return new WebTablesPage();
		}
		
		public LinksPage clickMenuItem() {
			clickElement(linksMenuItem);
			return new LinksPage();
		}
		
		public DynamicPropertiesPage clickDynamicPropertiesMenuItem() {
			clickElement(dynamicPropertiesMenuItem);
			return new DynamicPropertiesPage();
		}
		
		public TextBoxPage clickOnTextBoxMenuItem() {
			clickElement(textBoxPropertiesMenuItem);
			return new TextBoxPage();
		}
}
