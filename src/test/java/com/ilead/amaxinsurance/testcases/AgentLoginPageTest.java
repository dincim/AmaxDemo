package com.ilead.amaxinsurance.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentLoginPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://ilead.amaxinsurance.com/");
		
		
		
	}
	
	@Test(enabled=true)
	void verifyIleadLoginPageTitleTest() {
		//driver.findElement(By.xpath("/html/body/app-root/div[1]/div[4]/div/span")).click();
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, "A-MAX iLead");
		
	}
	
	@Test
	void verifyIleadAgentPageTitleTest() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/app-root/div[1]/div[4]/div/span")).click();
		driver.findElement(By.cssSelector("[name = username]")).sendKeys("mdinc@amaxinsurance.com");
		driver.findElement(By.cssSelector("[name = password]")).sendKeys("0571");
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("[type = submit]")).click();
		
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "A-MAX iLead");
	}
	

	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
