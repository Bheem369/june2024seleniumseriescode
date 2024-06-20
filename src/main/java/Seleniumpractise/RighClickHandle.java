package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RighClickHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rtele = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		
	     Actions act = new Actions(driver);
	     
	     act.contextClick(rtele).build().perform();
	     
	     List<WebElement> rhtele = driver.findElements(By.xpath("//li[span]"));
	     
	     System.out.println(rhtele.size());
	     
	     for(WebElement e : rhtele)
	     {
	    	 String text = e.getText();
	    	 System.out.println(text);
	    	 
	    	 if(text.equals("Copy"))
	    	 {
	    		 e.click();
	    		 break;
	    	 }
	     }
	}

}
