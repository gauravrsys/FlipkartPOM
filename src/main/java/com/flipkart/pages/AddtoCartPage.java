package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.util.Utility;

public class AddtoCartPage extends TestBase {
	
	@FindBy(xpath="//*[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	WebElement addtocart;
	
	public AddtoCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ViewCartPage addToCart()
	{
		Utility.switchingChildWindow();
		addtocart.click();
		Utility.staticWait();
		return new ViewCartPage();
	}

}
