package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.Sr22QuotePage;
import com.amaxweb.base.TestBase;

public class Sr22QuotePageTitleTest extends TestBase{
	
	Sr22QuotePage sr22QuotePage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		sr22QuotePage = new Sr22QuotePage();
	}

	@Test
	void verifySr22QuotePageTitleTest() throws Exception {

		sr22QuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("SR-22 Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
