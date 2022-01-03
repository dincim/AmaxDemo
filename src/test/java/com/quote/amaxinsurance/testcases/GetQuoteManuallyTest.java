package com.quote.amaxinsurance.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxweb.base.TestBase;
import com.quote.amaxinsurance.GetQuoteManually;

public class GetQuoteManuallyTest extends TestBase {

	GetQuoteManually getQuoteManually;

	public GetQuoteManuallyTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		getQuoteManually = new GetQuoteManually();
	}

	@Test
	public void getQuoteManuallyTest() throws Exception {

		getQuoteManually.getQuoteManually();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
