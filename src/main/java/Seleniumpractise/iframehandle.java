package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/human-resources/employment-application-form/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@title='Employment-Application-Forms-and-Examples']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-6")).sendKeys("876543257865");
		
		driver.switchTo().defaultContent();

	}

}
