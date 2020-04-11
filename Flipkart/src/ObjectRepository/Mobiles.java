package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import FlipkartDemo.Utility;

public class Mobiles {

	@FindBy(xpath = "//div[text()='Apple iPhone 11 (Black, 128 GB)']/../../div[2]/div/div/div[1]")
	private WebElement Mobiles;

	@FindBy(xpath = "//div[@class='_3gDSOa _32A6AP']")
	private WebElement Click;

	
	public WebElement getClick() {
		return Click;
	}
	
	public WebElement getMobiles() {
		return Mobiles;
	}
	
	@FindBy(xpath = "//div[@class='_3gDSOa _13EqDR']")
	private WebElement Heart;

	public WebElement getHeart() {
		return Heart;
	}

	public void captureprice() {
		Mobiles.click();
		String print = Mobiles.getText();
		Reporter.log("print");
	
	}

//	public void addtowishlist() {
//		Click.click();
//	}
//
//	public void heart() {
//		Heart.click();
//	}

}
