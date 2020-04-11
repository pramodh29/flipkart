package ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(xpath="//button[text()='✕']")
	private WebElement close;
	

	public WebElement getClose() {
		return close;
	}

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	@FindBy(xpath = "//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement EnterMobileNumber;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordEd;

	@FindBy(xpath = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement loginbutton;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEnterMobileNu() {
		return EnterMobileNumber;
	}

	public WebElement getPassword() {
		return passwordEd;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void login(String username, String password) {
		close.click();
		login.click();
		EnterMobileNumber.sendKeys(username);
		passwordEd.sendKeys(password);
		loginbutton.click();

	}

}
