package org.h2k.ecommerce.saucedemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@DataProvider(name="DP")
	public String[][] fetchXLSXData() throws IOException
	{
		String data[][]= JavaUtility.readXLSX("inputdata.xlsx", "sanity");
		return data;
		
		
	}
	
	
	@Test(dataProvider="DP")
	public void login(String username,String password)
	{
		System.out.println("username::" + username);
		System.out.println("password::" + password);
	}

}
