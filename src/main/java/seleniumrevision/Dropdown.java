package seleniumrevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.name("Country"));
		
		Select select = new Select(s);
		
		List<WebElement> optlist = select.getOptions();
		
		System.out.println(optlist.size());
		
		
		
		for(WebElement e : optlist)
		{
			String text = e.getText();
			System.out.println(text);
			if(text.equals("India"))
					{
				      e.click();
				      break;
					}
		}
		
		

	}

}
