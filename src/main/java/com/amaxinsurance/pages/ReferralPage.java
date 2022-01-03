package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class ReferralPage extends TestBase {

	@FindBy(xpath = "//a[@id='teaser-05aee71daf-cta-96c320a640']")
	WebElement referAFriendBtn;

	@FindBy(xpath = "//button[@class='btn banner-btn']")
	WebElement referBtn;

	public ReferralPage() {

		PageFactory.initElements(driver, this);
	}
	
	public void referAFriend() {
		referAFriendBtn.click();
		referBtn.click();
	}

}
