package org.h2k.saucedemo.tests;

import org.h2k.saucedemo.pages.HomePage;
import org.h2k.saucedemo.pages.LoginPage;
import org.h2k.saucedemo.pages.ProductsPage;
import org.h2k.util.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoSanityTests extends BaseClass{


	@Test 
	public void verifyAddToCart()
	{

		LoginPage lPage = new LoginPage(driver);
		lPage.login();
		ProductsPage productsPage =new ProductsPage(driver);
		String expected = productsPage.addToCart();
		String actual = productsPage.navigateToCart();
		HomePage hPage = new HomePage(driver);
		hPage.logout();
		Assert.assertEquals(actual,expected);

	}
	
	public void removeCart() {
		
	}
//	@Test
//	public void validateItemsinCart()
//	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.zillow.com/");
//		System.out.println("Fetching the title::" + driver.getTitle());
//		driver.close();
//		 
//	}
//	@Test(enabled=false)
//	public void deleteItemsFromCart()
//	{
// 
//		LoginPage lPage = new LoginPage(driver);
//		System.out.println("In Delete Items From Cart");
// 
//	}




}
