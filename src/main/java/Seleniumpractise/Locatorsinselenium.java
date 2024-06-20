package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsinselenium {
	
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//	driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
		
	//	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
	//	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("naveen");
	//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
	//	By emailid = By.xpath("//*[@id=\"input-email\"]");
	//	By password = By.xpath("//*[@id=\"input-password\"]");
	//	By loginbtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		
		ElementUtil etl = new ElementUtil(driver);
	//	etl.doSendkeys(emailid,"test@gmail.com");
	//	etl.doSendkeys(password,"test");
	//	etl.doclick(loginbtn);
		
		
	//	driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
	//	driver.findElement(By.cssSelector("#input-password")).sendKeys("naveen");
	//	driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
	//	driver.findElement(By.linkText("Address Book")).click();
		
	//	By Addressbooklink = By.linkText("Address Book");
	//	etl.doclick(Addressbooklink);
		
	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
	}
}
