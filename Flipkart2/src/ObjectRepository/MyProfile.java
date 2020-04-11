package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.FluentIterable;

import FlipkartDemo.FileLib;
import FlipkartDemo.Utility;

public class MyProfile {
	//FileLib f = new FileLib();
	//Utility ut = new Utility();
	//WebDriverWait wait = new WebDriverWait(driver, 20);

	@FindBy(xpath = "//div[text()='Pramod']")
	private WebElement account;

	@FindBy(xpath = "//div[text()='My Profile']")
	private WebElement profile;

	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement edit;

	@FindBy(xpath = "//input[@name=\"firstName\"]")
	private WebElement fnameEd;

	@FindBy(xpath = "//input[@name=\"lastName\"]")
	private WebElement lnameEd;

	@FindBy(xpath = "//label[@for=\"Male\"]")
	private WebElement maleRb;

	@FindBy(xpath = "//input[@name=\"email\"]")
	private WebElement emailEd;

	@FindBy(xpath = "//input[@name=\"mobileNumber\"]")
	
	private WebElement mobilenuEd;
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement edit2;

	public WebElement getEdit2() {
		return edit2;
	}
	
	@FindBy(xpath="//a[text()='Edit']")
	private WebElement edit3;

	public WebElement getEdit3() {
		return edit3;
	}

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement savebutton;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getFnameEd() {
		return fnameEd;
	}

	public WebElement getLnameEd() {
		return lnameEd;
	}

	public WebElement getMaleRb() {
		return maleRb;
	}

	public WebElement getEmailEd() {
		return emailEd;
	}

	public WebElement getMobilenuEd() {
		return mobilenuEd;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
}
//	public void profile(WebDriver driver) throws Exception {
//		ut.MoveToElement(driver, account);
//
//		// ut.MoveToElement(driver, profile);
//		Thread.sleep(2000);
//		profile.click();
//
//		edit.click();
//		fnameEd.click();
//		fnameEd.clear();
//		fnameEd.click();
//		fnameEd.sendKeys(f.getExcelData("Flipkart", 1, 1));
//		lnameEd.click();
//		lnameEd.clear();
//		lnameEd.sendKeys(f.getExcelData("Flipkart", 1, 2));
//		maleRb.click();
//		emailEd.click();
//		emailEd.clear();
//		emailEd.sendKeys(f.getExcelData("Flipkart", 1, 3));
//		mobilenuEd.click();
//		mobilenuEd.clear();
//		mobilenuEd.sendKeys(f.getExcelData("Flipkart", 1, 4));
		//savebutton.click();