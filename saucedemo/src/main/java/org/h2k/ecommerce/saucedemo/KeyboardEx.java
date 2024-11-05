package org.h2k.ecommerce.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEx {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * pressing down on a button
		 * release a button
		 *  moving the mouse
		 *
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");
		WebElement ele = driver.findElement(By.id("textInput"));
		Actions kActions = new Actions(driver);
		kActions.keyDown(Keys.SHIFT);
		kActions.sendKeys(ele, "selenium webdriver");
		kActions.keyUp(Keys.SHIFT);
		kActions.perform();
		
	 
		Thread.sleep(2000);
		kActions.keyDown(Keys.CONTROL);
		kActions.sendKeys(Keys.chord("A"),Keys.BACK_SPACE);
		kActions.keyUp(Keys.CONTROL);
		kActions.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
