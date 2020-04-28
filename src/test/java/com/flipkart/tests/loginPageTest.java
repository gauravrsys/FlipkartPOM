package com.flipkart.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginPage;

public class loginPageTest extends TestBase {
	
	public LoginPage lp;
	public HomePage hp;
	
	public loginPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		TestBase.initialization();
		lp = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginTest()
	{
		hp= lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
			

}
