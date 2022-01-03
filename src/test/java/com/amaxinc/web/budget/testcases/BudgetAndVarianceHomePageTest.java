package com.amaxinc.web.budget.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BudgetAndVarianceHomePageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://18.216.112.189:8083/");
		driver.findElement(By.cssSelector("[type = email]")).sendKeys("admin@admin.com");
		driver.findElement(By.cssSelector("[type = password]")).sendKeys("admin@2021#");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
	}
	
	@Test
	public void getPageTitleTest() {
		
		String actualTitle = driver.getTitle();
		System.out.println("Page title is "+actualTitle);
		
		Assert.assertEquals(actualTitle, "AmaxInc.Web.Budget");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
