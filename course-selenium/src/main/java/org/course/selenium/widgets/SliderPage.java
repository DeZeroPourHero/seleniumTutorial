package org.course.selenium.widgets;

import static org.course.selenium.basePage.demoqa.javascript.utility.ActionUtility.*;
import static org.course.selenium.basePage.demoqa.javascript.utility.GetUtility.*;

import org.openqa.selenium.By;



public class SliderPage extends WidgetsPage{
	
	private By rangeslider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
	private By sliderValue = By.id("sliderValue");
	
	public void moveSlider(int x, int y) {
		dragAndDropBy(find(rangeslider), x, y);
	}
	
	public String getSliderValue() {
		return getAttribute(sliderValue,"value");
	}

}
