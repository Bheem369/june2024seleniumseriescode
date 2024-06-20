package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelanguagelinks {

	      static WebDriver driver;
	      
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
		
List<WebElement> langlist = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

System.out.println(langlist.size());


for(WebElement e : langlist)
{
	String text = e.getText();
	System.out.println(text);
	if(text.equals("मराठी"));
	{
	   e.click();
	   break;
	}
}
	}

}
