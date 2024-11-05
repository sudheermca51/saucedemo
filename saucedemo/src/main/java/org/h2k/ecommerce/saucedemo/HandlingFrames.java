package org.h2k.ecommerce.saucedemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	
	public static void main(String args[]) throws IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String parentWindowTitle= driver.getTitle();
		System.out.println("parentWindowTitle" + parentWindowTitle);
		
		//Navigate to Child Window
		//id or name or index starts with zero
		//NoSuchFrameException
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.id("query")).sendKeys("TCS");
		driver.findElement(By.className("getqbtn")).click();
		
		//Navigate to Parent Window
		driver.switchTo().defaultContent();
		
		parentWindowTitle= driver.getTitle();
		System.out.println("parentWindowTitle" + parentWindowTitle);
		 
		
		
		
	}
}

