package Seleniumpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForFrameElement {
	static WebDriver driver;

	public static void main(String[] args) {
		
		    driver = new ChromeDriver();
	        driver.get("https://www.londonfreelance.org/courses/frames/index.html");
	        driver.manage().window().maximize();
	        
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        By framename = By.name("main");
	        
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framename)); 	        
        
//	        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
            String text = driver.findElement(By.tagName("h2")).getText();	
            System.out.println(text);
		
	}

}
