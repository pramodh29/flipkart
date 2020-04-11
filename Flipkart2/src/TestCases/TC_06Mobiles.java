package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import FlipkartDemo.Base;
import ObjectRepository.HomePage;
import ObjectRepository.Mobiles;

public class TC_06Mobiles extends Base {

	@Test
	public void addtowhishlist() throws Throwable {
		HomePage h = PageFactory.initElements(driver, HomePage.class);
		h.search();
		h.getSearch().click();
		Thread.sleep(2000);
		Mobiles m = PageFactory.initElements(driver, Mobiles.class);
		m.getClick().click();
		ut.swtichToNewWindow(driver);
		m.getHeart().click();
		

	}
}
