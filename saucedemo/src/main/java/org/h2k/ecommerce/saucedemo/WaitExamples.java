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

public class WaitExamples {
	
	public static void main(String[] args) throws InterruptedException {
		
		//https://github.com/SeleniumHQ/seleniumhq.github.io/blob/trunk/examples/java/src/test/java/dev/selenium/waits/WaitsTest.java#L50
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement reveal = driver.findElement(By.id("reveal"));
		reveal.click();
		
	 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement revealed = wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.id("revealed"))));
		revealed.sendKeys("Its revealed Finally!!!!!!!!!!!!");
		
		
		WebElement adder = driver.findElement(By.id("adder"));
		adder.click();
		
		//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebElement.html#getCssValue(java.lang.String)
		
//		WebElement redBox = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("box0"))));
//		String textboxColor = redBox.getCssValue("background-color");
//		System.out.println(textboxColor);
		
		outer:
		for(int i =0 ;i < 30;i++)
		{
			
			try{
				WebElement redBox =driver.findElement(By.id("box0")); 
				while(redBox.isDisplayed())
				{
					String textboxColor = redBox.getCssValue("background-color");
					System.out.println("Identified the elemenet:"+ textboxColor);
					break outer;
				}
			}
			catch(Exception e)
			{
				System.out.println("In Catch Block :: Not Able to identy");
			}
			 
			Thread.sleep(10000);
		}
		
		
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			       .withTimeout(Duration.ofSeconds(30L))
//			       .pollingEvery(Duration.ofSeconds(5L))
//			       .ignoring(NoSuchElementException.class);
//
//			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//			     public WebElement apply(WebDriver driver) {
//			       return driver.findElement(By.id("foo"));
//			     }
//			   });
	}

}
