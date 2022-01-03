package com.amaxinsurance.pages.aboutamax;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amaxweb.base.TestBase;

public class OurCompanyPage extends TestBase {
	
	@FindBy(xpath = "//button[contains(text(),'About A-MAX')]")
	WebElement aboutAmaxLink;
	@FindBy(xpath = "//a[contains(text(),'Our Company')]")
	WebElement ourCompanyLink;
	
	public OurCompanyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void getTitle() throws Exception {
		aboutAmaxLink.click();
		Thread.sleep(3000);
		ourCompanyLink.click();
		
	}

}
