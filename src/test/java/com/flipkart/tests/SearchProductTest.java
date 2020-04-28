package com.flipkart.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.AddtoCartPage;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProduct;

public class SearchProductTest extends TestBase {
	
	public LoginPage lp;
	public HomePage hp;
	public SearchProduct sp;
	public AddtoCartPage cp;
	
	
	public SearchProductTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		TestBase.initialization();
		lp=new LoginPage();
		hp= lp.login(prop.getProperty("username"), prop.getProperty("password"));
		sp= hp.search(prop.getProperty("product"));
	}
	
	@Test(priority=1)
	public void clickOnProductTest()
	{
		cp= sp.clickOnProduct();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
