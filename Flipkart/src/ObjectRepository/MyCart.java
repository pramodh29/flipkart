package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyCart {
	
	@FindBy(xpath = "//span[text()='Cart']")
	private WebElement cart;

	@FindBy(xpath = "//div[text()='Remove']")
	private WebElement removeprd;

	@FindBy(xpath = "//div[text()='Remove']")
	private WebElement remove;

	public WebElement getRemove() {
		return remove;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getRemoveprd() {
		return removeprd;
	}

}
