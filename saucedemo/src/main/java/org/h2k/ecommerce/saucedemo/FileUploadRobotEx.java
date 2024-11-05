package org.h2k.ecommerce.saucedemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadRobotEx {
	public static void main(String[] args) throws InterruptedException, AWTException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("file-upload")));
		action.click();
		action.perform();
		Thread.sleep(2000);
		
		File f = new File("Selenium.jpg");
		String fullpath = f.getAbsolutePath();
		setClipboardData(fullpath);
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		boolean result = wait.until(ExpectedConditions.textToBe(By.tagName("h3"),"File Uploaded!"));
		if(result == true)
		{
			System.out.println("File uploaded successfully");
		}
		else
		{
			System.out.println("File is not uploaded successfully");
		}


	}
	public static void setClipboardData(String string) {
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}

}
