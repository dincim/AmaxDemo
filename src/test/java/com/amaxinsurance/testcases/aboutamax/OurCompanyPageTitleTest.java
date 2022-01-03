package com.amaxinsurance.testcases.aboutamax;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.aboutamax.OurCompanyPage;
import com.amaxweb.base.TestBase;

public class OurCompanyPageTitleTest extends TestBase {
	
	OurCompanyPage ourCompanyPage;
	
	public OurCompanyPageTitleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		ourCompanyPage = new OurCompanyPage();
	}

	@Test
	void verifyOurCompanyPageTitleTest() throws Exception {

		ourCompanyPage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Our Company", title,"Title No match");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
