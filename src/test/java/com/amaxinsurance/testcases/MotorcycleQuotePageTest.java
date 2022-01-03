package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.MotorCycleQuotePage;
import com.amaxweb.base.TestBase;

public class MotorcycleQuotePageTest extends TestBase {
	
	MotorCycleQuotePage motorCycleQuotePage;
	
	public MotorcycleQuotePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		motorCycleQuotePage = new MotorCycleQuotePage();
	}
	
	@Test
	public void verifyMotorcyclePageTitleTest() {
		motorCycleQuotePage.clickOnGetQuoteLink();
		
		String actualTitle = driver.getTitle();
		System.out.println("Page title is:"+actualTitle);
		String expectedTitle = "Motorcycle Insurance";
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
