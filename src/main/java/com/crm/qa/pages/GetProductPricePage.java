package com.crm.qa.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class GetProductPricePage extends TestBase {
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCartBtn;
	
	public GetProductPricePage(){
		PageFactory.initElements(driver, this);
	} // End of constructor.
	
	
	
	public void getProductPrice() {
		try {
			Thread.sleep(2000);			
			List<WebElement> productNames = driver
					            .findElements(By.xpath("//div[@class='inventory_item_name']"));
			List<WebElement> productPrices = driver
					           .findElements(By.xpath("//div[@class='inventory_item_price']"));	
			
			WebElement header = driver.findElement(By.xpath("//div[@class='app_logo']"));
			String text=header.getText();
			for(int i=0; i<productNames.size();i++)
			{
				System.out.println(productNames.get(i).getText() + " : " + productPrices.get(i).getText());
			}
			
			System.out.println("fetched all the product names and prices");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in fetching product name and prices").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}

}
