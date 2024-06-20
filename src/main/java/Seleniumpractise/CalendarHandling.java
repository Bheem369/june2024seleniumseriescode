package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	
	static WebDriver driver;
	
	public static void getday(String day)
	{
		 driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
	
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		 driver.manage().window().maximize();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
       
        driver.findElement(By.id("datepicker")).click();
        
        
      String opdate =  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
      System.out.println(opdate);
      
  	while(!opdate.equalsIgnoreCase("August 2024"))
  			{
  	            driver.findElement(By.xpath("//span[text()='Next']")).click();
  	          opdate =  driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
  			}
  	
  	 getday("23");
  	  
  	    
        
	}
	
	


	}


