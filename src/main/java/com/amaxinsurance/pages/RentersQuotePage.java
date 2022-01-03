package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class RentersQuotePage extends TestBase {
	
	@FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
	WebElement getInsuranceLink;
	
	@FindBy(xpath = "//a[contains(text(),'Renters')]")
	WebElement rentersPageLink;
	
	public RentersQuotePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() throws Exception {
		getInsuranceLink.click();
		Thread.sleep(3000);
		rentersPageLink.click();

	}

}
