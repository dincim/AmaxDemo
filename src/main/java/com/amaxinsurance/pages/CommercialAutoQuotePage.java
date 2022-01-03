package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class CommercialAutoQuotePage extends TestBase {
	
	@FindBy(xpath ="//button[contains(text(),'Get Insurance')]")
	WebElement getInsuranceLink;
	
	@FindBy(xpath = "//div[1]/section[2]/div/div[3]/nav[1]/div[1]/div/div/div[3]/div/div/div[2]/a")
	WebElement cAutoLink;
	
	public CommercialAutoQuotePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() throws Exception {
		getInsuranceLink.click();
		Thread.sleep(3000);
		cAutoLink.click();
	}

}
