package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class OrderProductPage extends TestBase{
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCartBtn;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement validateAddToCartBtn;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement cartBtn;

	@FindBy(id ="checkout")
	private WebElement checkoutBtn;
	
	@FindBy(id ="first-name")
	private WebElement firstName;
	
	@FindBy(id ="last-name")
	private WebElement lastName;
	
	@FindBy(id ="postal-code")
	private WebElement postalCode;
	
	@FindBy(id ="continue")
	private WebElement continueBtn;
	
	@FindBy(id ="finish")
	private WebElement finishBtn;

	public OrderProductPage(){
		PageFactory.initElements(driver, this);
	} // End of constructor.


	public void addToCart() {
		try {
			Thread.sleep(2000);
			addToCartBtn.click();
			Assert.assertTrue(validateAddToCartBtn.isDisplayed());
			System.out.println("add to cart button Clicked and validated");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in clicking add to cart button").append(e.getMessage());
			System.out.println(e.getMessage());
			Assert.assertTrue(false);
		}
	}

	public void cart() {
		try {
			Thread.sleep(2000);
			cartBtn.click();
			Assert.assertTrue(checkoutBtn.isDisplayed());
			System.out.println("cart button Clicked and validated");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in clicking cart button").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public void checkOut() {
		try {
			Thread.sleep(2000);
			checkoutBtn.click();
			Assert.assertTrue(continueBtn.isDisplayed());
			System.out.println("checkout button Clicked and validated");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in clicking checkout button").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public void firstName(String name) {
		try {
			Thread.sleep(2000);
			firstName.sendKeys(name);
			System.out.println("first name entered");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in entering first name").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public void lastName(String name) {
		try {
			Thread.sleep(2000);
			lastName.sendKeys(name);
			System.out.println("last name entered");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in entering last name").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public void postalCode(String code) {
		try {
			Thread.sleep(2000);
			postalCode.sendKeys(code);
			System.out.println("postal code entered");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in entering postal code").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public void continueClick() {
		try {
			Thread.sleep(2000);
			continueBtn.click();
			Assert.assertTrue(finishBtn.isDisplayed());
			System.out.println("continue button Clicked and validated");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in clicking continue button").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public void finish() {
		try {
			Thread.sleep(2000);
			finishBtn.click();
			WebElement thankYou = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
			Assert.assertEquals(thankYou.getText(), "Thank you for your order!");
			System.out.println("finish button Clicked and validated");
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in clicking finish button").append(e.getMessage());
			System.out.println(e.getMessage());
		}
	}

}
