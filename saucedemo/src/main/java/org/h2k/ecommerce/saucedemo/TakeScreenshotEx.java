package org.h2k.ecommerce.saucedemo;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshotEx {
	static WebDriver driver;

	public static void main(String args[]) throws IOException, AWTException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		driver.manage().window().maximize();
		//Generate today's date and time
		captureScreenshotviaSelenium("Seleniumscreentshot");
		captureScreenshot("SeleniumFullScreentshot");
		
		
	}
	public static void captureScreenshotviaSelenium(String fileName) throws IOException
	{
		TakesScreenshot tsh = (TakesScreenshot) driver;
		File screenshotFile = tsh.getScreenshotAs(OutputType.FILE);
		System.out.println("File Path::"+ screenshotFile.getAbsolutePath());
		File outputFile = new File(fileName+generateDate()+".jpg");
		FileUtils.copyFile(screenshotFile,outputFile );
	}
	public static void captureScreenshot(String fileName) throws AWTException, IOException
	{
		Robot robot = new Robot();
		Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage buffImg = robot.createScreenCapture(rect);
		File f = new File(fileName+generateDate()+".jpg");
		ImageIO.write(buffImg,"jpg",f);
		
	}
	public static String generateDate()
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());
		//Convert the date into specific format
		//dd-MM-YYYY_HH_mm_ss
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY_HH_mm_ss");
		String date = sdf.format(cal.getTimeInMillis());
		System.out.println("Formatted Date:"+date);
		return date;
		
		
		
	}
}
