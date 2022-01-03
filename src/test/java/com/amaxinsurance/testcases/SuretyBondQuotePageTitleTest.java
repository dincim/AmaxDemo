package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.SuretyBondQuotePage;
import com.amaxweb.base.TestBase;

public class SuretyBondQuotePageTitleTest extends TestBase {
	
	SuretyBondQuotePage suretyBondQuotePage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		suretyBondQuotePage = new SuretyBondQuotePage();
	}

	@Test
	void verifySuretyBondQuotePageTitleTest() throws Exception {

		suretyBondQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Surety Bond", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
