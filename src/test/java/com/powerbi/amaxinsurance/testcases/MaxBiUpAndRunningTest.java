package com.powerbi.amaxinsurance.testcases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MaxBiUpAndRunningTest {
	WebDriver driver;
	String baseUrl = "http://powerbi.amaxinsurance.com/";

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		driver.findElement(By.xpath("//div[@class='hod-login login-div']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mdinc@amaxinsurance.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mdinc2020!");
		driver.findElement(By.xpath("//button[@class='login-btn']")).click();
	}

	// @Parameters({"url","username","password"})
	@Test(enabled = true)
	// public void verifyLogInTest(String url,String username,String password)
	// throws InterruptedException, ParseException {
	public void verifyLogInTest() throws Exception {
//		System.out.println("url is "+url);
//		driver.get(url);

//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

		Thread.sleep(3000);
		WebElement createdQuoteData = driver
				.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div/div[3]"
						+ "/table[2]/tbody/tr[2]/td[3]/app-dashboardquotes/table/tbody/tr[1]/td[2]"));
		System.out.println(createdQuoteData.getText());

		String b = "00";
		if (createdQuoteData.equals(b)) {
			System.out.println("Value is zero. Test failed");
		} else {
			System.out.println("Not zero. Test passed");
		}
	}

	@Test
	public void verifyLiveDataUpAndRunningTest(){

		String parent = driver.getWindowHandle();

		System.out.println("Parent window id is " + parent);

		driver.findElement(By.xpath("//span[text()='Live Data App ']")).click();

		Set<String> allHandles = driver.getWindowHandles();

		for (String handle : allHandles) {
			
			if (!handle.equals(parent)) {
				
				driver.switchTo().window(handle);
				String actualTitle = driver.getTitle();
				System.out.println(actualTitle);
				Assert.assertEquals(actualTitle, "Amax.LiveData");
//				 driver.close(); //closing child window
//		         driver.switchTo().window(parent); //cntrl to parent window
			}
		}

	}

	@AfterMethod
	public void tearDown() {
		 driver.quit();
	}
}
