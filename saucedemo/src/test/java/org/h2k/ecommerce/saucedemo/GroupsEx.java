package org.h2k.ecommerce.saucedemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GroupsEx {

	@Test(groups= {"sanity","regression"})
	public void login(){//failed
		
		assertEquals(false,true);

	}
	@Test(groups= {"sanity","regression"})
	public void logout(){//failed
		
		 

	}
	 
	@Test(groups= { "regression"})
	public void search(){//failed
		
		 

	}
	 
	 
}
