package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//*[@class='_2AkmmA _29YdH8']")
	WebElement closebtn;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginbtn1;
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement username;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement password;
	
	@FindBy(xpath="//*[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginbtn2;
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		//HomePage homepage= new HomePage();
	}
	
	public HomePage login(String un, String pwd)
	{
		closebtn.click();
		loginbtn1.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn2.click();
		
		return new HomePage();
		
	}

}
