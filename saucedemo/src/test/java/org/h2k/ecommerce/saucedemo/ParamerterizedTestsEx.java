package org.h2k.ecommerce.saucedemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamerterizedTestsEx {

	@Test(groups= {"sanity","regression"})
	@Parameters({"username","password"})
	public void login(String username,String password)
	{
		System.out.println("username::"+ username);
		System.out.println("password::"+password);
 
	}
	@Parameters({"key1"})
	@Test(groups= {"sanity","regression"})
	public void logout(String key1){//failed
		
		 	System.out.println(key1);

	}
	 
	@Test(groups= { "regression"})
	public void search(){//failed
		
		 

	}
	 
	 
}
