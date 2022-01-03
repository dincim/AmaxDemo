package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.GeneralLiabilityQuotePage;
import com.amaxweb.base.TestBase;

public class GeneralLiabilityQuotePageTitleTest extends TestBase {
	GeneralLiabilityQuotePage generalLiabilityQuotePage;
	
	public GeneralLiabilityQuotePageTitleTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		generalLiabilityQuotePage = new GeneralLiabilityQuotePage();
	}

	@Test
	void verifyGeneralLiabilityQuotePageTitleTest() throws Exception {

		generalLiabilityQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("General Liability Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
