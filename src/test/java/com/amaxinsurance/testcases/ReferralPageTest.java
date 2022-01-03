package com.amaxinsurance.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.ReferralPage;
import com.amaxweb.base.TestBase;

public class ReferralPageTest extends TestBase {
	
	ReferralPage referralpage;
	
	public ReferralPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		referralpage = new ReferralPage();
	}

	@Test(enabled = true)
	public void homePageTitleTest() {
		
		referralpage.referAFriend();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
