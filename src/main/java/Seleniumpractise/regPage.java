package Seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class regPage {

	
	public static void main(String[] args) {
		
            String browsername = "chrome";
            
            BrowserUtil bru = new BrowserUtil();
            bru.initDriver(browsername);
            
            bru.getPageTitle();
            WebDriver driver = bru.initDriver(browsername);
            bru.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
            
            By firstname = By.id("input-firstname");
            By lastname = By.id("input-lastname");
            By email = By.id("input-email");
            By telephone = By.id("input-telephone");
            By password = By.id("input-password");
            By confpass = By.id("input-confirm");
            
            ElementUtil eu = new ElementUtil(driver);
            eu.doSendkeys(firstname, "geetha");
            eu.doSendkeys(lastname, "krishna");
            eu.doSendkeys(email, "geetha@gmail.com");
            eu.doSendkeys(telephone, "9848107894");
            eu.doSendkeys(password, "geetha369");
            eu.doSendkeys(confpass, "geetha369");
	}

}
