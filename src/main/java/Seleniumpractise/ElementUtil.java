package Seleniumpractise;

import java.util.ArrayList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public  WebElement getElement(By Locator)
	{
		return driver.findElement(Locator);				
	}
	
	public  void doSendkeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public void doclick(By locator)
	{
		getElement(locator).click();
	}
	
	public boolean doElementisDisplayed(By locator)
	{
	       return getElement(locator).isDisplayed();
	}

	public String getElementAtrribute(By locator, String AttrName)
	
	{
		 return driver.findElement(locator).getAttribute(AttrName);
	}
	
	public List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	
	public List<String> getElementsTextList(By locator)
	{
		List<String> eletextlist = new ArrayList<String>();
		List<WebElement> elelist = getElements(locator);
		for(WebElement e : elelist)
		{
			String text = e.getText();
			eletextlist.add(text);
		}
		return eletextlist;
	}
	
	
public void doSelectDropDownbyIndex(By locator, int index)
{
	Select select = new Select(getElement(locator));
	select.selectByIndex(index);
}

public void doSelectDropDownbyValue(By locator, String value)
{
	Select select = new Select(getElement(locator));
	select.selectByValue(value);
}
}
