package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import FlipkartDemo.FileLib;

public class HomePage {
	@FindBy(xpath = "//input[@name='q']")
	private WebElement Search;

	public WebElement getSearch() {
		return Search;
	}

	public void search() {
		FileLib f = new FileLib();
		Search.sendKeys(f.getExcelData("Flipkart", 1, 0));
	
	}

}
