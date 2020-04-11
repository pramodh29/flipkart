package FlipkartDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import ObjectRepository.Login;

public class Base {

	public WebDriver driver;
	public static FileLib flib = new FileLib();
	public Utility ut = new Utility();
	public static WebDriver Scrdriver;
	public static WebDriverWait wait;

	@BeforeClass
	public void configBeforeclass() {

		if (flib.getPropertyKeyValue("browser").equals("chrome")) {

			driver = new ChromeDriver();
			Scrdriver = driver;
		} else if (flib.getPropertyKeyValue("browser").equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(flib.getPropertyKeyValue("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);

	}

	@BeforeMethod
	public void configBeforeMethod() {
		Login lo = PageFactory.initElements(driver, Login.class);
		lo.login(flib.getPropertyKeyValue("username"), flib.getPropertyKeyValue("password"));
	}

	// @AfterMethod
	// public void configAfterMethod() {
	// WebElement UserLogout =
	// driver.findElement(By.xpath("//img[contains(@src,'user')]"));
	// ut.MoveToElement(driver, UserLogout);
	// driver.findElement(By.linkText("Sign Out")).click();
	// }

	@AfterClass
	public void configAfterclass() {
		driver.quit();

	}
}
