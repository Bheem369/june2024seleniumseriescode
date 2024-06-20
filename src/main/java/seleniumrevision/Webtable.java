package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		driver.manage().window().maximize();
		
		By uname = By.name("username");
		
		By pwd = By.name("password");
		
		Eleutil es = new Eleutil(driver);
		es.doSendKeys(uname, "Bhimashankar");
		es.doSendKeys(pwd, "Shankar@369");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() ='Ali khan Md']/../preceding-sibling::td/input")).click();
		
		
		
		
		

	}

}
