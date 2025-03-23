package org.course.selenium.widgets;

import static org.course.selenium.basePage.demoqa.javascript.utility.DropDownUtility.selectByVisibleText;
import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.*;

import org.openqa.selenium.By;

public class DatePikerMenuPage extends WidgetsPage{
	private By selectDateMenuItem = By.id("datePickerMonthYearInput");
	private By monthDropDown = By.className("react-datepicker__month-select");
	private By yearDropDown = By.className("react-datepicker__year-select");
	
	
	public void clickOnselectDate() {
		clickJsElement(selectDateMenuItem);
	}
	
	public void selectMonth(String month) {
		selectByVisibleText(monthDropDown, month);
	}
	
	public void selectYear(String year) {
		selectByVisibleText(yearDropDown, year);
	}
	
	private By dayValue(String day) {
		return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='"+day+"']");
	}
	
	public void clickDay(String day) {
	  clickElement(dayValue(day));
	}
	
	public boolean isDayInMonth(String day) {
		By delay = dayValue(day);
		scroolToElementJs(delay);
		return find(delay).isDisplayed();
	}
	
	public String getDate() {
		return find(selectDateMenuItem).getAttribute("value");
	}
	

	
	
}
