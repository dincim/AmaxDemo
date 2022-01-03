package com.amaxinsurance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amaxweb.base.TestBase;

public class HomePage extends TestBase {
	
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
	
	@FindBy(xpath = "//button[contains(text(),'Get Insurance')]")
	WebElement quoteMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Motorcycle')]")
	WebElement motorcycleLink;
	
	//method for using OR/initializing the page objects
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateHomePageTitle() {
		return driver.getTitle();	
	}
}
