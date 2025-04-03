package org.course.selenium.widgets;

import static org.testng.Assert.assertEquals;

import org.course.selenium.baseTest.BaseTest;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest{
	
	@Test
	public void sliderTest() {
	  int x = 80;
	  int y = 0;
	  SliderPage sliderPage = homePage.goToWidgetsPage().mouveElementSliderMenu();
	  String initialValue = sliderPage.getSliderValue();
	  System.out.print(initialValue + "\n");
	  sliderPage.moveSlider(x, y);
	  String expectedRangeSlider = "66";
	  String actualRangeSlider = sliderPage.getSliderValue();
	  System.out.print(actualRangeSlider + "\n");
	  assertEquals(actualRangeSlider, expectedRangeSlider);
	}

}
