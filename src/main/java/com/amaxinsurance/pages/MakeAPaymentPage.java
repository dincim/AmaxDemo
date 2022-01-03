package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class MakeAPaymentPage extends TestBase {

	@FindBy(xpath = "//*[@id=\"container-3011f4f98a\"]/div/div/div[1]/section[1]/div/ul/li[2]/a/span")
	WebElement makePaymentLink;

	public MakeAPaymentPage() {

		PageFactory.initElements(driver, this);
	}
	
	public String verifyMakeApaymentPageTitle() {
		makePaymentLink.click();
		return driver.getTitle();
		
	}

}
