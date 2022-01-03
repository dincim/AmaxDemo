package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.BoatsAndWatercraftQuotePage;
import com.amaxweb.base.TestBase;

public class BoatsAndWatercraftQuotePageTitleTest extends TestBase {

	BoatsAndWatercraftQuotePage boatsAndWatercraftQuotePage;

	public BoatsAndWatercraftQuotePageTitleTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		boatsAndWatercraftQuotePage = new BoatsAndWatercraftQuotePage();
	}

	@Test
	void verifyBoatsAndWCPageTitletest() throws Exception {

		boatsAndWatercraftQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Boat & Watercraft Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
