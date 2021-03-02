package com.uiPackage;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.frameworkPackage.Utility;
import com.model.EbayProductModel;

public class EbayProductPage extends Utility {
	


	WebDriver driver;
	public EbayProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	
	}

	private HashSet<EbayProductModel> products = new HashSet<EbayProductModel>();
	
	
	public void getProduct()
	{
	
		List<WebElement> listOfProduct = driver.findElements(By.className("s-item__title"));
		List<WebElement> priceOfProduct = driver.findElements(By.className("s-item__price"));	
	
		for (int i = 0; i < listOfProduct.size() ; i++ )
		{
			String description = listOfProduct.get(i).getText();
			String price = priceOfProduct.get(i).getText();
			EbayProductModel prod = new EbayProductModel();
			prod.setDescription(description);
			prod.setPrice(price);
			products.add(prod);
		}
		
	}
	public void displayProduct()
	{
		System.out.println("Item Info");
		for(EbayProductModel prod : products)
		{

			System.out.println("Item Description:"+prod.getDescription());
			System.out.println("Item Price:"+prod.getPrice());
			System.out.println("-------------------------------------------------");
			
		}
	}
}
