package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class NotaryServicesQuotePage extends TestBase {
	@FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
	WebElement getInsuranceLink;
	
	@FindBy(xpath = "//a[contains(text(),'Notary Services')]")
	WebElement notarySLink;
	
	public NotaryServicesQuotePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() throws Exception {
		getInsuranceLink.click();
		Thread.sleep(3000);
		notarySLink.click();

	}
}
