package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class MakeAClaimPage extends TestBase {
	
	@FindBy(xpath ="//span[text()='Make a Claim']")
	WebElement makeAClaimLink;
	
	public MakeAClaimPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyMakeAClaimPageTitle() {
		makeAClaimLink.click();
		return driver.getTitle();
		
	}

}
