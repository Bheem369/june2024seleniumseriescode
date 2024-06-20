package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crictableinfo {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-ashes-2023-1336037/england-vs-australia-3rd-test-1336045/full-scorecard");
		Thread.sleep(4000);
		
		getwickettakername("Will Jacks");
	}
		
		public static String getwickettakername(String batsmanName) 
		{
		 return driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td//span/span")).getText();
		}
		
		
	}


