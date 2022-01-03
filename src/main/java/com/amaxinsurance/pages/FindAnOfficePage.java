package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amaxweb.base.TestBase;

public class FindAnOfficePage extends TestBase {
	
	
	
	@FindBy(xpath="//a[contains(text(),'Find an Office')]")
	WebElement findOfficeLink;
	
	public FindAnOfficePage() {

		PageFactory.initElements(driver, this);
	}
	
	public String verifyFindAnOfficePageTitle() throws InterruptedException {
		findOfficeLink.click();
		Thread.sleep(2000);
		return driver.getTitle();
		
	}
	
//	public FindAnOfficePage clickOnFindOfficeLink() {
//		findOfficeLink.click();
//		return new FindAnOfficePage();
//	}
	
}
