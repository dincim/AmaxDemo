package com.amaxinsurance.pages.aboutamax;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class NewsAndEventsPage extends TestBase {
	@FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
	WebElement aboutAmaxLink;
	@FindBy(xpath = "//a[contains(text(),'News & Events')]")
	WebElement newAEventsLink;
	
	public NewsAndEventsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() throws Exception {
		aboutAmaxLink.click();
		Thread.sleep(3000);
		newAEventsLink.click();
		
	}
}
