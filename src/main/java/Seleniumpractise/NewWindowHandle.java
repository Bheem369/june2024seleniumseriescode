package Seleniumpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        String parentwindow = driver.getWindowHandle();
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        driver.get("https://www.google.com");
        System.out.println("childwindowtittle:" + driver.getTitle());
        
        driver.close();
        
        driver.switchTo().window(parentwindow);
        System.out.println("parentwindowtittle:" + driver.getTitle());
        

	}

}
