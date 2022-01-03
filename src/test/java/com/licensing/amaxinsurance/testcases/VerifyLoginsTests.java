package com.licensing.amaxinsurance.testcases;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLoginsTests {
	
	WebDriver driver;
	String baseUrl ="https://licensing.amaxinsurance.com/";
	
	
	@BeforeMethod
	void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);		
	}
	
	@Test
	void loginHRTest() throws InterruptedException {
		
		driver.findElement(By.cssSelector("[name=username]")).sendKeys("acazares@amaxinsurance.com");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("1234");
		driver.findElement(By.cssSelector("[class=auth0-label-submit]")).click();
		
		//WebElement myLicensesPage = driver.findElement(By.xpath("//span[text()=' Alexis Cazares Flores (AGENT) ']"));
		Thread.sleep(3000);
		
		String expectedTitle= "A-MAX License Portal";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
		
	}

	@Test
	void loginLDTest() throws InterruptedException {
		driver.findElement(By.cssSelector("[name=username]")).sendKeys("mozcan@amaxinsurance.com");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("1234");
		driver.findElement(By.cssSelector("[class=auth0-label-submit]")).click();
		
		//WebElement myLicensesPage = driver.findElement(By.xpath("//span[text()=' Alexis Cazares Flores (AGENT) ']"));
		Thread.sleep(3000);
		
		String expectedTitle= "A-MAX License Portal";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}
	@Test
	void loginAgentTest() throws InterruptedException {
		driver.findElement(By.cssSelector("[name=username]")).sendKeys("mdinc@amaxinsurance.com");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("1234");
		driver.findElement(By.cssSelector("[class=auth0-label-submit]")).click();
		
		//WebElement myLicensesPage = driver.findElement(By.xpath("//span[text()=' Alexis Cazares Flores (AGENT) ']"));
		Thread.sleep(3000);
		
		String expectedTitle= "A-MAX License Portal";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}
	@Test
	void loginSystemAdminTest() throws InterruptedException {
		driver.findElement(By.cssSelector("[name=username]")).sendKeys("dmcdonald@amaxinsurance.com");
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("1234");
		driver.findElement(By.cssSelector("[class=auth0-label-submit]")).click();
		
		//WebElement myLicensesPage = driver.findElement(By.xpath("//span[text()=' Alexis Cazares Flores (AGENT) ']"));
		Thread.sleep(3000);
		
		String expectedTitle= "A-MAX License Portal";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}
	
	@AfterMethod
	void tearDown() {
		driver.quit();
	}

}
