package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.FindAnOfficePage;
import com.amaxweb.base.TestBase;

import listenerconcept.CustomListener;

@Listeners(CustomListener.class)
public class FindAnOfficePageTest extends TestBase {
	
	FindAnOfficePage findanoffice;
	public FindAnOfficePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		findanoffice = new FindAnOfficePage();
	}
	
	@Test
	public void verifyFindAnOfficeTitleTest() throws InterruptedException {
		String findOfficeTitle = findanoffice.verifyFindAnOfficePageTitle();
		Assert.assertEquals(findOfficeTitle, "Find an Office","Find an office page title not matched! ");
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
