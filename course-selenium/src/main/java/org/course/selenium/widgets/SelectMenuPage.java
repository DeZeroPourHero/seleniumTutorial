package org.course.selenium.widgets;

import static org.course.selenium.basePage.demoqa.javascript.utility.DropDownUtility.*;
import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.scroolToElementJs;

import java.util.List;

import org.openqa.selenium.By;

public class SelectMenuPage extends WidgetsPage {
	private By standardMultiSelect = By.id("cars");
	
	public void selectStandardMulti(String value) {
		scroolToElementJs(standardMultiSelect);
		selectByVisibleText(standardMultiSelect, value);
	}
	
	public void selectStandardMulti(int index) {
		scroolToElementJs(standardMultiSelect);
		selectByIndex(standardMultiSelect, index);
	}
	
	public void deselectStandardMulti(String  value) {
		scroolToElementJs(standardMultiSelect);
		deselectByValue(standardMultiSelect, value);
	}
	
	public List<String> getAllSelectedStandardMultiOptions(){
		return getAllSelectedOptions(standardMultiSelect);
	}
	
	

}
