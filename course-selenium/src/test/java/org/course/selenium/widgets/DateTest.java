package org.course.selenium.widgets;

import static org.testng.Assert.assertEquals;

import org.course.selenium.baseTest.BaseTest;
import org.testng.annotations.Test;

public class DateTest extends BaseTest{
	
	
	@Test
	public void selectDateTest() {
		String month = "December";
		String numberMonth = "12";
		String day = "31";
		String year = "2035";
		DatePikerMenuPage datePikerMenuPage =  homePage.goToWidgetsPage().clickOnDatePikerMenu();
		datePikerMenuPage.clickOnselectDate();
		datePikerMenuPage.selectMonth(month);
		datePikerMenuPage.selectYear(year);
		datePikerMenuPage.clickDay(day);
		String actualDate = datePikerMenuPage.getDate(); 
		String expectedDate = numberMonth+"/"+day+"/"+year;
		assertEquals(actualDate, expectedDate,"\n+ Actual & Expected Dates don't Match +\n");
		
	}
	
	
	

}
