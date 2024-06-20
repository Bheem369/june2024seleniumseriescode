package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectdropdownAllElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/try-it-free");
        
        By country = By.id("Form_getForm_Country");
        
        Select select = new Select(driver.findElement(country));
        
             List<WebElement> countrylist =  select.getOptions();
             
             System.out.println(countrylist.size());
             
             for(WebElement e : countrylist)
             {
            	 String text = e.getText();
            	 System.out.println(text);
            	 if(text.equals("Brazil"))
            	 {
            		e.click(); 
            		break;
            	 }
            	 }

	}

}
