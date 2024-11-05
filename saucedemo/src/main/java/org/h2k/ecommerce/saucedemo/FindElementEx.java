package org.h2k.ecommerce.saucedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementEx {
	public static void main(String args[])  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement e = driver.findElement(By.xpath("//input"));
		e.sendKeys("standard_user");
		
		
		WebElement e1 = driver.findElement(By.xpath("//input1"));
		e1.sendKeys("standard_user");
	}
}
