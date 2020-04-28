package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.util.Utility;

public class SearchProduct extends TestBase {
	
	@FindBy(xpath="//*[@class='_2cLu-l' and text()='Shop At Bargain Anti pollution & virus protection face ...']")
	WebElement product;
	
	public SearchProduct() {
		PageFactory.initElements(driver, this);
	}
	
	public AddtoCartPage clickOnProduct()
	{
		Utility.staticWait();
		product.click();
		return new AddtoCartPage();
	}

}
