package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.RentersQuotePage;
import com.amaxweb.base.TestBase;

public class RentersQuotePageTitleTest extends TestBase {
	
	RentersQuotePage rentersQuotePage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		rentersQuotePage = new RentersQuotePage();
	}

	@Test
	void verifyRentersQuotepageTitleTest() throws Exception {

		rentersQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Renters Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
