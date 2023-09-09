package com.sausedemo.TestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sausedemo.POMPack.LoginPOMClass;

public class TestBaseClass
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		driver=new ChromeDriver();
		System.out.println("Browser is Open");
				
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is open");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		LoginPOMClass lp=new LoginPOMClass(driver);
		
		lp.sendUsername();
		System.out.println("Username is Enter");
		
		lp.sendPassword();
		System.out.println("Password is Enter");
		
		lp.clickLoginbtn();
		System.out.println("LoginBtn is Enter");		
	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
		System.out.println("Browser is closed");
		System.out.println("End of Programm");
		
	}
	
	
	
	

}
