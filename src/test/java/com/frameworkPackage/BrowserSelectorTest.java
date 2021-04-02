package com.frameworkPackage;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.uiPackage.EbayHomePage;
import com.uiPackage.EbayProductPage;

public class BrowserSelectorTest {

	@Test
	public void test() {
		WebDriver driver = BrowserSelector.getDriver("Chrome");
		EbayHomePage homePage = PageFactory.initElements(driver, EbayHomePage.class);
		homePage.launchSite();
		homePage.searchString("iphone");
		EbayProductPage productPage = PageFactory.initElements(driver, EbayProductPage.class);
		productPage.getProduct();
		productPage.displayProduct();
		driver.close();
		

		
	}
	
	
}
