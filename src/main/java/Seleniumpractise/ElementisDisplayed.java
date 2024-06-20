package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WebDriver driver = new ChromeDriver();
          driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
          
   //     boolean flagimg = driver.findElement(By.className("img-responsive")).isDisplayed();
   //     boolean flagsearch = driver.findElement(By.name("search")).isDisplayed();
          ElementUtil e1 = new ElementUtil(driver);
          
          By image = By.className("logo-image");
          By macsearch = By.name("search");
          
          boolean flagimg = e1.doElementisDisplayed(image);
          boolean flagsearch = e1.doElementisDisplayed(macsearch);
        
        
        if(flagimg)
        {
        	System.out.println("Pass");
        }
        
        if(flagsearch)
        {
        	System.out.println("Pass");
        	driver.findElement(By.name("search")).sendKeys("macbook");
        	
        }
        
        
        
        By click = By.cssSelector("#search > span > button");
        
       e1.doclick(click);
	}

}
