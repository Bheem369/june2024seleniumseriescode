package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		WebElement srcele = driver.findElement(By.id("draggable"));
		WebElement trgele = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		
		
		act.clickAndHold(srcele).moveToElement(trgele).release().perform();
		

	}

}
