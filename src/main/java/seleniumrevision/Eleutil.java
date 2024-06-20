package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Eleutil {
	
	private WebDriver driver;
	
	
	public Eleutil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value )
	{
		getElement(locator).sendKeys(value);
	}

}
