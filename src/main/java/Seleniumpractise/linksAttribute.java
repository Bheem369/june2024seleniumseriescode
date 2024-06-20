package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksAttribute {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		By links = By.tagName("a");
	//	By images = By.tagName("img"); 
		
		ElementUtil eu = new ElementUtil(driver);
		
		List<WebElement> linklist = eu.getElements(links);
		
		for(WebElement e : linklist)
		{
			String hrefval = e.getAttribute("href");
			String linkText = e.getText();
			
			System.out.println(hrefval + "::" + linkText);
		}
		
		
		
		
		
		
	}

}
