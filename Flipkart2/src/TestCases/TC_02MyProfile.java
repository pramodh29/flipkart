package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FlipkartDemo.Base;
import ObjectRepository.HomePage;
import ObjectRepository.MyProfile;

public class TC_02MyProfile extends Base {
	@Test
	public void profile() throws Exception {
		HomePage hg = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(2000);
		MyProfile mp = PageFactory.initElements(driver, MyProfile.class);
		ut.MoveToElement(driver, mp.getAccount());
		Thread.sleep(2000);
		mp.getProfile().click();
		mp.getEdit().click();
		mp.getFnameEd().click();
		mp.getFnameEd().clear();
		mp.getFnameEd().sendKeys(flib.getExcelData("Flipkart", 1, 1));
		mp.getLnameEd().click();
		mp.getLnameEd().clear();
		mp.getLnameEd().sendKeys(flib.getExcelData("Flipkart", 1, 2));
		mp.getEdit2().click();
		mp.getMaleRb().click();
		mp.getEmailEd().click();
		mp.getEmailEd().clear();
		mp.getEmailEd().sendKeys(flib.getExcelData("Flipkart", 1, 3));
		mp.getEdit3().click();
		mp.getMobilenuEd().click();
		mp.getMobilenuEd().clear();
		mp.getMobilenuEd().sendKeys(flib.getExcelData("Flipkart", 1, 4));
		mp.getSavebutton().click();

	}
}
