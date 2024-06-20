package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(1500);
		
		WebElement ele = driver.findElement(By.linkText("Wood Buffalo, Canada"));
		
		String rightindex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightindex);
		
		String leftindex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftindex);
		
		String aboveindex = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveindex);
		
		String belowindex = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowindex);
		

	}

}
