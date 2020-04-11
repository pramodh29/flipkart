package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FlipkartDemo.Base;
import ObjectRepository.HomePage;
import ObjectRepository.MyCart;

public class TC_03MyCart extends Base {
	@Test
	public void Mycart() throws Exception {
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		Thread.sleep(2000);
		MyCart mc=PageFactory.initElements(driver, MyCart.class);
		mc.getCart().click();
		mc.getRemoveprd().click();
		mc.getRemove().click();
		
		
	}

}
