package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;
import com.flipkart.util.Utility;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//input[@class='LM6RPg']")
	WebElement searchbox;
	
	@FindBy(xpath="//*[@class='vh79eN']")
	WebElement searchbtn;
	
	@FindBy(xpath="//*[@class='_2aUbKa']")
	WebElement logoutpt;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement logoutbtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	

	
	//Actions/Methods
	public String homePageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public SearchProduct search(String productname) {
		
		Utility.staticWait();
		searchbox.sendKeys(productname);
		searchbtn.click();
		return new SearchProduct();
	}
	
	public LoginPage logout()
	{
		
		Utility.staticWait();
		Actions ac= new Actions(driver);
		ac.moveToElement(logoutpt).build().perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		logoutbtn.click();
		return new LoginPage();
		
	}

}
