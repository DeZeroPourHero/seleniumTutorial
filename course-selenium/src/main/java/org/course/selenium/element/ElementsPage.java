package org.course.selenium.element;

import org.course.selenium.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage{
		private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
		
		
		public WebTablesPage clickWebTables() {
			clickElement(webTablesMenuItem);
			return new WebTablesPage();
		}
}
