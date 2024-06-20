package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {
	
	static WebDriver driver;
	
	
	
	public static void main(String[] args) 
	{
		 driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	//	int headercount = getTableheaderCount();
	//	System.out.println(headercount);
		
		//table[@]id="customers"]/tbody/tr[2]/td[1]
		
	
	
	String beforexpath = "//table[@id=\"customers\"]/tbody/tr[";
	String afterxpath = "]/td[1]";

	for(int row=2; row<=7; row++)
	{
		String xpath = beforexpath + row + afterxpath;
		//System.out.println(xpath);
		String Val = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(Val);
	}
	}
	
	public static int getTableheaderCount()
	{
		return driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
	}

}
