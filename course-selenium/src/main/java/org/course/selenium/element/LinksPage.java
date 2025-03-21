package org.course.selenium.element;

import org.openqa.selenium.By;
import static org.course.selenium.basePage.demoqa.javascript.JavaScriptUtility.*;

public class LinksPage extends ElementsPage{
		private By linkResponse = By.id("linkResponse");
		
		public void clickOnlink(String link){
			By linkMenu = By.id(link);
			scroolToElementJs(linkMenu);
			clickElement(linkMenu);
		}
		
		public String getLinkResponse() {
			delay(2000);
			return find(linkResponse).getText();
		}
		
		
}
