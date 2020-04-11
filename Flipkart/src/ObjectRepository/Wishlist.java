package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Wishlist {
	@FindBy(xpath = "//div[text()='Pramod']")
	private WebElement account;

	@FindBy(xpath = "//div[text()='Wishlist']")
	private WebElement Wishlist;

	@FindBy(xpath = "//img[@class='_27LgAY']")
	private WebElement delete;
	
	public WebElement getAccount() {
		return account;
	}

	public WebElement getWishlist() {
		return Wishlist;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getYesdelete() {
		return yesdelete;
	}

	@FindBy(xpath = "//button[text()='YES, REMOVE']")
	private WebElement yesdelete;
}
