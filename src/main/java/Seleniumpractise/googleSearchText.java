package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchText {
	
	static WebDriver driver;
	
	public static void main (String args[]) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
      driver.findElement(By.name("q")).sendKeys("naveen automation labs");
      
      Thread.sleep(3000);
      
      
      List<WebElement> sugglist = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));
      System.out.println(sugglist.size());
      
      
      
      
    
	}

}
