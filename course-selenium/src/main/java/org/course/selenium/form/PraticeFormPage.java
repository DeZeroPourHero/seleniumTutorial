package org.course.selenium.form;

import static org.course.selenium.basePage.demoqa.javascript.JavaScriptUtility.clickJsElement;
import static org.course.selenium.basePage.demoqa.javascript.JavaScriptUtility.scroolToElementJs;

import org.openqa.selenium.By;

public class PraticeFormPage extends FormPage{
   private By femaleRadioButton = By.id("gender-radio-2");
   private By sportsHobby = By.id("hobbies-checkbox-1");
   
   public void clickFemaleRadioButton() {
	   scroolToElementJs(femaleRadioButton);
	   clickJsElement(femaleRadioButton);  
   }
   
   public boolean isFemaleRadioButton() {
	   return find(femaleRadioButton).isSelected();
   }
   
   public void clickCheckboxSport() {
	   if(!find(sportsHobby).isSelected()) {
		   scroolToElementJs(sportsHobby);
		   clickJsElement(sportsHobby);  
	   }
   }
   
   public boolean isCheckboxSports() {
	   return find(sportsHobby).isSelected();
   }
}
