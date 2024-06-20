package Seleniumpractise;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        String parentwindow = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		WebElement tele = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fele = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement yele = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement lele = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		tele.click();
		fele.click();
		yele.click();
		lele.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext())
		{
			String windowid = it.next();
			driver.switchTo().window(windowid);
			System.out.println("currenturl:" + driver.getCurrentUrl());
			Thread.sleep(1000);
			
			if(!windowid.equals(parentwindow))
			{
				driver.close();
			}
		}
		
		driver.switchTo().window(parentwindow);
		System.out.println("currenturl:" + driver.getCurrentUrl());
		
		

	}

}
