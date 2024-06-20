package seleniumrevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class regpag {

	public static void main(String[] args) {

		String browsername = "chrome";
		
		Brutil bu = new Brutil();
		WebDriver driver = bu.initDriver(browsername);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confpass = By.id("input-confirm");
		
		Eleutil eu = new Eleutil(driver);
		
	
		eu.doSendKeys(firstname, "geetha");
        eu.doSendKeys(lastname, "krishna");
        eu.doSendKeys(email, "geetha@gmail.com");
        eu.doSendKeys(telephone, "9848107894");
        eu.doSendKeys(password, "geetha369");
        eu.doSendKeys(confpass, "geetha369");	
}
}
