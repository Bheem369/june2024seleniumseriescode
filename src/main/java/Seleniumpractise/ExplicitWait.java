package Seleniumpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	static WebDriver driver;

	public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();
        
        By login = By.id("input-emails");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
      WebElement ele =  wait.until(ExpectedConditions.presenceOfElementLocated(login));
      ele.sendKeys("hello@gmail.com");
        
		

	}

}
