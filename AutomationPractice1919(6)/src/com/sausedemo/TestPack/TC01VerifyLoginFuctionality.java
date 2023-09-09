package com.sausedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01VerifyLoginFuctionality extends TestBaseClass
{
	@Test
	public void verifyLoginFuctionality()
	{
		
		System.out.println("Apply Verifiaction");
		
		String expectedresult="Swag Labs";
		
		String actualresult=driver.getTitle();
		
		Assert.assertEquals(actualresult, expectedresult);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
