package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;
import com.flipkart.util.Utility;

public class ViewCartPage extends TestBase {
	
	@FindBy(xpath="//*[text()='Remove']")
	WebElement removelink;
	
	@FindBy(xpath="//*[@class='gdUKd9 _3Z4XMp _2nQDKB' and text()='Remove']")
	WebElement removebtn;
	
	public ViewCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SearchProduct removeProduct()
	{
		removelink.click();
		removebtn.click();
		driver.close();
		Utility.switchingParentWindow();
		return new SearchProduct();
	}

}
