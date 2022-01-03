package com.amaxinsurance.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.RVQuotePage;
import com.amaxweb.base.TestBase;

public class RVQuotePageTitleTest extends TestBase {
	
	RVQuotePage rVQuotePage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		rVQuotePage = new RVQuotePage();
	}

	@Test
	void verifyRVQuotePageTitleTest() throws Exception {

		rVQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("RV Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
