package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.MobileHomeQuotePage;
import com.amaxweb.base.TestBase;

public class MobileHomeQuotePageTitleTest extends TestBase {
	MobileHomeQuotePage mobileHomeQuotePage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		mobileHomeQuotePage = new MobileHomeQuotePage();
	}

	@Test
	void verifyMobileHomeQuotePageTitleTest() throws Exception {

		mobileHomeQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Mobile Home Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
