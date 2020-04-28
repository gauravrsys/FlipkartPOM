package com.flipkart.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public FileInputStream fis;
	
	public TestBase() 
	{
		prop= new Properties();
		try {
			fis = new FileInputStream("/media/gaurav/BA92AE4892AE0949/ReloadOne/FlipkartTest/src/main/java/com/flipkart/config/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void initialization()
	{
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/gaurav/Downloads/chromedriver2");
			driver= new ChromeDriver();
		}
		
		else if(prop.getProperty("browser").equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "/home/gaurav/Downloads/geckodriver");
			driver= new FirefoxDriver();
		}
		
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		
	}
	
	

}
