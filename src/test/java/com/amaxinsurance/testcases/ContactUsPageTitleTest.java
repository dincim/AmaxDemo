package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.ContactUsPage;
import com.amaxweb.base.TestBase;

public class ContactUsPageTitleTest extends TestBase {
	
	ContactUsPage contactUsPage;
	
	public ContactUsPageTitleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		contactUsPage = new ContactUsPage();
	}

	@Test
	void verifyContactUsPageTitletest() throws Exception {

		contactUsPage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Contact Us", title,"Title No match");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
