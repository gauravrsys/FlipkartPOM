package com.flipkart.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.AddtoCartPage;
import com.flipkart.pages.HomePage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProduct;
import com.flipkart.pages.ViewCartPage;

public class AddtocartPageTest extends TestBase {
	
	public LoginPage lp;
	public HomePage hp;
	public SearchProduct sp;
	public AddtoCartPage cp;
	public ViewCartPage vp;
	
	
	public AddtocartPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		TestBase.initialization();
		lp=new LoginPage();
		hp= lp.login(prop.getProperty("username"), prop.getProperty("password"));
		sp = hp.search(prop.getProperty("product"));
		cp= sp.clickOnProduct();
	}
	
	@Test(priority=1)
	public void addToCartTest() {
		vp= cp.addToCart();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
