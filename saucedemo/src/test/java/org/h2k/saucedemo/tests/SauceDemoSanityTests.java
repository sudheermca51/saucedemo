package org.h2k.saucedemo.tests;

import org.h2k.saucedemo.pages.HomePage;
import org.h2k.saucedemo.pages.LoginPage;
import org.h2k.saucedemo.pages.ProductsPage;
import org.h2k.util.BaseClass;
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




}
