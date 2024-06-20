package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {

	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        
        
       // String ph = driver.findElement(By.name("firstname")).getAttribute("placeholder");
       // System.out.println(ph);
        
      //  String srctext = driver.findElement(By.className("img-responsive")).getAttribute("src");
      //  System.out.println(srctext);
        
        By fn = By.name("firstname");
        By logo = By.className("img-responsive");
        
        ElementUtil eu = new ElementUtil(driver);
       String ph = eu.getElementAtrribute(fn, "placeholder");
       String srctext =  eu.getElementAtrribute(logo, "src");
       
       System.out.println(ph);
       System.out.println(srctext);
	}
}
