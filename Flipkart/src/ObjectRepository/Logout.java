package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
	@FindBy(xpath = "//div[text()='Pramod']")
	private WebElement account;

	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logutbt;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getLogutbt() {
		return logutbt;
	}

}
