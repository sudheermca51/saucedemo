package org.h2k.ecommerce.saucedemo;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class TestngEx1 {
	
	@Test(priority=1,description="Execitomg the m2")
	public void m2()
	{
	      System.out.println("Thread ID: "+Thread.currentThread().getId());

		
	}
	@Test(priority=3,description="Executing the m3")
	public void m1()
	{
	      System.out.println("Thread ID: "+Thread.currentThread().getId());

	}
	@Test(priority=4)
	public void m3()
	{
		 
	      System.out.println("Thread ID: "+Thread.currentThread().getId());

		
	}

}
