package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisnotPresent {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        
        ElementUtil e1 = new ElementUtil(driver);
        
        By image = By.className("logo-image");
        
        
        
        boolean flagimg = e1.doElementisDisplayed(image);
        System.out.println(flagimg);

	}

}
