package Seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari"))
		{
			driver = new SafariDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("plz pass the right browser" + browser);
		}
		
		driver.get("https://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println("Title:"+ title);
		
		if(title.equals("Google"))
		{
			System.out.println("pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
		driver.quit();

	}
                                  
}
;