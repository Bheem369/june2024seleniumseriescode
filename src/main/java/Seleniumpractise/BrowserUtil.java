package Seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
	
	private WebDriver driver;
	
	/**
	 * 
	 * @param browsername
	 * @return
	 */
	
	public WebDriver initDriver(String browsername)
	{
		System.out.println("Bowser is:"+browsername);
		
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
		
		case "safari":
		{
			driver = new SafariDriver();
			break;
		}
		
		case "edge":
		{
			driver = new EdgeDriver();
			break;
		}
		
		default:
			System.out.println("Please pass the right browser"+ browsername);
			break;
		
	}
		return driver;
		
		
	}

	public void launchURL(String URL)
	{
		if(URL == null)
		{
			System.out.println("URl cannot be null");
		}
		if(URL.indexOf("https")==0)
		{
			driver.get(URL);
		}
			
	}
	
	public String getPageTitle()
	{
		String title = driver.getTitle();
		System.out.println("page title:" +title);
		return title;
	}
	
	public String getPageURL()
	{
		String URL = driver.getCurrentUrl();
		System.out.println("page current url:"+URL);
		return URL;
		
	}
	
	public void closeBrowser()
	{
		if(driver!=null)
		{
			driver.close();
		}
	}
	
	public void quitBrowser()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	
}

