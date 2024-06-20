package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	
	public static void main (String args[])
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        
        List<WebElement> images =  driver.findElements(By.tagName("img"));
        System.out.println(images.size());
        
	}

}
