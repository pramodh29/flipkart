package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenWishlst {
	@FindBy(xpath = "//span[text()='Men']")
	private WebElement MenDD;
	
	public WebElement getMenDD() {
		return MenDD;
	}

	public WebElement getLoaflink() {
		return loaflink;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getWishlist() {
		return Wishlist;
	}

	@FindBy(xpath="//a[@title='Loafers']")
	private WebElement loaflink;
	
	@FindBy(xpath="//img[@class='_3togXc']")
	private WebElement img;
	
	@FindBy(xpath="//a[text()='8']")
	private WebElement size;
	
	@FindBy(xpath="//div[contains(@class,'_3gDSOa')]")
	private WebElement Wishlist;
	


}
