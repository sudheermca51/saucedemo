package org.h2k.ecommerce.saucedemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchHyperLinks {
	public static void main(String args[]) throws IOException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.carregistration.com/");
		
		List<WebElement> hyperLinkList = driver.findElements(By.xpath("//a"));
		
		System.out.println("Size of the hyperlinks"+ hyperLinkList.size());
		
		for(int i = 0 ; i < hyperLinkList.size();i++)
		{
			WebElement e = hyperLinkList.get(i);
			String url = e.getAttribute("href");
			//send the url and fetch the response code
			//if the response code is 200 the link is working fine
			URL hyperLinkURL = new URL(url);
			URLConnection urlConnection = hyperLinkURL.openConnection();
			HttpURLConnection httpConnection = (HttpURLConnection) urlConnection;
			httpConnection.connect();
			System.out.println("HyperLink Link Details:::"   + e.getAttribute("href") +"Status Code::"+ httpConnection.getResponseCode());
			 
		}
		
	}

}
