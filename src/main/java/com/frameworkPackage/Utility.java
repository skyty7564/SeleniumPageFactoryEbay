package com.frameworkPackage;
import org.openqa.selenium.WebDriver;
public class Utility {
	
	private WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public Utility(WebDriver driver) {
		this.driver = driver;
	}
	public  void launchSite()
	{
		
		driver.get("https://www.ebay.com/");
	}
	public void closeDriver()
	{
		driver.close();
	}
}
