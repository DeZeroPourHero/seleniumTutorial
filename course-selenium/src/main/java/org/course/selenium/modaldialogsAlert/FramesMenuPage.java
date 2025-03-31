package org.course.selenium.modaldialogsAlert;

import static org.course.selenium.basePage.demoqa.javascript.utility.SwitchToUtility.*;

import org.openqa.selenium.By;

public class FramesMenuPage extends ModalDialogsAlertPage {
	private By frame = By.id("sampleHeading");
	private By smallFrame = By.xpath("//div[@id='frame2Wrapper']/iframe");
	private By headerFrames = By.xpath("//div[@id='framesWrapper']//h1[text()='Frames']");
	private String iframeBigBox = "frame1";
	private int indexIframeSmallBox = 2;

	public String getContentSmallFrame() {
		switchToFrameByIndex(indexIframeSmallBox);
		String contentSmallFrame = getMessageByLocator(frame);
		switchToDefaultContent();
		return contentSmallFrame;
	}
	
	public String getContentSmallFrameByWebElement() {
		switchToFrameByWebElement(find(smallFrame));
		String contentSmallFrame = getMessageByLocator(frame);
		switchToDefaultContent();
		return contentSmallFrame;
	}
	
	public String getContentBigFrame() {
		switchToFrameByName(iframeBigBox);
		String contentBigFrame = getMessageByLocator(frame);
		switchToDefaultContent();
		return contentBigFrame;
	}

	public String getHeaderFrames() {
	  return getMessageByLocator(headerFrames);
	}

}
