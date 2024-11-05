package org.h2k.ecommerce.saucedemo;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	
	
	public static void main(String args[]) throws IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		String parentWindowTitle= driver.getTitle();
		System.out.println("parentWindowTitle" + parentWindowTitle);
		
		driver.findElement(By.id("Register")).click();
		
		//Alert
		Alert alrt = driver.switchTo().alert();
		String validationTextMsg = alrt.getText();
		System.out.println(validationTextMsg);
		
		alrt.accept();//click on ok
		
		//alrt.dismiss();//click on cancel
		
		 
		
	}
}

