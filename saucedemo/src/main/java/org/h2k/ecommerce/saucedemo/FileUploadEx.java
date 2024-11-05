package org.h2k.ecommerce.saucedemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadEx {
	public static void main(String[] args) throws InterruptedException {

	 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		int         i   = 10;
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement uploadButton = driver.findElement(By.id("file-upload"));
		File f = new File("config//uploadfile.txt");
		System.out.println("The full path of the file::: " + f.getAbsolutePath());
		uploadButton.sendKeys(f.getAbsolutePath());
	}

}
