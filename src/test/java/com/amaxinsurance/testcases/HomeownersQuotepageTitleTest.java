package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.HomeownersQuotepage;
import com.amaxweb.base.TestBase;

public class HomeownersQuotepageTitleTest extends TestBase {
	
	HomeownersQuotepage homeownersQuotepage;
	
	public HomeownersQuotepageTitleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homeownersQuotepage = new HomeownersQuotepage();
	}

	@Test
	void verifyHomeownersQuotepageTitleTest() throws Exception {

		homeownersQuotepage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Homeowners Insurance", title);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
