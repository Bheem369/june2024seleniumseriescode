package testNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepagetest extends BaseTest {
	
	@BeforeSuite
	public void startDBConnection()
	{
		System.out.println("BS- start DB connection");
	}
	
	@BeforeTest
	public void createUser()
	{
		System.out.println("BT- create user");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC- launchBrowser");
	}
	
	@BeforeMethod
	public void loginApp()
	{
		System.out.println("BM - loginApp");
	}
	
	
	@Test
	public void homepageURLTest()
	{
		System.out.println("homepageURLTest");
	}
	
	
	@Test
	public void homepageTitleTest()
	{
		System.out.println("homepageTitleTest");
	}
	
	@Test
	public void homepageSearchTest()
	{
		System.out.println("homepageSearchTest");
	}
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("AM -logout");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AC - closeBrowser");
	}
	
	@AfterTest
	public void deleteUser()
	{
		System.out.println("AT- delete user");
	}
	
	@AfterSuite
	public void closeDBConnection()
	{
		System.out.println("AS - closeDBconnection");
	}
	
	
	
	

}
