package org.h2k.ecommerce.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateBackForwardEx {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click for Results Page")).click();
		
		driver.navigate().back();
		System.out.println("Title::"+ driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("Title::"+ driver.getTitle());
		
		driver.navigate().to("https://www.javadoc.io/doc/org.seleniumhq.selenium/selenium-api/2.2.0/org/openqa/selenium/JavascriptExecutor.html");
		
		driver.navigate().refresh();
		
	}

}
