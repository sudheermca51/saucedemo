package org.h2k.ecommerce.saucedemo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesEx {


	public static void main(String[] args) throws InterruptedException {

		/*
		 * pressing down on a button
		 * release a button
		 *  moving the mouse
		 *
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");
		Cookie cookie = new Cookie("selenium", "seleniumwebdriver");
		driver.manage().addCookie(cookie);
		
		cookie = driver.manage().getCookieNamed("selenium");
		System.out.println("Fetched the cookie value"  + cookie);
		
		driver.manage().deleteCookieNamed("selenium");
		
		driver.manage().deleteAllCookies();
		
		cookie = driver.manage().getCookieNamed("selenium");
		System.out.println("Fetched the cookie value after deletion"  + cookie);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
