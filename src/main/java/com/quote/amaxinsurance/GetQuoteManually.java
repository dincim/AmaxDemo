package com.quote.amaxinsurance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amaxweb.base.TestBase;

public class GetQuoteManually extends TestBase {

	// Page Factory--OR
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

	@FindBy(xpath = "//button[@class='list-group-item list-group-item-action carItemButton'][2]")
	WebElement selectCar;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement nextBtnAfteCarSelect;

	@FindBy(xpath = "//button[@class='c-btn-red custom-hover m-b-20 multiLine filled block']")
	WebElement nextBtnToQuote;

	@FindBy(css = "[name='phone']")
	WebElement phoneField;

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailField;

	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	WebElement continueBtn;

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	WebElement okBtn;

	@FindBy(xpath = "//input[@name='name']")
	WebElement nameInput;

	@FindBy(xpath = "//input[@name='surname']")
	WebElement lNameInput;

	@FindBy(xpath = "//button[@class='circle-button']")
	WebElement circleBtn;

	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement monthSelect;

	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement yearSelect;

	@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--010']")
	WebElement daySelect;

	@FindBy(xpath = "//input[@name='detail']")
	WebElement addressInput;

	@FindBy(xpath = "//button[@class='list-group-item list-group-item-action'][4]")
	WebElement selectCarYear;

	@FindBy(xpath = "//button[@class='list-group-item list-group-item-action'][15]")
	WebElement selectCarMake;

	@FindBy(xpath = "//button[@class='list-group-item list-group-item-action'][3]")
	WebElement selectCarModel;

	

	// method for using OR/initializing the page objects
	public GetQuoteManually() {

		PageFactory.initElements(driver, this);
	}

	public void getQuoteManually() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		zipCode.sendKeys("75074");
		getQuoteBtn.click();

		nameInput.sendKeys("Tester");
		lNameInput.sendKeys("Tests");
		circleBtn.click();
		Thread.sleep(2000);

		Select dobMonth = new Select(monthSelect);
		dobMonth.selectByVisibleText("January");

		Select dobYear = new Select(yearSelect);
		dobYear.selectByValue("2000");
		daySelect.click();

		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(1000);
		checkBox.click();
		Thread.sleep(2000);
		nxtBtn.click();
		js.executeScript("window.scrollBy(0,-200)");
		addressInput.sendKeys("3030 Stemmons Fwy");
		nxtBtn.click();
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-300)");
		checkMarried.click();
		checkGender.click();
		checkInsuredYes.click();
		Thread.sleep(2000);
		nextBtnNext.click();
		selectCarYear.click();
		Thread.sleep(1000);
		selectCarMake.click();
		Thread.sleep(1000);
		selectCarModel.click();
		Thread.sleep(1000);
		nextBtnAfteCarSelect.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", nextBtnToQuote);
		js.executeScript("arguments[0].click();", nextBtnToQuote);
		// nextBtnToQuote.click();
		// Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement phone;
		phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='phone']")));
		phone.sendKeys("0900900990");
		phoneField.sendKeys("0900900990");
		emailField.sendKeys("test@test.com");
		continueBtn.click();
		okBtn.click();

	}

}
