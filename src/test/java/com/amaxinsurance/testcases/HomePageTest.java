package com.amaxinsurance.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.HomePage;
import com.amaxweb.base.TestBase;

public class HomePageTest extends TestBase {

	HomePage homepage;

	public HomePageTest() {
		super();
	}
// Test cases should be seperated -- independent with each other
	//before each test case launch the browser
	//@test--execute test case
	//after each test case
	@BeforeMethod
	public void setUp() {
		initialization();
		homepage = new HomePage();
	}

	@Test(enabled = false)
	public void homePageTitleTest() {
		
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "A-MAX Auto Insurance | Affordable Car Insurance");

	}
	
	@AfterMethod(enabled = true)
	public void tearDown() {
		driver.quit();
	}

}
