package org.h2k.ecommerce.saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExamples_Timer {
	
	public static void main(String[] args) throws InterruptedException {
		
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");	
		WebElement timerButton = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
		timerButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
		boolean result = wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("demo")),"WebDriver"));
		if(result==true)
		{
			System.out.println("Text Found WebDriver");
		}
		 
	}

}
