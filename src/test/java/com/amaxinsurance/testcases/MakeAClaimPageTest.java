package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.MakeAClaimPage;
import com.amaxweb.base.TestBase;

public class MakeAClaimPageTest extends TestBase {

	MakeAClaimPage makeAClaimPage;

	public MakeAClaimPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		makeAClaimPage = new MakeAClaimPage();
	}

	@Test
	public void verifyMakeAClaimPageTitleTest() {
		String makeaClaimPageTitle = makeAClaimPage.verifyMakeAClaimPageTitle();
		Assert.assertEquals(makeaClaimPageTitle, "Make A Claim", "Failed. Title mismatched");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
