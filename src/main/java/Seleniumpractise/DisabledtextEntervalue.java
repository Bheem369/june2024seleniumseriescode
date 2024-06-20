package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledtextEntervalue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("test@123");

	}

}
