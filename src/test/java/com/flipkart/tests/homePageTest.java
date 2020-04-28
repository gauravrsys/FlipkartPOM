package com.flipkart.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProduct;

public class homePageTest extends TestBase{
	
	public LoginPage lp;
	public HomePage hp;
	public SearchProduct sp;
	
	public homePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		TestBase.initialization();
		lp=new LoginPage();
		hp= lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void homePageTitleTest()
	{
		String title=hp.homePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority=2)
	public void searchProductTest()
	{
		sp = hp.search(prop.getProperty("product"));
	}
	
	@Test(priority=3)
	public void logoutTest()
	{
		lp= hp.logout();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
