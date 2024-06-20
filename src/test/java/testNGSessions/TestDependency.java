package testNGSessions;

import org.testng.annotations.Test;

public class TestDependency  {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void searchTest()
	{
		System.out.println("SearchTest");
		int i = 9/0;
		System.out.println(i);
		
	}
     
	@Test(dependsOnMethods = "searchTest")
	public void addToCart()
	{
		System.out.println("AddToCart");
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void makePayment()
	{
		System.out.println("MakePayment");
	}
}
