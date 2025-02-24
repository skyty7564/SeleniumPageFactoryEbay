package com.frameworkPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector {
	private static WebDriver driver;
	
	public BrowserSelector()
	{
		
	}
	
	public static WebDriver getDriver(String browserName)
	{
		String path = System.getProperty("user.dir");
		if(driver == null)
		{
			if(browserName.equalsIgnoreCase("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver",  path+"/drivers/chromedriver_linux64/chromedriver");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless","--window-size=1920,1200");
		//	System.setProperty("webdriver.chrome.driver",  path+"\\drivers\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver(options);
				
				
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "D:\\EbayMaven\\src\\main\\resources\\geckodriver-v0.29.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		}
		
		return driver;
		
	}
	

}