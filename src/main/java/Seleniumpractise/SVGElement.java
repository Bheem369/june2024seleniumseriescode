package Seleniumpractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map/");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id, 'map-instance')]")));
		
		String svgpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='features']//*[name()='path']";
		
		List<WebElement> statelist = driver.findElements(By.xpath(svgpath));
		
		System.out.println(statelist.size());
		
		for(WebElement e : statelist)
		{
			String Statename = e.getAttribute("name");
			System.out.println(Statename);
		}
		

	}

}
