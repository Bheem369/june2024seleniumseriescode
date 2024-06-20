package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class customXpathConcept {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		
		//xpath with 2 Attributes
	//	driver.findElement(By.xpath("//input[@name='email' and  @id='input-email']")).sendKeys("hello@gmail.com");
		
		
		//xpath with text
		
	//	WebElement s = driver.findElement(By.xpath("//h2[text() ='Returning Customer']"));
	//	System.out.println(s.getSize());
		
	//	By s = By.xpath("//input[contains(@placeholder,'Address')]");
	//	WebElement e = driver.findElement(s);
	//    String text = e.getText();
	    
	   By x =(By.xpath("//input[@id='input-email']/preceding-sibling::label"));
	   WebElement text = driver.findElement(x);
	   System.out.println(text.getText()); 
	    

	}

}
