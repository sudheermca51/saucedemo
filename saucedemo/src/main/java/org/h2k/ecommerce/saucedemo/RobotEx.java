package org.h2k.ecommerce.saucedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotEx {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/"); // sample url
		Robot robot = new Robot();
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_UP);
		Thread.sleep(4000);
		System.out.println("Displaying the text");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.mouseMove(30, 200);
		
	}

}
