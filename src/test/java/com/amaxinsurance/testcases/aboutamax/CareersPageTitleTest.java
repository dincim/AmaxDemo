package com.amaxinsurance.testcases.aboutamax;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.aboutamax.CareersPage;
import com.amaxweb.base.TestBase;

public class CareersPageTitleTest extends TestBase {
	
	CareersPage careersPage;

	public CareersPageTitleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		careersPage = new CareersPage();
	}

	@Test
	void verifyCarreersPageTitletest() throws Exception {

		careersPage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Careers", title,"Title No match");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
