package org.h2k.ecommerce.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsEx {

	public static void main(String[] args) {
		
		/*
		 * pressing down on a button
		 * release a button
		 *  moving the mouse
		 *
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		WebElement droppableWE=driver.findElement(By.id("droppable"));
		WebElement draggableWE=driver.findElement(By.id("draggable"));
		Actions mAction = new Actions(driver);
		mAction.clickAndHold(draggableWE);
		mAction.moveToElement(droppableWE);
		mAction.release(draggableWE);
		mAction.perform();
		
		String result = driver.findElement(By.id("drop-status")).getText();
		System.out.println("Result :::" + result);
		
		WebElement hoverWE = driver.findElement(By.id("hover"));
		mAction.moveToElement(hoverWE);
		mAction.perform();
		
		result = driver.findElement(By.id("move-status")).getText();
		System.out.println("Move Status:::" + result);
		
		 
		WebElement clickableWE= driver.findElement(By.id("clickable"));
		mAction.contextClick(clickableWE);
		mAction.perform();
		
		result = driver.findElement(By.id("click-status")).getText();
		System.out.println("Context Click Status:::" + result);
		
		mAction.doubleClick(clickableWE);
		mAction.perform();
		
		result = driver.findElement(By.id("click-status")).getText();
		System.out.println("Context Click Status:::" + result);
		
		
		
	}
}
