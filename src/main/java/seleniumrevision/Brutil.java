package seleniumrevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brutil {
	
	public WebDriver driver;

	public WebDriver initDriver(String browsername)
	{
		System.out.println("Browsername:" + browsername);
		
		switch(browsername.toLowerCase().trim())
		{
		case "chrome":
		{
			driver = new ChromeDriver();
			break;
		}
		
		case "firefox":
		{
			driver = new FirefoxDriver();
			break;
		}
		
		default:
		{
			System.out.println("Plz pass the right browser");
			break;
		}
		
		}
		return driver;
	}
	
	public void closeBrowser()
	{
		if(driver!=null)
		{
			driver.close();
		}
	}
		
		
		
		
		

	}


