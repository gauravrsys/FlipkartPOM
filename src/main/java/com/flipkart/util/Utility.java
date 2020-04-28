package com.flipkart.util;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.base.TestBase;

public class Utility extends TestBase {
	
	public static String parentid;
	public static String childid;
	
	public static void staticWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	public static void dynamicWait(WebElement ele) {
		WebDriverWait wt= new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void switchingChildWindow() {
		Set <String>win= driver.getWindowHandles();
		Iterator<String>it= win.iterator();
		parentid=it.next();
		childid=it.next();
		//System.out.println(parentid+" and "+childid);
		driver.switchTo().window(childid);
	}
	
	public static void switchingParentWindow() {
		driver.switchTo().window(parentid);
	}
}
