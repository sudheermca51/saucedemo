package org.h2k.ecommerce.saucedemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfAnnotations {
	
	@Test
	public void m1()
	{
		
	}
	@Test
	public void m2()
	{
		
	}
	@Test(groups= {"sanity"})
	public void m3()
	{
		
	}

	@BeforeSuite
	public void beforeSuite()
	{}

	@AfterSuite
	public void afterSuite()
	{}
	
	@BeforeTest
	public void beforeTest()
	{}

	@AfterTest
	public void afterTest()
	{}
	
	@BeforeGroups(groups="sanity")
	public void beforeGroups()
	{}
	
	@AfterGroups(groups="sanity")
	public void afterGroups()
	{}
	
	@BeforeClass
	public void beforeClass()
	{}
	@AfterClass
	public void afterClass()
	{}

	@BeforeMethod
	public void beforeMethod()
	{}

	@AfterMethod
	public void afterMethod()
	{}
}
