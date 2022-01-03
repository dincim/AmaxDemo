package com.amaxinsurance.testcases.aboutamax;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amaxinsurance.pages.aboutamax.NewsAndEventsPage;
import com.amaxweb.base.TestBase;

public class NewsAndEventsPageTitleTest extends TestBase {
	
	NewsAndEventsPage newsAndEventsPage;
	
	public NewsAndEventsPageTitleTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		newsAndEventsPage = new NewsAndEventsPage();
	}

	@Test
	void verifyNewsAndEventsPageTitleTest() throws Exception {

		newsAndEventsPage.getTitle();

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("News Events", title,"Title No match");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
