package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsfromPageSection {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        
        
    //   List<WebElement> panellinklist =  driver.findElements(By.xpath("//aside[@id='column-right']//a"));
       
   //   System.out.println(panellinklist.size());
       
   //    for(WebElement e : panellinklist)
   //    {
  //  	   String text = e.getText();
  //  	   System.out.println(text);
  //     }
        
       By li =  By.xpath("//aside[@id='column-right']//a");
        
        ElementUtil eu = new ElementUtil(driver);
       List<String> eli =  eu.getElementsTextList(li);
       
      System.out.println(eli);
         
	}

}
