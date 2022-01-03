package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.MexicoTouristQuotePage;
import com.amaxweb.base.TestBase;

public class MexicoTouristQuotePageTitleTest extends TestBase {
	MexicoTouristQuotePage mexicoTouristQuotePage;
	
	public MexicoTouristQuotePageTitleTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		mexicoTouristQuotePage = new MexicoTouristQuotePage();
	}

	@Test
	void verifyMexicoTouristQuotePageTitleTest() throws Exception {

		mexicoTouristQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Mexico Tourist Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
