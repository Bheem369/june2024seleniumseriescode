package seleniumrevision;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynxpath {
	
	 WebDriver driver;
	
	public void display(String name)
	{
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		List<WebElement> flist = driver.findElements(By.xpath("//h5[text() = '"+name+"']//following-sibling::ul/li//a"));
		int x = flist.size();
		System.out.println(x);
		
		for(WebElement e : flist)
		{
			String s = e.getText();
			List<String> s1 = new ArrayList<String>();
			s1.add(s);	
			System.out.println(s1);
			
		}
		
	}
	


	public static void main(String[] args) 
	{
		
		
		dynxpath dx = new dynxpath();
		dx.display("My Account");
		dx.display("Extras");
		
		
		
		
		//h5[text() = 'My Account']//following-sibling::ul/li//a[1]

	}
	


}
