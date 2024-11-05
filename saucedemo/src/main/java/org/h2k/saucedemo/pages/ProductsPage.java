package org.h2k.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

	WebDriver driver;
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String addToCart() {
	 	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		return 	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).getText();

	}
	public String navigateToCart() {
	 
		driver.findElement(By.id("shopping_cart_link")).click();
		return driver.findElement(By.id("inventory_item_name")).getText();

	}
}
