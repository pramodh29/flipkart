package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FlipkartDemo.Base;
import ObjectRepository.HomeNFurniture;
import ObjectRepository.HomePage;

public class TC_04HomeNFurniture extends Base {

	@Test
	public void wishlist() throws InterruptedException {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(2000);
		HomeNFurniture hf = PageFactory.initElements(driver, HomeNFurniture.class);
		ut.MoveToElement(driver, hf.getHomefr());
		hf.getHomefr().click();
		Thread.sleep(1000);
		hf.getSofa().click();
		hf.getLowtohigh().click();
		hf.getImg().click();
		ut.swtichToNewWindow(driver);
		hf.getWishlist().click();

	}

}
