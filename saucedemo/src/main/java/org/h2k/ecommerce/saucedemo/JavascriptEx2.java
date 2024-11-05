package org.h2k.ecommerce.saucedemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptEx2 {
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		Object obj = jse.executeScript("return document.title");
		String title= (String) obj;
		System.out.println("Title :: " + title);
		
		jse.executeScript("document.getElementsByTagName(\"h4\")[0].scrollIntoView()");
		 
		
		
	}

}
