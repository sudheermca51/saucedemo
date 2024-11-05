package org.h2k.ecommerce.saucedemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptEx {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		Object obj = jse.executeScript("return document.title");
		String title= (String) obj;
		System.out.println("Title :: " + title);
		
		obj = jse.executeScript("return document.getElementById(\"clickable\").value=\"Selenium\"");
		title= (String) obj;
		System.out.println("String value set :: " + title);
		
		
	}
}
