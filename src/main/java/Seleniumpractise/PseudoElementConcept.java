package Seleniumpractise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
        
        String man_field = js.executeScript(script).toString();
        
        System.out.println(man_field);
	}

}
