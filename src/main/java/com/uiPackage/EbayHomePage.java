package com.uiPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.frameworkPackage.Utility;

public class EbayHomePage extends Utility {
	
	WebDriver driver;

	
	public EbayHomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}


	@FindBy(how=How.ID,using="gh-ac")
	@CacheLookup
	WebElement searchInput;
	
	
	@FindBy(how=How.ID,using="gh-btn")
	@CacheLookup
	WebElement searchBtn;
	
	
	public void searchString(String search)
	{
		searchInput.sendKeys(search);
		searchBtn.click();
	}
	
	
	
}
