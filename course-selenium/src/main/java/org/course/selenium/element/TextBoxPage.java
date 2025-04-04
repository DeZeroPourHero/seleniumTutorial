package org.course.selenium.element;

import static org.course.selenium.basePage.demoqa.javascript.utility.ActionUtility.sendKeys;
import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.scroolToElementJs;
import static org.course.selenium.basePage.demoqa.javascript.utility.WaitUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBoxPage extends ElementsPage{
	private By fullName = By.id("userName");
	private By currentAdress = By.xpath("//textarea[@id='currentAddress']");
	private By submitButton = By.id("submit");
	private By currentAdressResult = By.xpath("//p[@id='currentAddress']");
	private By fullNameResult = By.xpath("//p[@id='name']");
	
	
	public void setFullName(String content) {
		scroolToElementJs(fullName);
		sendKeys(find(fullName), content);
	}
	
	public void setUserEmail(String email) {
		setFullName(Keys.chord(Keys.TAB, email));
	}
	
	public void setCurrentAdress(String address) {
		find(currentAdress).sendKeys(address + Keys.ENTER);
	}
	
	public void clickSubmitButton() {
		scroolToElementJs(submitButton);
		clickElement(submitButton);
	}
	
	public String getCurrentAdress() {
		explicitWaitUntilVisible(currentAdressResult, 5);
		return getMessageByLocator(currentAdressResult);
	}
	
	public String getFullname() {
		explicitWaitUntilVisible(fullNameResult, 5);
		return getMessageByLocator(fullNameResult);
	}

}
