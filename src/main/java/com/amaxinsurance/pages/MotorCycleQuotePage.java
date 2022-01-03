package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class MotorCycleQuotePage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'Motorcycle')]")
	WebElement motorcycleLink;
	
	@FindBy(xpath = "//button[contains(text(),'Get Insurance')]")
	WebElement quoteMenu;
	
	// method for using OR/initializing the page objects
	public MotorCycleQuotePage() {

		PageFactory.initElements(driver, this);
	}

	// Actions
	
	public void clickOnGetQuoteLink() {
		Actions action = new Actions(driver);
		action.moveToElement(quoteMenu).build().perform();
		quoteMenu.click();
		
		motorcycleLink.click();
	}

}
