package testNGSessions;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest {
	
	
	
	
	
	@DataProvider
	public Object[][] credentialsData()
	{
		Object a[][] = new Object[][] {{"dfdfdfs","765448"}, {"uioyuyts", "shjui876"}, {"234567898", "fdfgh@gmsil"}};
		return a;
		
	}
	
	
	
	
	@Test(dataProvider="credentialsData")
	public void loginTest(String userName, String passWord)
	{
		Assert.assertTrue(doLogin(userName, passWord));
				
	}
	
	public boolean doLogin(String userName, String passWord)
	{
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);	
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text =driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		
		if(text.contains("No match for E-Mail Address and/or Password"))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	
		
		}
	

	
	

}
