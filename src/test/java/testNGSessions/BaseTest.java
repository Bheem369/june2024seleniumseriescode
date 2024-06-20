package testNGSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url, String browser)
	{
		System.out.println("running test on" + browser);
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("plz pass the right browser" + browser);
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}

	
//@AfterTest
//	
//	void tearDown()
//	{
//		driver.close();
//	}
}
