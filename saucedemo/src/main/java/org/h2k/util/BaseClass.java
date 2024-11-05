package org.h2k.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
 
	protected WebDriver driver;
	@BeforeClass
	public void instantiateDriver()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		 
	}

}
