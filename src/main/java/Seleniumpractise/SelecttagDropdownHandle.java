package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelecttagDropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/try-it-free");
        
        By country = By.id("Form_getForm_Country");
        
  //      WebElement country_ele = driver.findElement(country);
        
  //      Select select = new Select(country_ele);
        
  //      select.selectByIndex(5);
        
  //      select.selectByValue("Algeria");
        
   //     select.selectByVisibleText("Benin");
        
        ElementUtil eu = new ElementUtil(driver);
        eu.doSelectDropDownbyIndex(country, 1);
      //  Thread.sleep(5000);
      //  eu.doSelectDropDownbyValue(country,"Bermuda");
        
        

	}

}
