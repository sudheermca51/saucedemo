package org.h2k.ecommerce.saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitExamples_Timer {
	
	public static void main(String[] args) throws InterruptedException {
		
	 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");	
		WebElement timerButton = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
		timerButton.click();
		
//	 	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1));
//	 	WebElement result = wait1.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("demo")),"WebDriver"));
//		
		
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(2))
			       .pollingEvery(Duration.ofSeconds(1))
			       .ignoring(NoSuchElementException.class);

		boolean	   result  = wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("demo")),"abc"));
		
		System.out.println("Text Found:: " + result);
		 
		 
	}

}
