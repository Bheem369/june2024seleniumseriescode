package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("naveen@gmail.com");
		driver.navigate().refresh();
		fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("gurjeet@gmail.com");

	}

}
