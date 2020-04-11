package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FlipkartDemo.Base;
import ObjectRepository.HomePage;
import ObjectRepository.Wishlist;

public class TC_08DeleteWishList extends Base {
	@Test
	public void Delete() throws Exception {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(2000);
		Wishlist w = PageFactory.initElements(driver, Wishlist.class);
		ut.MoveToElement(driver, w.getAccount());
		Thread.sleep(2000);
		w.getWishlist().click();
		w.getDelete().click();
		w.getYesdelete().click();

	}

}
