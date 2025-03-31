package org.course.selenium.alerts;

import static org.testng.Assert.assertEquals;

import java.awt.Frame;

import org.course.selenium.baseTest.BaseTest;
import org.course.selenium.modaldialogsAlert.FramesMenuPage;
import org.testng.annotations.Test;

public class FramesTests extends BaseTest{
	
	@Test
	public void messageContentBigFrameTest() {
		String messageBigFrameExpected = "This is a sample page";
		FramesMenuPage frameMenuPage =  homePage.goToModalAlertDialogsPage().clickOnFramesItem();
		String messageBigFrameActual =  frameMenuPage.getContentBigFrame();
		assertEquals(messageBigFrameActual, messageBigFrameExpected,"\n actual and expected message do not match\n");
	}
	
	@Test
	public void messageContentSmallFrameTest() {
		String messageSmallFrameExpected = "This is a sample page";
		FramesMenuPage frameMenuPage =  homePage.goToModalAlertDialogsPage().clickOnFramesItem();
		String messageSmallFrameActual =  frameMenuPage.getContentSmallFrame();
		assertEquals(messageSmallFrameActual, messageSmallFrameExpected,"\n actual and expected message do not match\n");
	}
	
	@Test
	public void messageContentSmallFrameByWebElementTest() {
		String messageSmallFrameExpected = "This is a sample page";
		FramesMenuPage frameMenuPage =  homePage.goToModalAlertDialogsPage().clickOnFramesItem();
		String messageSmallFrameActual =  frameMenuPage.getContentSmallFrameByWebElement();
		assertEquals(messageSmallFrameActual, messageSmallFrameExpected,"\n actual and expected message do not match\n");
	}
	
	
	@Test
	public void getHeaderFrameTest() {
		String expectedHeaderFrame = "Frames";
		FramesMenuPage frameMenuPage =  homePage.goToModalAlertDialogsPage().clickOnFramesItem();
		String actualHeaderFrame = frameMenuPage.getHeaderFrames();
		assertEquals(actualHeaderFrame, expectedHeaderFrame,"\n actual and expected message do not match\n");
	}

}
