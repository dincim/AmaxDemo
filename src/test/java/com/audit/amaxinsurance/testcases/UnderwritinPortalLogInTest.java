package com.audit.amaxinsurance.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnderwritinPortalLogInTest {
	
	WebDriver driver;
	String baseUrl = "http://audit.amaxinsurance.com/";
	
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
	}
	
	@Test
	public void checkUnderWritingPageTitleTest() {
		
		String expectedTitle = "Audit Login Panel";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Test
	public void loginUnderWritingPortalTest() throws InterruptedException {
		
		driver.findElement(By.cssSelector("#email")).sendKeys("acazares@amaxinsurance.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("123456");
		driver.findElement(By.cssSelector("[type=submit]")).click();
		
		Thread.sleep(3000);
		//WebElement expectedText = driver.findElement(By.xpath("//span[text()='Logged in as  Admin  ']"));
		String actualTitle = driver.getTitle();
		System.out.println("Logged as in: "+actualTitle);
		String expectedTitle = "Admin-Dashboard";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
