package FlipkartDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	/**
	 * This method is used to Select an Option by value
	 * 
	 * @param webElement
	 * @param value
	 * @return void
	 */
	public void selectByValue(WebElement webElement, String value) {
		Select sel = new Select(webElement);
		sel.selectByValue(value);
	}
/**
 * This method is used to switch the driver window
 * @param driver
 * @return
 */
	public String swtichToNewWindow(WebDriver driver) {
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pid = it.next();	
		String cid = it.next();
		driver.switchTo().window(cid);
		return pid;
		
		}

	/**
	 * This method is used to perform movetoelement method of actions class
	 * 
	 * @param element
	 */
	public void MoveToElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

}
