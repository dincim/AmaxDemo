package com.amaxinsurance.testcases.aboutamax;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.aboutamax.FAQsPage;
import com.amaxweb.base.TestBase;


public class FAQsPageTitleTest extends TestBase {
	
	FAQsPage fAQsPage;
	
	public FAQsPageTitleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		fAQsPage = new FAQsPage();
	}

	@Test
	void verifyfAQsPageTitletest() throws Exception {

		fAQsPage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("FAQ", title,"Title No match");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
