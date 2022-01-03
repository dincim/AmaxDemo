package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.CommercialAutoQuotePage;
import com.amaxweb.base.TestBase;



public class CommercialAutoQuotePageTitleTest extends TestBase {
	
	CommercialAutoQuotePage commercialAutoQuotePage;
	
	public CommercialAutoQuotePageTitleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		commercialAutoQuotePage = new CommercialAutoQuotePage();
	}
	
	@Test
	 void verifycommAutoPageTitleTest() throws Exception {
		commercialAutoQuotePage.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals("Commercial Auto Insurance", title);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
