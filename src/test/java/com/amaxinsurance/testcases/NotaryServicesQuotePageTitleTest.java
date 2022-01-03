package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.NotaryServicesQuotePage;
import com.amaxweb.base.TestBase;

public class NotaryServicesQuotePageTitleTest extends TestBase {
	
	NotaryServicesQuotePage notaryServicesQuotePage;
	
	@BeforeMethod
	public void setUp() {
		initialization();
		notaryServicesQuotePage = new NotaryServicesQuotePage();
	}

	@Test
	void verifyNotaryServicesQuotePageTitleTest() throws Exception {

		notaryServicesQuotePage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Notary Public Services", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
