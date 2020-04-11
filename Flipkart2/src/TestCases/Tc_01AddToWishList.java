package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FlipkartDemo.Base;
import FlipkartDemo.Utility;
import ObjectRepository.HomePage;
import ObjectRepository.MenWishlst;

public class Tc_01AddToWishList extends Base {

	@Test
	public void wishlist() throws Exception {

		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(2000);
		MenWishlst mlist = PageFactory.initElements(driver, MenWishlst.class);
		ut.MoveToElement(driver, mlist.getMenDD());
		mlist.getLoaflink().click();
		mlist.getImg().click();
		ut.swtichToNewWindow(driver);
		mlist.getSize().click();
		mlist.getWishlist().click();

	}

}
