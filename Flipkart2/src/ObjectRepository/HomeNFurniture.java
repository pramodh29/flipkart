package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeNFurniture {
	@FindBy(xpath = "//span[text()='Home & Furniture']")
	private WebElement homefr;

	@FindBy(xpath = "//a[@title='Sofa Beds']")
	private WebElement sofa;

	@FindBy(xpath = "//img[@class='_1Nyybr  _30XEf0']")
	private WebElement img;

	@FindBy(xpath = "//div[text()='Price -- Low to High']")
	private WebElement lowtohigh;

	@FindBy(xpath = "//div[@class='_3gDSOa _13EqDR']")
	private WebElement wishlist;

	public WebElement getImg() {
		return img;
	}

	public WebElement getHomefr() {
		return homefr;
	}

	public WebElement getSofa() {
		return sofa;
	}

	public WebElement getLowtohigh() {
		return lowtohigh;
	}

	@FindBy(xpath="//span[text()='Change']")
	private WebElement changepin;
	
	public WebElement getChangepin() {
		return changepin;
	}

	@FindBy(xpath="//input[@id='pincodeInputId']")
	private WebElement enterpin;
	
	public WebElement getEnterpin() {
		return enterpin;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

}
