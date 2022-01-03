package com.quote.amaxinsurance.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxweb.base.TestBase;
import com.quote.amaxinsurance.GetQuoteDriversLicenseInput;

public class GetQuoteDriversLicenseInputTest extends TestBase {
	
	GetQuoteDriversLicenseInput getQuoteDriversLicenseInput;
	
	public GetQuoteDriversLicenseInputTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		getQuoteDriversLicenseInput = new GetQuoteDriversLicenseInput();
	}
	
	@Test
	public void getQuoteWithDriversLicenseTest() throws Exception {
		
		getQuoteDriversLicenseInput.getQuoteWithDl();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
