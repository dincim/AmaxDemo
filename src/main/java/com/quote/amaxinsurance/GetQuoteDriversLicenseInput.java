package com.quote.amaxinsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amaxweb.base.TestBase;

public class GetQuoteDriversLicenseInput extends TestBase {
	//Page Factory--OR
		@FindBy(xpath = "//input[@id='form-text-1424848195']")
		WebElement zipCode;
		
		@FindBy(xpath = "//button[@id='form-button-314788994']")
		WebElement getQuoteBtn;
		
		@FindBy(xpath = "//input[@name='licenseId']")
		WebElement dlField;
		
		@FindBy(xpath = "//div[@class='pointer custom-checkbox']")
		WebElement checkBox;
		
		@FindBy(xpath = "//button[@class='c-btn-red custom-hover filled block']")
		WebElement nxtBtn;
		
		@FindBy(xpath = "//button[@class='c-btn-red custom-hover filled block']")
		WebElement nextBtn;
		
		@FindBy(xpath = "//label[@for='id-maritalStatus-1']")
		WebElement checkMarried;
		
		@FindBy(xpath = "//label[@for='id-gender-0']")
		WebElement checkGender;
		
		@FindBy(xpath = "//label[@for='id-isInsured-0']")
		WebElement checkInsuredYes;
		
		@FindBy(xpath = "//button[contains(text(),'Next')]")
		WebElement nextBtnNext;
		
		@FindBy(xpath = "//button[contains(text(),'No, Next')]")
		WebElement noNextBtn;
		
		@FindBy(xpath = "//button[@class='list-group-item list-group-item-action carItemButton'][1]")
		WebElement selectCar;
		
		@FindBy(xpath = "//button[contains(text(),'Next')]")
		WebElement nextBtnAfteCarSelect;
		
		@FindBy(xpath = "//button[@class='c-btn-red custom-hover m-b-20 multiLine filled block']")
		WebElement nextBtnToQuote;
		
		@FindBy(xpath = "//input[@type='tel']")
		WebElement phoneField;
		
		@FindBy(xpath = "//input[@name='email']")
		WebElement emailField;
		
		@FindBy(xpath = "//span[contains(text(),'Continue')]")
		WebElement continueBtn;
		
		@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
		WebElement okBtn;
		
				
		//method for using OR/initializing the page objects
		public GetQuoteDriversLicenseInput() {
			
			PageFactory.initElements(driver, this);
		}
		
		public void getQuoteWithDl() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			zipCode.sendKeys("75074");
			getQuoteBtn.click();
			dlField.sendKeys("113");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,600)");
			checkBox.click();
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-200)");
			nxtBtn.click();
			Thread.sleep(3000);
			nextBtn.click();
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-400)");
			Thread.sleep(2000);
			checkMarried.click();
			checkGender.click();
			checkInsuredYes.click();
			Thread.sleep(3000);
			nextBtnNext.click();
			noNextBtn.click();
			
			selectCar.click();
//			((JavascriptExecutor) driver)
//		     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript(
		            "arguments[0].scrollIntoView();", nextBtnAfteCarSelect);
			Thread.sleep(6000);
			nextBtnAfteCarSelect.click();
			Thread.sleep(3000);
			js.executeScript("arguments[0].scrollIntoView();",nextBtnToQuote);
			js.executeScript("arguments[0].click();",nextBtnToQuote);
			//nextBtnToQuote.click();
			//Thread.sleep(3000);
			WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement phone ;
			phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='phone']")));
			phone.sendKeys("0900900990");
			emailField.sendKeys("test@test.com");
			continueBtn.click();
			okBtn.click();	
		}

}
