package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//	driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
	//	driver.findElement(By.id("input-password")).sendKeys("naveen@123");
		
		
	//	WebElement emailid = driver.findElement(By.id("input-email"));
	//	WebElement password = driver.findElement(By.id("input-password"));
	//	emailid.sendKeys("naveen@gmail.com");
	//	password.sendKeys("naveen@123");
		
	//	By emailid= By.id("input-email");
	//	By password = By.id("input-password");
	//	WebElement eid = driver.findElement(emailid);
	//	WebElement pd = driver.findElement(password);
	//	eid.sendKeys("naveen@gmail.com");
	//	pd.sendKeys("naveen@123"); 
		
		
	//	By emailid= By.id("input-email");
	//	By password = By.id("input-password");
		
	//	getElement(emailid).sendKeys("naveen@gmail.com");
	//	getElement(password).sendKeys("naveen@123");
		
		By emailid= By.id("input-email");
		By password = By.id("input-password");
			
		ElementUtil eUtil = new ElementUtil(driver);
		
		eUtil.doSendkeys(emailid,"naveen@gmail.com");
		eUtil.doSendkeys(password,"naveen@123");
			
		}
		
	public static WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);				
	}
	
	public static void doSendkeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}

}
