package org.course.selenium.form;

import org.openqa.selenium.By;
import static org.course.selenium.basePage.demoqa.javascript.utility.JavaScriptUtility.*;

public class PraticeFormPage extends FormPage{
   private By femaleRadioButton = By.id("gender-radio-2");
   private By sportsHobby = By.id("hobbies-checkbox-1");
   
   public void clickFemaleRadioButton() {
	   clickItemMenuClickJs(femaleRadioButton);  
   }
   
   public void clickFemaleRadioButtonForScreenshot() {
	   clickElement(femaleRadioButton);  
   }
   
   public boolean isFemaleRadioButton() {
	   return find(femaleRadioButton).isSelected();
   }
   
   public void clickCheckboxSport() {
	   if(!find(sportsHobby).isSelected()) {
		   clickItemMenuClickJs(sportsHobby); 
	   }
   }
   
   public boolean isCheckboxSports() {
	   return find(sportsHobby).isSelected();
   }
}
