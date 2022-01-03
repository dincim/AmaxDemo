package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class ContactUsPage extends TestBase {
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")
	WebElement contactUsLink;
	
	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() {
		contactUsLink.click();
	}
	

}
