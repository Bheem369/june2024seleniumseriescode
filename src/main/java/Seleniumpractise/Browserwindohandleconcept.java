package Seleniumpractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserwindohandleconcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));

		ele.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentwindow = it.next();
		System.out.println(parentwindow);
		
		String childwindow = it.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println("currenturl:" + driver.getCurrentUrl());
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		System.out.println("currenturl:" + driver.getCurrentUrl());

	}

}
