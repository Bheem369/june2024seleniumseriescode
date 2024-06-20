package Seleniumpractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowdom {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-%20in-shadow-dom/");
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		pizza.sendKeys("Veg Pizza");
		

	}

}
