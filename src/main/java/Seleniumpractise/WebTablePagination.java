package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	
     static WebDriver driver;
      
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
	
		
		while(true)
		{
			if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0)
			{
				selectCountry("Hong Kong");
				break;
				
			}
			
			else
				
				driver.findElement(By.linkText("Next")).click();
			
				
		}
		
		
		//td[text()='Hong Kong']/preceding-sibling::td//input[@type='checkbox']
		
		

	}
	
	public static void selectCountry(String Countryname)
	{
		driver.findElement(By.xpath("//td[text()='"+Countryname+"']/preceding-sibling::td//input[@type='checkbox']")).click();
	}
	

}
