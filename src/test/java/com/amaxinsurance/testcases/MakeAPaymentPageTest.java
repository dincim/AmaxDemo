package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.MakeAPaymentPage;
import com.amaxweb.base.TestBase;

public class MakeAPaymentPageTest extends TestBase {

	MakeAPaymentPage makeAPaymentPage;

	public MakeAPaymentPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		makeAPaymentPage = new MakeAPaymentPage();
	}

	@Test
	public void verifyMakeAPaymentPageTitleTest() {
		String makeaPaymentPageTitle = makeAPaymentPage.verifyMakeApaymentPageTitle();
		Assert.assertEquals(makeaPaymentPageTitle, "Make A Payment", "Failed. Title mismatched");

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
