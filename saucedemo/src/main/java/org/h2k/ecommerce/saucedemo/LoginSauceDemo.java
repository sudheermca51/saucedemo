package org.h2k.ecommerce.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSauceDemo {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String title = driver.getTitle();
		System.out.println("Title::" + title);
		
		//Login Steps
//		Identification			Action
//		id="user-name"			sendKeys [ Enter Text ]
//		id="password"			sendKeys [ Enter Text ]
//		id="login-button"       click   
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//Add to Cart
//		id= add-to-cart-sauce-labs-backpack click
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

//		Shopping Cart Link
//		class="shopping_cart_link"
		driver.findElement(By.className("shopping_cart_link")).click();
		
//		Checkout
//		id="checkout"		
		driver.findElement(By.id("checkout")).click();
		
		
		//id="first-name"
		//id="last-name"
		//id="postal-code"
		//id="continue"
		driver.findElement(By.id("first-name")).sendKeys("QAAUTFNAME");
		driver.findElement(By.id("last-name")).sendKeys("QAAUTLNAME");
		driver.findElement(By.id("postal-code")).sendKeys("60001");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		String expected="Thank you for your order!";
		String actual = driver.findElement(By.tagName("h2")).getText();
		
		
		if(actual.equals(expected))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fails");
		}
		
		//click on div 
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		//logout
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		driver.quit();
		
		
		
		
		
		
				
	}
  
}
